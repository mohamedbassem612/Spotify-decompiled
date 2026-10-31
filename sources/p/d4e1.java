package p;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d4e1 {
    public float c;
    public final WeakReference e;
    public k0e1 f;
    public final TextPaint a = new TextPaint(1);
    public final k2g b = new k2g(this, (byte) 1);
    public boolean d = true;

    public d4e1(c4e1 c4e1Var) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(c4e1Var);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        float fMeasureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = fMeasureText;
        this.d = false;
        return fMeasureText;
    }

    public final void b(k0e1 k0e1Var, Context context) {
        if (this.f != k0e1Var) {
            this.f = k0e1Var;
            WeakReference weakReference = this.e;
            if (k0e1Var != null) {
                TextPaint textPaint = this.a;
                k2g k2gVar = this.b;
                k0e1Var.f(context, textPaint, k2gVar);
                c4e1 c4e1Var = (c4e1) weakReference.get();
                if (c4e1Var != null) {
                    textPaint.drawableState = c4e1Var.getState();
                }
                k0e1Var.e(context, textPaint, k2gVar);
                this.d = true;
            }
            c4e1 c4e1Var2 = (c4e1) weakReference.get();
            if (c4e1Var2 != null) {
                c4e1Var2.a();
                c4e1Var2.onStateChange(c4e1Var2.getState());
            }
        }
    }
}
