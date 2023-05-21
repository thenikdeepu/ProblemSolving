package Lecture1;

public class AreaOfTriangle {

	public static void main(String[] args) {
		int aSide = 10, bSide = 8, cSide = 4;
		int sP = (aSide + bSide + cSide) / 2;
		System.out.println("SemiPerameter is= " + sP);
		System.out.println("Area of triangle is= " + Math.sqrt(sP * (sP - aSide) * (sP - bSide) * (sP - cSide)));
	}

}
