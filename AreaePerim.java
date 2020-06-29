Scanner sc = new Scanner(System.in);

String perg1 = "\n\tQual o comprimento : ";
String perg2 = "\n\tQual a largura : ";

int comp, larg; 
int area, perimetro;

int admitirNumero(String msg){
int qual;
System.out.print(msg);
qual = sc.nextInt();
return qual;
}

void desenhaArea(int c, int l){
int ct1,ct2;

for (ct1=0; ct1<c; ct1++) {
	for (ct2=0; ct2< l; ct2++) {
		 System.out.print("#");
   }
   System.out.println();
}
}

void desenhaPerimetro(int c, int l) {
int ct1,ct2;

for (ct1=0; ct1<c; ct1++) {
	for (ct2=0; ct2< l; ct2++) {
		 if (ct1==0 || ct1==c-1)
		   System.out.print("#");
		else if (ct2==0  || ct2==l-1)
		    System.out.print("#");
		else
		    System.out.print(" ");

   }
   System.out.println();
}

}


void main() {
comp = admitirNumero(perg1);
larg = admitirNumero(perg2);

area = comp * larg;
perimetro = 2 *comp + 2 * larg;
System.out.printf("\n\tArea = %d m2",area);
System.out.printf("\n\tPerimetro = %d m",perimetro);

System.out.println();

desenhaArea(comp, larg);

System.out.println();

desenhaPerimetro(comp, larg);

System.out.println();
}

main()
