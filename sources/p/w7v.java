package p;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w7v extends jmr0 implements ky11 {
    public final Drawable f;
    public final hrr0 g = v8r.q(0);
    public final hrr0 h;
    public final idd1 i;

    public w7v(Drawable drawable) {
        long jFloatToRawIntBits;
        this.f = drawable;
        byte b = 0;
        znb0 znb0Var = x7v.a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L) | (Float.floatToRawIntBits(intrinsicWidth) << 32);
        }
        this.h = v8r.q(new Size(jFloatToRawIntBits));
        this.i = new idd1(new v7v(this, b));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public final boolean a(float f) {
        this.f.setAlpha(yoi1.p(jch0.U(f * 255.0f), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Drawable.Callback callback = (Drawable.Callback) this.i.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public final boolean c(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter != null ? colorFilter.a : null);
        return true;
    }

    public final void d(flb0 flb0Var) {
        int i;
        int iOrdinal = flb0Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    public final void f() {
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    public final long i() {
        return ((Size) this.h.getValue()).a;
    }

    public final void j(DrawScope drawScope) {
        u84 u84VarP = drawScope.a1().p();
        ((Number) this.g.getValue()).intValue();
        int iU = jch0.U(Size.f(drawScope.j()));
        int iU2 = jch0.U(Size.d(drawScope.j()));
        Drawable drawable = this.f;
        drawable.setBounds(0, 0, iU, iU2);
        try {
            u84VarP.q();
            Canvas canvas = v84.a;
            drawable.draw(u84VarP.a);
        } finally {
            u84VarP.i();
        }
    }
}
