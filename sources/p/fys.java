package p;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fys extends u9v0 {
    public final k3i1 a;

    public fys(k3i1 k3i1Var, String str) {
        super(str);
        this.a = k3i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onClick(View view) {
        super/*android.text.style.ClickableSpan*/.onClick(view);
        this.a.b(getURL());
        view.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateDrawState(TextPaint textPaint) {
        super/*android.text.style.CharacterStyle*/.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
