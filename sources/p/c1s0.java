package p;

import android.os.Bundle;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c1s0 {
    public final g1s0 a;
    public final dxz0 b;
    public final u0s0 c;
    public final lze0 d;
    public final bjx e;
    public ix7 f;
    public final rku g = new rku();
    public slc0 h;

    public c1s0(g1s0 g1s0Var, dxz0 dxz0Var, u0s0 u0s0Var, lze0 lze0Var, bjx bjxVar, mka mkaVar) {
        this.a = g1s0Var;
        this.b = dxz0Var;
        this.c = u0s0Var;
        this.d = lze0Var;
        this.e = bjxVar;
    }

    public final void a(slc0 slc0Var, int i, String str) {
        if (slc0Var == null) {
            slc0Var = new slc0(UUID.randomUUID().toString());
        }
        bjx bjxVar = this.e;
        ((CompositeDisposable) bjxVar.g).b(fq7.C((xov0) bjxVar.b).subscribe(new p0s0(bjxVar, slc0Var, i, str)));
        q0s0 q0s0Var = new q0s0(i, str);
        ix7 ix7Var = this.f;
        ix7Var.getClass();
        ix7Var.d = q0s0Var;
        String str2 = (String) ix7Var.b;
        String str3 = (String) ix7Var.c;
        q19 q19Var = new q19(str2, str3, q0s0Var);
        u0s0 u0s0Var = this.c;
        if (str3 != null) {
            u0s0Var.Y0(q19Var);
            return;
        }
        dg30 dg30VarN0 = u0s0Var.N0();
        u0s0Var.K1.getClass();
        u0s0Var.K1.getClass();
        dg30VarN0.setResult(0, mka.g(q19Var));
        v0s0 v0s0Var = u0s0Var.J1;
        slc0 slc0Var2 = u0s0Var.L1;
        th30 th30Var = v0s0Var.a;
        th30Var.getClass();
        nu9 nu9Var = new nu9(th30Var);
        t0s0 t0s0Var = new t0s0();
        Bundle bundle = new Bundle();
        if (slc0Var2 == null) {
            slc0Var2 = new slc0(UUID.randomUUID().toString());
        }
        bundle.putParcelable("account_linking_id", slc0Var2);
        t0s0Var.T0(bundle);
        nu9Var.n(2131428943, t0s0Var, (String) null);
        nu9Var.f();
    }
}
