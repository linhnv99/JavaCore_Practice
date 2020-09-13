package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
//		1. ArrayList - non-sync
//		Dạng mảng động
//		Tăng kích thước của nó bằng 50% kích thước mảng
		
		System.out.println("=======ArrayList=======");
		ArrayList<String> dsTen = new ArrayList<>();
		dsTen.add("Linh");
		dsTen.add("Yuu");
		dsTen.add("Lan");
		dsTen.add("Thom");
		dsTen.add("Added");

		// từ list sang array
		String[] ds = new String[dsTen.size()];
		dsTen.toArray(ds);
		// từ array sang list dùng Arrays.asList(array)

//		Iterator<String> itrDS = dsTen.iterator();
//		while(itrDS.hasNext()) {
//			System.out.println(itrDS.next());
//		}
		System.out.println(">>Danh sách ban đầu:");
		printList(dsTen);

		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		Collections.sort(dsTen, c);
		System.out.println(">> Mảng sau khi sắp xếp theo tên: ");
		printList(dsTen);
		// 2.LinkList - Danh sách liên kết cấu trúc để lưu trữ
		// Phần tử này nối đuôi phần tử kia
		// + Ưu điểm tận dụng bộ nhớ tốt
		// + khả năng tăng trưởng k hạn chế
		// + Tốc độ truy cập ngẫu nhiên chậm hơn arrayList
		System.out.println("=======LinkedList========");
		LinkedList<Integer> dsSo = new LinkedList<Integer>();
		dsSo.add(3);
		dsSo.add(6);
		dsSo.add(8);
		dsSo.add(7);
		printList(dsSo);
//		3.Vecto - sync
//		Vector tăng kích thước của nó bằng cách nhân đôi kích thước mảng.
		System.out.println("=======Vecto========");
		List<String> vct = new Vector<String>();
		vct = dsTen;
		printList(vct);
		
		
		System.out.println("==========Important============");
//		4.HashMap
//		Là một triển khai của map interface
//		Lưu trữ dưới dạng các cặp key - value
//		Các key là duy nhất
//		Duy trì phần tử KHÔNG theo thứ tự chèn
//		CHO PHÉP 1 KEY NULL và NHIỀU VALUE NULL
		
//		Lưu ý: nếu trùng key sẽ lấy phần từ được thêm vào cuối cùng
		Map<Integer, String> dssv = new HashMap<Integer, String>();
		dssv.put(1, "Linh");
		dssv.put(2, "Lan");
		dssv.put(3, "Hoàng");
		dssv.put(4, "An");
		printMap(dssv);
		
		
		
//		=======Set chỉ chức phần tử duy nhất 
//		5.HashSet
//		Không chứa phần tử trùng lặp
//		CHỈ CHO PHÉP 1 PHẦN TỬ NULL
//		châm hơn map 1 chút
//		
//		Set<Integer> hashSet = new HashSet<Integer>();
		// là int thì sẽ duy trì theo thứ tự tăng dần 
//		hashSet.add(1);
//		hashSet.add(4);
//		hashSet.add(3);
//		hashSet.add(5);
//		hashSet.add(2);
//		hashSet.add(13);
//		hashSet.add(8);
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Linh");
		hashSet.add("An");
		hashSet.add("Hoàng");
		for (String s : hashSet) {
			System.out.println(s);
		}
//		6. TreeSet
//		Giống hashmap
//		DUY TRÌ THỨ TỰ TĂNG DẦN
		
	}

	// genneric
	private static <T> void printList(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}
	
	private static <K, V> void printMap(Map<K, V> map) {
		Set<K> ks = (Set<K>) map.keySet();// ds các key
		Set<V> entrySet = (Set<V>) map.entrySet();// ds key=value  (tập hợp element)
		for (V v : entrySet) {
			System.out.println(v);
		}
//		for (K k : ks) {
//			System.out.println(map.get(k));
//		}
	}
}
