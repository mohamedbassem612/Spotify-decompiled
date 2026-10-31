package p;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aw61 extends CharacterStyle implements UpdateAppearance {
    public final zv61 a;
    public final float b;
    public final hrr0 c = v8r.q(new Size(9205357640488583168L));
    public final mdt d = yv91.a(new ww21(this, (byte) 9));

    public aw61(zv61 zv61Var, float f) {
        this.a = zv61Var;
        this.b = f;
    }

    public final void a(long j) {
        this.c.setValue(new Size(j));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        jhc1.D(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
