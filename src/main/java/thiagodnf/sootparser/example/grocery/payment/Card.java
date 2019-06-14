->RefactoringNumber->89475<-PushDownMethod(thiagodnf.sootparser.example.grocery.payment.Card;thiagodnf.sootparser.example.grocery.payment.CreditCard;[];[setName])
->RefactoringNumber->89479<-PushDownMethod(thiagodnf.sootparser.example.grocery.payment.Card;thiagodnf.sootparser.example.grocery.payment.CreditCard;[];[setExpirationDate])
->RefactoringNumber->89480<-PullUpMethod(thiagodnf.sootparser.example.grocery.payment.CreditCard;thiagodnf.sootparser.example.grocery.payment.Card;[];[getDiscount])
<-endRefactoring marker->
package thiagodnf.sootparser.example.grocery.payment;

public abstract class Card extends Payment{
	
	protected String expirationDate;
	
	protected String name;
	
	public String flag;

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
