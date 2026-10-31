package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b21 extends zf30 implements lir0 {
    public final g21 F1;
    public kg0 G1;
    public lg0 H1;
    public gid I1;
    public a11 J1;
    public kr60 K1;
    public c21 L1;
    public Observable M1;
    public Scheduler N1;
    public a031 O1;
    public g1f0 P1;
    public mir0 Q1;
    public mwn0 R1;
    public yqg S1;
    public MobiusLoopViewModel T1;
    public cn U1;
    public v51 V1;
    public bk8 W1;
    public final CompositeDisposable X1 = new CompositeDisposable();

    public b21(g21 g21Var) {
        this.F1 = g21Var;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        v51 v51Var = this.V1;
        if (v51Var != null) {
            v51Var.P0.setContent(r3i.b);
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        v51 v51Var = this.V1;
        if (v51Var != null) {
            v51Var.Q0.onNext(scd1.a);
        }
    }

    public final void I0(View view, Bundle bundle) {
        q41 q41VarS;
        if (bundle == null) {
            gid gidVar = this.I1;
            if (gidVar == null) {
                u890.C("adaptiveAuthTracker");
                throw null;
            }
            gidVar.k();
        }
        cjt cjtVar = (cjt) O0().getParcelable("entry_point");
        Uri data = N0().getIntent().getData();
        Uri uriZ0 = ag0.z0(N0());
        String string = uriZ0 != null ? uriZ0.toString() : null;
        a11 a11Var = this.J1;
        if (a11Var == null) {
            u890.C("adaptiveAuthenticationConfiguration");
            throw null;
        }
        if (cjtVar instanceof ajt) {
            ajt ajtVar = (ajt) cjtVar;
            q41VarS = new ke71(ajtVar.a, ajtVar.b, (byte) 15).n(a11Var);
        } else if (cjtVar instanceof bjt) {
            q41VarS = new akp1(((bjt) cjtVar).a, (byte) 11).b(a11Var);
        } else if (cjtVar instanceof yit) {
            yit yitVar = (yit) cjtVar;
            bk8 bk8Var = yitVar.b;
            this.W1 = bk8Var;
            q41VarS = new rl1(yitVar.a, new w01(data != null ? data.toString() : null, string, bk8Var), yitVar.c, yitVar.d, (byte) 20).B(a11Var);
        } else {
            if (!(cjtVar instanceof zit)) {
                if (cjtVar == null) {
                    eg.m("Missing Destination Data");
                    return;
                } else {
                    eg.o();
                    return;
                }
            }
            q41VarS = aq8.A(((zit) cjtVar).a).s(a11Var);
        }
        Observable observable = this.M1;
        if (observable == null) {
            u890.C("runtimeDependencies");
            throw null;
        }
        Scheduler scheduler = this.N1;
        if (scheduler != null) {
            this.X1.b(observable.observeOn(scheduler).subscribe((Consumer) new a21(this, q41VarS, (byte) 0)));
        } else {
            u890.C("mainThreadScheduler");
            throw null;
        }
    }

    public final kg0 Y0() {
        kg0 kg0Var = this.G1;
        if (kg0Var != null) {
            return kg0Var;
        }
        u890.C("zeroNavigator");
        throw null;
    }

    public final String Z0(int i, int i2) {
        g1f0 g1f0Var = this.P1;
        if (g1f0Var == null) {
            u890.C("loginFlowRemoteProperties");
            throw null;
        }
        if (!g1f0Var.g()) {
            return null;
        }
        return k0().getString(2131962526, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.Q1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        N0().J().a(this, new x11());
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c21 c21Var = this.L1;
        if (c21Var == null) {
            u890.C("viewsFactory");
            throw null;
        }
        v51 v51VarI = c21Var.i(layoutInflater, viewGroup);
        this.V1 = v51VarI;
        this.X1.b(v51VarI.Z.subscribe((Consumer) new tg(this, (byte) 9)));
        return v51VarI.N0;
    }

    public final void z0() {
        this.X1.g();
        cn cnVar = this.U1;
        if (cnVar != null) {
            cnVar.dispose();
        }
        this.U1 = null;
        this.V1 = null;
        ((zf30) this).h1 = true;
    }
}
