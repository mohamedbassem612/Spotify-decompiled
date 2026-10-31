package p;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class olb0 {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public BoringLayout.Metrics f;
    public boolean g;
    public CharSequence h;

    public olb0(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
    }

    public final float a() {
        if (!Float.isNaN(this.d)) {
            return this.d;
        }
        boolean z = this.g;
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        if (!z) {
            this.f = b2u.v(charSequence, textPaint, bae1.b(this.c));
            this.g = true;
        }
        BoringLayout.Metrics metrics = this.f;
        float fCeil = metrics != null ? metrics.width : -1;
        if (fCeil < 0.0f) {
            CharSequence charSequenceS = this.h;
            if (charSequenceS == null) {
                charSequenceS = fj30.s(charSequence);
                this.h = charSequenceS;
            }
            int length = charSequenceS.length();
            CharSequence charSequenceS2 = this.h;
            if (charSequenceS2 == null) {
                charSequenceS2 = fj30.s(charSequence);
                this.h = charSequenceS2;
            }
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequenceS2, 0, length, textPaint));
        }
        if (fj30.r(fCeil, charSequence, textPaint)) {
            fCeil += 0.5f;
        }
        this.d = fCeil;
        return fCeil;
    }
}
