package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k1f0 extends zf30 implements z0d1, lir0 {
    public final czh F1;
    public h2f0 G1;
    public ohv0 H1;
    public b2r0 I1;
    public kg0 J1;
    public lg0 K1;
    public mir0 L1;
    public g1f0 M1;
    public bvw N1;
    public int O1;
    public final hrr0 P1;
    public final hrr0 Q1;

    public k1f0(czh czhVar) {
        this.F1 = czhVar;
        Boolean bool = Boolean.FALSE;
        this.P1 = xto.t(bool);
        this.Q1 = xto.t(bool);
    }

    public final void F0(Bundle bundle) {
        String string;
        bundle.putInt("error_count", this.O1);
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (string = bundle2.getString("EMAIL_OR_USERNAME")) == null) {
            string = "";
        }
        bundle.putString("EMAIL_OR_USERNAME", string);
    }

    public final void I0(View view, Bundle bundle) {
        N0().J().a(n0(), new ydb(this, (byte) 13));
    }

    public final h2f0 Y0() {
        h2f0 h2f0Var = this.G1;
        if (h2f0Var != null) {
            return h2f0Var;
        }
        u890.C("listener");
        throw null;
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.L1;
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
        xap1 khv0Var;
        super.w0(bundle);
        this.O1 = bundle != null ? bundle.getInt("error_count", 0) : 0;
        Y0().a(new l7m0(this, (byte) 28));
        lg0 lg0Var = this.K1;
        if (lg0Var == null) {
            u890.C("zeroResult");
            throw null;
        }
        tka0 tka0VarB = rc11.a.b(yit.class);
        l6d0 l6d0Var = new l6d0(this, (byte) 26);
        String strO = tka0VarB.o();
        sap1.n(this, strO != null ? strO : "zeroResult", new q1(lg0Var, tka0VarB, l6d0Var, (byte) 7));
        ohv0 ohv0Var = this.H1;
        if (ohv0Var == null) {
            u890.C("authTracker");
            throw null;
        }
        if (bundle == null) {
            b2r0 b2r0Var = this.I1;
            if (b2r0Var == null) {
                u890.C("pageBoundUbiLogger");
                throw null;
            }
            khv0Var = new nhv0("login", ((uba) b2r0Var).Y.c.a);
        } else {
            khv0Var = new khv0("login", 4, null, "return_to_screen");
        }
        ohv0Var.a(khv0Var);
        N0().setTitle(2131957736);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (string = bundle2.getString("EMAIL_OR_USERNAME")) == null) {
            string = "";
        }
        return bmq0.n(this, apo.j(1907143015, new j1f0(this, string, string.length() == 0 ? ori1.b : new pri1(string), (byte) 1), true));
    }
}
