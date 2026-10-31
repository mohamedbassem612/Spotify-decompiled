package p;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ckh extends URLSpan {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ URLSpan b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckh(iu30 iu30Var, URLSpan uRLSpan, String str) {
        super(str);
        this.a = iu30Var;
        this.b = uRLSpan;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        super.onClick(view);
        iu30 iu30Var = this.a;
        if (iu30Var != null) {
            iu30Var.invoke(this.b.getURL());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
