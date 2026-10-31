package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class twf0 extends zf30 implements hac0, lir0 {
    public final c8d0 F1;
    public hxf0 G1;
    public MobiusLoop.Controller H1;
    public lde0 I1;
    public nxf0 J1;
    public ywf0 K1;
    public wnh1 L1;
    public mir0 M1;
    public t8h1 N1;
    public bvw O1;
    public qhe0 P1;
    public udl0 Q1;
    public ydl0 R1;
    public mwn0 S1;

    public twf0(c8d0 c8d0Var) {
        this.F1 = c8d0Var;
    }

    public static fxf0 Y0(Bundle bundle) {
        return new fxf0(bundle.getString("magiclink_email_or_username", ""), bundle.getBoolean("magiclink_show_done_screen", false), bundle.getString("magiclink_initial_error_msg", ""), bundle.getBoolean("ARG_AUTO_SEND", false));
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.H1;
        if (controller != null) {
            controller.stop();
        }
        wnh1.H(Z0());
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.H1;
        if (controller != null) {
            controller.start();
        }
        Z0().F();
    }

    public final void F0(Bundle bundle) {
        Bundle bundleI;
        fxf0 fxf0Var;
        MobiusLoop.Controller controller = this.H1;
        if (controller != null && (fxf0Var = (fxf0) controller.a()) != null) {
            bundle.putParcelable("KEY_MAGIC_LINK_REQUEST_MODEL", fxf0Var);
        }
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null || !dg30VarF0.isChangingConfigurations() || (bundleI = Z0().I()) == null) {
            return;
        }
        bundle.putBundle("PBL_STATE", bundleI);
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        Z0().G();
    }

    public final void I0(View view, Bundle bundle) {
        Connectable connectable = this.G1;
        if (connectable == null) {
            eg.m("Views are null");
            return;
        }
        MobiusLoop.Controller controller = this.H1;
        if (controller != null) {
            controller.c(connectable);
        }
        if (bundle == null) {
            nxf0 nxf0Var = this.J1;
            if (nxf0Var != null) {
                nxf0Var.a(new yp80(2, Z0().Y.c.a));
            } else {
                u890.C("magicLinkInstrumentor");
                throw null;
            }
        }
    }

    public final wnh1 Z0() {
        wnh1 wnh1Var = this.L1;
        if (wnh1Var != null) {
            return wnh1Var;
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.M1;
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
        Bundle bundle2;
        super.w0(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("PBL_STATE")) == null) {
            return;
        }
        Z0().y(bundle2);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mmr0 mmr0VarN;
        w7x w7xVar = w7x.a;
        if (bundle != null) {
            fxf0 parcelable = bundle.getParcelable("KEY_MAGIC_LINK_REQUEST_MODEL");
            if (parcelable == null) {
                eg.m("Model is null in savedInstanceState");
                return null;
            }
            mmr0VarN = oqn1.n(parcelable, w7xVar);
        } else if (O0().getBoolean("ARG_AUTO_SEND", false)) {
            fxf0 fxf0VarA = fxf0.a(Y0(O0()), (String) null, bxf0.a, 15);
            mmr0VarN = oqn1.n(fxf0VarA, Collections.singleton(new q461(fxf0VarA.b(), true)));
        } else {
            mmr0VarN = oqn1.n(Y0(O0()), w7xVar);
        }
        fxf0 fxf0Var = (fxf0) mmr0VarN.a;
        Set set = (Set) mmr0VarN.b;
        nxf0 nxf0Var = this.J1;
        if (nxf0Var == null) {
            u890.C("magicLinkInstrumentor");
            throw null;
        }
        lde0 lde0Var = this.I1;
        if (lde0Var == null) {
            u890.C("emailValidator");
            throw null;
        }
        t8h1 t8h1Var = this.N1;
        if (t8h1Var == null) {
            u890.C("ubiPageLocationChangeListener");
            throw null;
        }
        qhe0 qhe0Var = this.P1;
        if (qhe0Var == null) {
            u890.C("ubiLogger");
            throw null;
        }
        ydl0 ydl0Var = this.R1;
        if (ydl0Var == null) {
            u890.C("withoutPasswordScreenEventFactory");
            throw null;
        }
        udl0 udl0Var = this.Q1;
        if (udl0Var == null) {
            u890.C("checkEmailScreenEventFactory");
            throw null;
        }
        mwn0 mwn0Var = this.S1;
        if (mwn0Var == null) {
            u890.C("navigationLogger");
            throw null;
        }
        hxf0 hxf0Var = new hxf0(this, layoutInflater, viewGroup, nxf0Var, lde0Var, t8h1Var, qhe0Var, ydl0Var, udl0Var, mwn0Var);
        ywf0 ywf0Var = this.K1;
        if (ywf0Var == null) {
            u890.C("magicLinkRequestInjector");
            throw null;
        }
        this.H1 = ywf0Var.a(hxf0Var, fxf0Var, set);
        this.G1 = hxf0Var;
        lj30 lj30VarN0 = n0();
        lj30VarN0.b();
        lj30VarN0.e.a(hxf0Var);
        return hxf0Var.a();
    }

    public final void z0() {
        MobiusLoop.Controller controller = this.H1;
        if (controller != null) {
            controller.disconnect();
        }
        this.G1 = null;
        ((zf30) this).h1 = true;
    }
}
