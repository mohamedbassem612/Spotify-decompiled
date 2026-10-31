package p;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ymr extends ClickableSpan {
    public final /* synthetic */ zmr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public ymr(zmr zmrVar, String str, int i) {
        this.a = zmrVar;
        this.b = str;
        this.c = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.t.invoke(this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.c);
        textPaint.setUnderlineText(false);
    }
}
