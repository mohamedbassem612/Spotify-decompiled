package p;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wkc0 extends ClickableSpan {
    public final int a;
    public final tzf0 b;

    public wkc0(int i, tzf0 tzf0Var) {
        this.a = i;
        this.b = tzf0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
