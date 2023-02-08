package com.test.sexual;

public class Sexual {

	public static void main(String[] args) {
		String[] arr= {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		int gent=0;
		int wom=0;
		for(String var : arr) {
			char sex = var.charAt(7);
			if(sex=='1'||sex=='3') {
				gent++;
			}else if(sex=='2'||sex=='4') {
				wom++;
			}
		}
		System.out.println("남 : "+gent+" 여 : "+wom);
	
		
		int male=0;
		int female=0;
		String[] arr1= {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		for(int i =0;i<arr1.length;i++) {
		String gender = arr[i].substring(7);
		if(gender.equals("1")||gender.equals("3")) {
			male++;
		} else if(gender.equals("2")||gender.equals("4")) {
			female++;
		}
		
		}
		System.out.println("남 : "+male+"여 : "+female);
	}
}
