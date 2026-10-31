package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gf11 extends mvh0 implements ef11 {
    public final String f;
    public final ovh0 g;
    public boolean h;
    public int j;
    public df11 k;
    public final /* synthetic */ if11 m;
    public int i = -1;
    public int l = -1;

    public gf11(if11 if11Var, String str, ovh0 ovh0Var) {
        this.m = if11Var;
        this.f = str;
        this.g = ovh0Var;
    }

    public final int a() {
        return this.l;
    }

    public final void b() {
        df11 df11Var = this.k;
        if (df11Var != null) {
            int i = this.l;
            int i2 = df11Var.d;
            df11Var.d = i2 + 1;
            df11Var.b(4, i2, i, (Object) null, (Bundle) null);
            this.k = null;
            this.l = 0;
        }
    }

    public final void c(df11 df11Var) {
        ff11 ff11Var = new ff11();
        this.k = df11Var;
        int i = df11Var.e;
        df11Var.e = i + 1;
        int i2 = df11Var.d;
        df11Var.d = i2 + 1;
        Bundle bundleG = cy30.g("memberRouteId", this.f);
        bundleG.putParcelable("routeControllerOptions", this.g.a);
        df11Var.b(11, i2, i, (Object) null, bundleG);
        df11Var.h.put(i2, ff11Var);
        this.l = i;
        if (this.h) {
            df11Var.a(i);
            int i3 = this.i;
            if (i3 >= 0) {
                df11Var.c(this.l, i3);
                this.i = -1;
            }
            int i4 = this.j;
            if (i4 != 0) {
                df11Var.d(this.l, i4);
                this.j = 0;
            }
        }
    }

    public final boolean d(Intent intent, hwh0 hwh0Var) {
        df11 df11Var = this.k;
        if (df11Var != null) {
            int i = this.l;
            int i2 = df11Var.d;
            df11Var.d = i2 + 1;
            if (df11Var.b(9, i2, i, intent, (Bundle) null)) {
                if (hwh0Var != null) {
                    df11Var.h.put(i2, hwh0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if11 if11Var = this.m;
        if11Var.X.remove(this);
        b();
        if11Var.m();
    }

    public final void f() {
        this.h = true;
        df11 df11Var = this.k;
        if (df11Var != null) {
            df11Var.a(this.l);
        }
    }

    public final void g(int i) {
        df11 df11Var = this.k;
        if (df11Var != null) {
            df11Var.c(this.l, i);
        } else {
            this.i = i;
            this.j = 0;
        }
    }

    public final void h() {
        i(0);
    }

    public final void i(int i) {
        this.h = false;
        df11 df11Var = this.k;
        if (df11Var != null) {
            int i2 = this.l;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = df11Var.d;
            df11Var.d = i3 + 1;
            df11Var.b(6, i3, i2, (Object) null, bundle);
        }
    }

    public final void j(int i) {
        df11 df11Var = this.k;
        if (df11Var != null) {
            df11Var.d(this.l, i);
        } else {
            this.j += i;
        }
    }

    public final void l(String str) {
        df11 df11Var = this.k;
        if (df11Var != null) {
            int i = this.l;
            df11Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = df11Var.d;
            df11Var.d = i2 + 1;
            df11Var.b(12, i2, i, (Object) null, bundle);
        }
    }

    public final void m(String str) {
        df11 df11Var = this.k;
        if (df11Var != null) {
            int i = this.l;
            df11Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = df11Var.d;
            df11Var.d = i2 + 1;
            df11Var.b(13, i2, i, (Object) null, bundle);
        }
    }

    public final void n(List list) {
        df11 df11Var = this.k;
        if (df11Var != null) {
            int i = this.l;
            df11Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = df11Var.d;
            df11Var.d = i2 + 1;
            df11Var.b(14, i2, i, (Object) null, bundle);
        }
    }
}
