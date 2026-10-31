package p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hsl1 {
    public static final hsl1 b;
    public final esl1 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = csl1.x;
        } else if (i >= 30) {
            b = asl1.w;
        } else {
            b = esl1.b;
        }
    }

    public hsl1(hsl1 hsl1Var) {
        if (hsl1Var == null) {
            this.a = new esl1(this);
            return;
        }
        dsl1 dsl1Var = hsl1Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (dsl1Var instanceof dsl1)) {
            this.a = new dsl1(this, dsl1Var);
        } else if (i >= 34 && (dsl1Var instanceof csl1)) {
            this.a = new csl1(this, (csl1) dsl1Var);
        } else if (i >= 31 && (dsl1Var instanceof bsl1)) {
            this.a = new bsl1(this, (bsl1) dsl1Var);
        } else if (i >= 30 && (dsl1Var instanceof asl1)) {
            this.a = new asl1(this, (asl1) dsl1Var);
        } else if (i >= 29 && (dsl1Var instanceof zrl1)) {
            this.a = new zrl1(this, (zrl1) dsl1Var);
        } else if (i >= 28 && (dsl1Var instanceof yrl1)) {
            this.a = new yrl1(this, (yrl1) dsl1Var);
        } else if (dsl1Var instanceof xrl1) {
            this.a = new xrl1(this, (xrl1) dsl1Var);
        } else if (dsl1Var instanceof wrl1) {
            this.a = new wrl1(this, (wrl1) dsl1Var);
        } else {
            this.a = new esl1(this);
        }
        dsl1Var.e(this);
    }

    public static nk80 e(nk80 nk80Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, nk80Var.a - i);
        int iMax2 = Math.max(0, nk80Var.b - i2);
        int iMax3 = Math.max(0, nk80Var.c - i3);
        int iMax4 = Math.max(0, nk80Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? nk80Var : nk80.c(iMax, iMax2, iMax3, iMax4);
    }

    public static hsl1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        hsl1 hsl1Var = new hsl1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = b8k1.a;
            hsl1 hsl1VarA = s7k1.a(view);
            esl1 esl1Var = hsl1Var.a;
            esl1Var.y(hsl1VarA);
            View rootView = view.getRootView();
            esl1Var.d(rootView);
            esl1Var.p(rootView);
            esl1Var.q();
            esl1Var.A(view.getWindowSystemUiVisibility());
        }
        return hsl1Var;
    }

    public final int a() {
        return this.a.n().d;
    }

    public final int b() {
        return this.a.n().a;
    }

    public final int c() {
        return this.a.n().c;
    }

    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hsl1) {
            return n8p1.o(this.a, ((hsl1) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        esl1 esl1Var = this.a;
        if (esl1Var instanceof wrl1) {
            return ((wrl1) esl1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        esl1 esl1Var = this.a;
        if (esl1Var == null) {
            return 0;
        }
        return esl1Var.hashCode();
    }

    public hsl1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new dsl1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new csl1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new bsl1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new asl1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new zrl1(this, windowInsets);
        } else if (i >= 28) {
            this.a = new yrl1(this, windowInsets);
        } else {
            this.a = new xrl1(this, windowInsets);
        }
    }
}
