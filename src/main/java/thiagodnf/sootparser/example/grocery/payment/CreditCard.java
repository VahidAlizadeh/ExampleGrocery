->RefactoringNumber->89470<-MoveField(thiagodnf.sootparser.example.grocery.payment.CreditCard;thiagodnf.sootparser.example.grocery.order.Order;[number];[])
->RefactoringNumber->89471<-ExtractClass(thiagodnf.sootparser.example.grocery.payment.CreditCard;Class_2;[];[])
->RefactoringNumber->89473<-IncreaseMethodSecurity(thiagodnf.sootparser.example.grocery.payment.CreditCard;;[];[toString])
->RefactoringNumber->89475<-PushDownMethod(thiagodnf.sootparser.example.grocery.payment.Card;thiagodnf.sootparser.example.grocery.payment.CreditCard;[];[setName])
->RefactoringNumber->89479<-PushDownMethod(thiagodnf.sootparser.example.grocery.payment.Card;thiagodnf.sootparser.example.grocery.payment.CreditCard;[];[setExpirationDate])
->RefactoringNumber->89480<-PullUpMethod(thiagodnf.sootparser.example.grocery.payment.CreditCard;thiagodnf.sootparser.example.grocery.payment.Card;[];[getDiscount])
->RefactoringNumber->89481<-ExtractSubClass(thiagodnf.sootparser.example.grocery.payment.CreditCard;Class_6;[];[])
<-endRefactoring marker->
package thiagodnf.sootparser.example.grocery.payment;

public class CreditCard extends Card{

	protected String number;	
	
	

	public double getDiscount() {

		if (flag.equalsIgnoreCase("Visa")) {
			return 0.1;
		}

		return 0.0;
	}
	
	@Override
	public String toString() {
		return CreditCard.class.getSimpleName();
	}
}
