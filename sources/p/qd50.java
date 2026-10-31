package p;

import android.text.TextPaint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qd50 extends ton1 {
    public final CharSequence c;
    public final TextPaint d;

    public qd50(CharSequence charSequence, TextPaint textPaint) {
        this.c = charSequence;
        this.d = textPaint;
    }

    @Override // p.ton1
    public final int x(int i) {
        CharSequence charSequence = this.c;
        return this.d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // p.ton1
    public final int z(int i) {
        CharSequence charSequence = this.c;
        return this.d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
