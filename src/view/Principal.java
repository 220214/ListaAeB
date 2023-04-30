package view;

import br.mari.listaInt.Lista;

public class Principal {

	public static void main(String[] args) {
		int []A= {3,5,8,12,9,7,16};
		int[]B= {9,6,2,3,7,};
		Lista la = new Lista ();
		Lista lb = new Lista ();
		Lista U = new Lista();
		System.out.println("Lista A ");
		for (int i=0; i<A.length;i++) {
			if(la.isEmpty()) {
				la.addFirst(A[i]);
				U.addFirst(A[i]);
				
			}else {
				la.addFirst(A[i]);
				U.addFirst(A[i]);
			}
			try {
				System.out.print("  "+la.get(0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n Lista B ");
		for (int i=0; i<B.length;i++) {
			if(la.isEmpty()) {
				lb.addFirst(B[i]);
				try {
					U.addLast(B[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				lb.addFirst(B[i]);
				try {
					U.addLast(B[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				
				System.out.print("  "+lb.get(0));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n Lista I");
		Lista I = new Lista();
		
		for(int i=0; i<la.size();i++) {
			for(int z =0;z<lb.size();z++) {
				try {
					
					if (la.get(i)==lb.get(z)) {
						I.addFirst(lb.get(z));
						
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for (int i=0; i<I.size();i++) {
			
			for(int j=(i+1);j<(I.size());j++) {
			
					try {
						
						if(I.get(i)>I.get(j)) {
							int aux =I.get(i);
							I.add(I.get(j), i+1);
							I.remova(i);
							I.add(aux,j+1);
							I.remova(j);
						}
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			}
		
		for(int i=0;i<I.size();i++) {
		try {
			System.out.print(" " + I.get(i)+ " ");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
		
			for(int z =0;z<I.size();z++) {
				for(int i=0; i<U.size();i++) {
				try {
					
					if (U.get(i)==I.get(z)) {
						U.remova(i);;
					}
				} catch (Exception e) {
				e.printStackTrace();
				}
			}
				try {
					U.addLast(I.get(z));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			for (int i=0; i<U.size();i++) {
				
				for(int j=(i+1);j<(U.size());j++) {
				
						try {
				
							if(U.get(i)>U.get(j)) {
								int aux =U.get(i);
								U.add(U.get(j), i+1);
								U.remova(i);
								U.add(aux,j+1);
								U.remova(j);
							}
						} catch (Exception e) {
						e.printStackTrace();
						}
					}
				}
		System.out.println("\n Lista U");
		for(int i=0;i<U.size();i++) {
			try {
				System.out.print(" " + U.get(i)+ " ");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

}
	}

