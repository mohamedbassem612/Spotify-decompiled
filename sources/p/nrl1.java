package p;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nrl1 extends vrl1 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public nk80 f;

    public nrl1() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    public hsl1 b() {
        a();
        hsl1 hsl1VarG = hsl1.g((View) null, this.e);
        nk80[] nk80VarArr = ((vrl1) this).b;
        esl1 esl1Var = hsl1VarG.a;
        esl1Var.w(nk80VarArr);
        esl1Var.z(this.f);
        esl1Var.v((dku) null);
        esl1Var.B(((vrl1) this).c);
        esl1Var.C(((vrl1) this).d);
        return hsl1VarG;
    }

    public void f(nk80 nk80Var) {
        this.f = nk80Var;
    }

    public void h(nk80 nk80Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(nk80Var.a, nk80Var.b, nk80Var.c, nk80Var.d);
        }
    }

    public nrl1(hsl1 hsl1Var) {
        super(hsl1Var);
        this.e = hsl1Var.f();
    }
}
