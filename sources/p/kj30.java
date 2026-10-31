package p;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kj30 implements f4h1 {
    public final int a;
    public final Bundle b;
    public Bundle c;

    public kj30(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final th30 b() {
        try {
            return th30.H((View) getView());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Bundle c() {
        zf30 zf30VarF;
        th30 th30VarB = b();
        if (th30VarB == null || (zf30VarF = th30VarB.F(this.a)) == null) {
            return null;
        }
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("KEY_FRAGMENT_STATE", th30VarB.f0(zf30VarF))});
        this.c = bundleH;
        return bundleH;
    }

    public abstract void d(yf30 yf30Var);

    public final Bundle serialize() {
        Bundle bundleC = c();
        return bundleC == null ? this.c : bundleC;
    }

    public final void start() {
        th30 th30VarB = b();
        if (th30VarB == null) {
            hhg1.n("Required value was null.");
            return;
        }
        zf30 zf30VarF = th30VarB.F(this.a);
        if (zf30VarF != null) {
            nu9 nu9Var = new nu9(th30VarB);
            nu9Var.m(zf30VarF);
            nu9Var.h();
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            bundle = this.b;
        }
        d(bundle != null ? (yf30) jhc1.t(bundle, "KEY_FRAGMENT_STATE", yf30.class) : null);
    }

    public final void stop() {
        th30 th30VarB = b();
        if (th30VarB == null) {
            return;
        }
        c();
        zf30 zf30VarF = th30VarB.F(this.a);
        if (zf30VarF != null) {
            nu9 nu9Var = new nu9(th30VarB);
            nu9Var.m(zf30VarF);
            nu9Var.i();
        }
    }
}
