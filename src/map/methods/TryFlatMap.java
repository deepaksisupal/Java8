package map.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import map.data.Document;
import map.data.Plan;

public class TryFlatMap {

	public static void main(String[] args){
		List<Plan> planList = populatePlans();
		planList.stream().forEach(System.out::println);
		
		
		
		List<List<Document>> docList = planList.stream().map(plan -> plan.getDocuments()).collect(Collectors.toList());
		System.out.println(docList.size());
		docList.forEach(System.out::println);
		
		
		System.out.println("*******************");
		List<Document> docList2 = planList.stream().map(plan -> plan.getDocuments()).flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(docList2.size());
		docList2.forEach(System.out::println);
		
		System.out.println("*******************");
		
		planList.stream().collect(
                Collectors.groupingBy(Item::getPrice,
                        Collectors.mapping(Item::getName, Collectors.toSet())
                ));
		
	}
	private static List<Plan> populatePlans() {
		int planCount = 3;
		
		
		List<Plan> planList = new ArrayList<>();
		while(planCount > 0){
			Plan planBO = new Plan();
			planBO.setNumber(planCount);
			int docCount = 5;
			List<Document> docList = new ArrayList<>();
			while(docCount > 0){
				Document doc = new Document();
				doc.setNumber(docCount);
				doc.setDri(planCount+" - "+docCount);
				docCount--;
				docList.add(doc);
			}
			planBO.setDocuments(docList);
			planList.add(planBO);
			planCount--;
		}
		return planList;
	}
}
