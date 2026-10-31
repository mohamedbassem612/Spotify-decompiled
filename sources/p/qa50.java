package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qa50 extends zf30 {
    public final nay F1;
    public ha50 G1;
    public fj10 H1;
    public final BehaviorSubject I1 = BehaviorSubject.f();
    public qn J1;
    public MobiusLoop.Controller K1;

    static {
        new lfb((byte) 12);
    }

    public qa50(nay nayVar) {
        this.F1 = nayVar;
    }

    public final void D0() {
        Y0().stop();
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        if (((va50) Y0().a()).b() == 2) {
            this.I1.onNext(new na50(((va50) Y0().a()).a()));
        }
        Y0().start();
    }

    public final void I0(View view, Bundle bundle) {
        MobiusLoop.Controller controllerY0 = Y0();
        qn qnVar = this.J1;
        if (qnVar != null) {
            controllerY0.c(qnVar);
        } else {
            u890.C("views");
            throw null;
        }
    }

    public final MobiusLoop.Controller Y0() {
        MobiusLoop.Controller controller = this.K1;
        if (controller != null) {
            return controller;
        }
        u890.C("controller");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        ha50 ha50Var = this.G1;
        if (ha50Var == null) {
            u890.C("controllerFactory");
            throw null;
        }
        dg30 dg30VarN0 = N0();
        String string = O0().getString("extra_graduation_token");
        if (string == null) {
            string = "";
        }
        String string2 = O0().getString("extra_interaction_id");
        this.K1 = ha50Var.a(dg30VarN0, this.I1, string, string2 != null ? string2 : "");
        N0().J().a(this, new pa50(true));
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.H1 == null) {
            u890.C("viewFactory");
            throw null;
        }
        qn qnVarB = fj10.b(layoutInflater, viewGroup);
        this.J1 = qnVarB;
        return qnVarB.getRoot();
    }

    public final void z0() {
        Y0().disconnect();
        ((zf30) this).h1 = true;
    }
}
