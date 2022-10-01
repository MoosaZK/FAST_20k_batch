package sir_task2;

class TwoGen<T, V> { 
	T ob1;
	V ob2;
	
	// Pass the constructor a reference to an object of type T and type V.
	TwoGen(T o1, V o2) {
		ob1 = o1; ob2 = o2;
	}

	//Show types of T and V.
	void showTypes() { 
		System.out.println("KHJUZEMA Type of T is " + ob1.getClass().getName());
		System.out.println("KHUZEMA Type of V is " + ob2.getClass().getName());
	}
	
	T getob1() { 
		return ob1;
	}
	
	V getob2() { 
		return ob2;
	}
}
