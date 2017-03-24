package pg.autyzm.friendly_plans.utils;


import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class Utils {

    public static void markFieldMandatory(TextView tv) {
        String text = tv.getText() + " * ";
        Spannable wordToSpan = new SpannableString(text);
        wordToSpan.setSpan(new ForegroundColorSpan(Color.RED), text.indexOf('*'),
                text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(wordToSpan);
    }

}