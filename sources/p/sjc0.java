package p;

import android.graphics.Typeface;
import android.net.Uri;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sjc0 extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public sjc0(SeeMoreTextView seeMoreTextView, vk51 vk51Var) {
        this.a = (byte) 2;
        this.c = seeMoreTextView;
        this.b = vk51Var;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View, com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Selection.setSelection((Spannable) ((TextView) view).getText(), 0);
                view.invalidate();
                ((fz40) obj).invoke(((jjc0) obj2).b);
                break;
            case 1:
                ((Function0) obj).invoke();
                Uri uri = Uri.parse("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                oxg1 oxg1Var = new oxg1();
                ((asn) oxg1Var.d).a = -16777216;
                oxg1Var.g();
                oxg1Var.a().j(((zlc0) obj2).a, uri);
                break;
            default:
                ?? r3 = (SeeMoreTextView) obj2;
                r3.cancelPendingInputEvents();
                iu30 iu30Var = r3.N0;
                if (iu30Var != null) {
                    iu30Var.invoke((vk51) obj);
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                textPaint.setColor(textPaint.getColor());
                textPaint.setUnderlineText(true);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setColor(((zlc0) obj).a.getColor(2131101184));
                textPaint.setUnderlineText(true);
                break;
            default:
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
                ((SeeMoreTextView) obj).setHighlightColor(0);
                break;
        }
    }

    public /* synthetic */ sjc0(byte b, Object obj, cv30 cv30Var) {
        this.a = b;
        this.b = cv30Var;
        this.c = obj;
    }
}
