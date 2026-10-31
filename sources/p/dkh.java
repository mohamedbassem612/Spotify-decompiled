package p;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dkh {
    public static void a(TextView textView, String str, qwc1 qwc1Var) {
        textView.setText(cuo1.B(str));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString spannableString = new SpannableString(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ckh(qwc1Var, uRLSpan, uRLSpan.getURL()), spanStart, spanEnd, 33);
        }
        textView.setText(spannableString);
    }
}
