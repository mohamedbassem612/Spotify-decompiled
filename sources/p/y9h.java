package p;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y9h {
    public final byte a;
    public final wey0 b;
    public nk80 c;
    public nk80 d;
    public xey0 e;
    public final ColorDrawable f;
    public final boolean g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y9h(int i) {
        wey0 wey0Var = new wey0();
        wey0Var.a = -1;
        wey0Var.b = -1;
        nk80 nk80Var = nk80.e;
        wey0Var.c = nk80Var;
        wey0Var.d = false;
        wey0Var.e = null;
        wey0Var.f = 0.0f;
        wey0Var.g = 0.0f;
        wey0Var.h = 1.0f;
        this.b = wey0Var;
        this.c = nk80Var;
        this.d = nk80Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            hhg1.n(f4i1.c(i, "Unexpected side: "));
            throw null;
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        this.h = -16777216;
        colorDrawable.setColor(-16777216);
        wey0Var.e = colorDrawable;
        xmu0 xmu0Var = wey0Var.i;
        if (xmu0Var != null) {
            ((View) xmu0Var.c).setBackground(colorDrawable);
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        wey0 wey0Var = this.b;
        if (wey0Var.h != f2) {
            wey0Var.h = f2;
            xmu0 xmu0Var = wey0Var.i;
            if (xmu0Var != null) {
                ((View) xmu0Var.c).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        wey0 wey0Var = this.b;
        byte b = this.a;
        if (b == 1) {
            float f3 = (-(1.0f - f2)) * wey0Var.a;
            if (wey0Var.f != f3) {
                wey0Var.f = f3;
                xmu0 xmu0Var = wey0Var.i;
                if (xmu0Var != null) {
                    ((View) xmu0Var.c).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (b == 2) {
            float f4 = (-(1.0f - f2)) * wey0Var.b;
            if (wey0Var.g != f4) {
                wey0Var.g = f4;
                xmu0 xmu0Var2 = wey0Var.i;
                if (xmu0Var2 != null) {
                    ((View) xmu0Var2.c).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (b == 4) {
            float f5 = (1.0f - f2) * wey0Var.a;
            if (wey0Var.f != f5) {
                wey0Var.f = f5;
                xmu0 xmu0Var3 = wey0Var.i;
                if (xmu0Var3 != null) {
                    ((View) xmu0Var3.c).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (b != 8) {
            return;
        }
        float f6 = (1.0f - f2) * wey0Var.b;
        if (wey0Var.g != f6) {
            wey0Var.g = f6;
            xmu0 xmu0Var4 = wey0Var.i;
            if (xmu0Var4 != null) {
                ((View) xmu0Var4.c).setTranslationY(f6);
            }
        }
    }
}
