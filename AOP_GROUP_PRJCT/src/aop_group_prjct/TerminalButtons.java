package aop_group_prjct;

import javax.swing.JFormattedTextField;

public class TerminalButtons {

    public TerminalButtons() {
    }

    public void DeleteFromFormattedTextField(JFormattedTextField textField) {
        String phoneInputRes = textField.getValue().toString();
        if (phoneInputRes.charAt(phoneInputRes.length() - 1) == '-' || phoneInputRes.charAt(phoneInputRes.length() - 1) == ')') {
            phoneInputRes = phoneInputRes.substring(0, phoneInputRes.length() - 1);
            textField.setValue(phoneInputRes);
        }
        if (phoneInputRes.length() > 0) {
            phoneInputRes = phoneInputRes.substring(0, phoneInputRes.length() - 1);
            textField.setValue(phoneInputRes);
        }
    }

    public void AddDigitToFormattedTextField(JFormattedTextField textField, int digit) {
        String phoneInputRes = textField.getValue().toString();

        if (phoneInputRes.length() == 0) {
            textField.setValue("(" + digit);
        } else if (phoneInputRes.length() == 4) {
            textField.setValue(phoneInputRes + ")" + digit);
        } else if (phoneInputRes.length() == 7) {
            textField.setValue(phoneInputRes + "-" + digit);
        } else if (phoneInputRes.length() == 11) {
            textField.setValue(phoneInputRes + "-" + digit);
        } else if (phoneInputRes.length() >= 16) {
            return;
        } else {
            textField.setValue(phoneInputRes + digit);
            System.out.println("Len: " + phoneInputRes.length());
        }

        System.out.println("RES: " + textField.getValue().toString());
    }

}
