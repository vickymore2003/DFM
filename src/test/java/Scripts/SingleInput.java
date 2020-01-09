package Scripts;

import org.testng.annotations.Test;

import actions.BaseClass;
import actions.SImpleForm;

public class SingleInput extends BaseClass{
  @Test
  public void f() {
	  SImpleForm form = new SImpleForm();
	  form.simpleInput();
  }
}
