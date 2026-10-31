package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dg01 implements z291 {
    public final View a;

    public dg01(ImageView imageView) {
        this.a = imageView;
    }

    public static c5u b(int i, int i2, int i3) {
        if (i == -2) {
            return y4u.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            w4u.a(i4);
            return new w4u(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        w4u.a(i5);
        return new w4u(i5);
    }

    @Override // p.z291
    public final Object a(lnm lnmVar) {
        k291 k291VarC = c();
        if (k291VarC != null) {
            return k291VarC;
        }
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        xek1 xek1Var = new xek1(this, viewTreeObserver, ohdVar);
        viewTreeObserver.addOnPreDrawListener(xek1Var);
        ohdVar.n(new wek1(this, viewTreeObserver, xek1Var));
        return ohdVar.r();
    }

    public final k291 c() {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        c5u c5uVarB = b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (c5uVarB == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        c5u c5uVarB2 = b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (c5uVarB2 == null) {
            return null;
        }
        return new k291(c5uVarB, c5uVarB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg01) && u890.j(this.a, ((dg01) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.a + ", subtractPadding=true)";
    }
}
