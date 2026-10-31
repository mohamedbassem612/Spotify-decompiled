package p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hf11 extends nvh0 implements ef11 {
    public final String a;
    public final String b;
    public final ovh0 c;
    public boolean d;
    public int e = -1;
    public int f;
    public df11 g;
    public int h;
    public final /* synthetic */ if11 i;

    public hf11(if11 if11Var, String str, String str2, ovh0 ovh0Var) {
        this.i = if11Var;
        this.a = str;
        this.b = str2;
        this.c = ovh0Var;
    }

    public final int a() {
        return this.h;
    }

    public final void b() {
        df11 df11Var = this.g;
        if (df11Var != null) {
            int i = this.h;
            int i2 = df11Var.d;
            df11Var.d = i2 + 1;
            df11Var.b(4, i2, i, (Object) null, (Bundle) null);
            this.g = null;
            this.h = 0;
        }
    }

    public final void c(df11 df11Var) {
        this.g = df11Var;
        int i = df11Var.e;
        df11Var.e = i + 1;
        Bundle bundleF = pzm.f("routeId", this.a, "routeGroupId", this.b);
        bundleF.putParcelable("routeControllerOptions", this.c.a);
        int i2 = df11Var.d;
        df11Var.d = i2 + 1;
        df11Var.b(3, i2, i, (Object) null, bundleF);
        this.h = i;
        if (this.d) {
            df11Var.a(i);
            int i3 = this.e;
            if (i3 >= 0) {
                df11Var.c(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                df11Var.d(this.h, i4);
                this.f = 0;
            }
        }
    }

    public final boolean d(Intent intent, hwh0 hwh0Var) {
        df11 df11Var = this.g;
        if (df11Var != null) {
            int i = this.h;
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
        if11 if11Var = this.i;
        if11Var.X.remove(this);
        b();
        if11Var.m();
    }

    public final void f() {
        this.d = true;
        df11 df11Var = this.g;
        if (df11Var != null) {
            df11Var.a(this.h);
        }
    }

    public final void g(int i) {
        df11 df11Var = this.g;
        if (df11Var != null) {
            df11Var.c(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    public final void h() {
        i(0);
    }

    public final void i(int i) {
        this.d = false;
        df11 df11Var = this.g;
        if (df11Var != null) {
            int i2 = this.h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = df11Var.d;
            df11Var.d = i3 + 1;
            df11Var.b(6, i3, i2, (Object) null, bundle);
        }
    }

    public final void j(int i) {
        df11 df11Var = this.g;
        if (df11Var != null) {
            df11Var.d(this.h, i);
        } else {
            this.f += i;
        }
    }
}
