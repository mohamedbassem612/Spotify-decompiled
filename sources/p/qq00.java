package p;

import android.text.Html;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qq00 extends AppCompatTextView {
    public Spannable i;
    public Spanned t;

    /* JADX WARN: Multi-variable type inference failed */
    private final void setA11yDescription(String str) {
        b8k1.p(this, new a8s(str, (byte) 1));
    }

    public static Spanned y(String str) {
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        if ((spannedFromHtml instanceof SpannableStringBuilder ? (SpannableStringBuilder) spannedFromHtml : null) != null) {
            nh40 nh40Var = new nh40(se11.b(new se11("\\b(?:https?://|www\\.)\\S+"), spannedFromHtml));
            while (nh40Var.hasNext()) {
                mbh0 mbh0Var = (mbh0) nh40Var.next();
                tr80 tr80VarB = mbh0Var.b();
                Matcher matcher = mbh0Var.a;
                if (spannedFromHtml.getSpans(((rr80) tr80VarB).a, ((rr80) mbh0Var.b()).b + 1, URLSpan.class).length == 0) {
                    ((SpannableStringBuilder) spannedFromHtml).setSpan(new URLSpan(nhc1.Y(matcher.group(), "https://", false) ? matcher.group() : "https://".concat(matcher.group())), ((rr80) mbh0Var.b()).a, ((rr80) mbh0Var.b()).b + 1, 33);
                }
            }
        }
        return spannedFromHtml;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Spannable spannable = this.i;
        if (spannable != null && ((action = motionEvent.getAction()) == 0 || action == 1)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = getScrollX() + totalPaddingLeft;
            int scrollY = getScrollY() + totalPaddingTop;
            Layout layout = getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            clickableSpanArr.getClass();
            if (!(clickableSpanArr.length == 0)) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 1) {
                    clickableSpan.onClick(this);
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
        if (charSequence instanceof Spannable) {
            this.i = (Spannable) charSequence;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(String str, String str2) {
        this.t = y(str);
        SpannableString spannableString = new SpannableString("... ".concat(str2));
        spannableString.setSpan(new StyleSpan(1), 0, str2.length() + 4, 33);
        Spanned spanned = this.t;
        if (spanned == null) {
            u890.C("spannedText");
            throw null;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new pq00(this, spanned, spannableString, (byte) 0));
        setMaxLines(2);
        setA11yDescription(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(String str, String str2) {
        this.t = y(str);
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new StyleSpan(1), 0, str2.length(), 33);
        Spanned spanned = this.t;
        if (spanned == null) {
            u890.C("spannedText");
            throw null;
        }
        setText(spanned);
        append("\n");
        append(spannableString);
        setEllipsize(null);
        setMaxLines(Integer.MAX_VALUE);
        setA11yDescription(str2);
    }
}
