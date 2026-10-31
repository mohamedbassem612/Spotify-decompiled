package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wts0 extends zf30 implements z0d1, lir0 {
    public final pjq0 F1;
    public ohv0 G1;
    public yts0 H1;
    public g1f0 I1;
    public kg0 J1;
    public mir0 K1;
    public sp00 L1;
    public pf30 M1;

    public wts0(pjq0 pjq0Var) {
        this.F1 = pjq0Var;
    }

    public final void I0(View view, Bundle bundle) {
        this.M1 = a0(new cj8(this, (byte) 10), new e1r0((byte) 5));
        g1f0 g1f0Var = this.I1;
        if (g1f0Var == null) {
            u890.C("remoteProperties");
            throw null;
        }
        if (g1f0Var.g()) {
            ((TextView) Y0().c).setText(k0().getString(2131962526, 1, 5));
        }
        ((TextView) ((p1f0) Y0().d).e).setText(l0(2131959725));
        ((Button) ((p1f0) Y0().d).g).setEnabled(false);
        TextView textView = (TextView) ((p1f0) Y0().d).b;
        j4b1 j4b1Var = j4b1.AD;
        yzo1.p(textView);
        p1f0 p1f0Var = (p1f0) Y0().d;
        ((TextView) p1f0Var.b).setOnClickListener(new vts0(this, (byte) 0));
        ((TextView) p1f0Var.a).setOnClickListener(new vts0(this, (byte) 1));
        ((Button) p1f0Var.g).setOnClickListener(new vts0(this, (byte) 2));
        EditText editText = (EditText) p1f0Var.d;
        editText.setOnFocusChangeListener(new x29(this, (byte) 11));
        editText.addTextChangedListener(new lgh(p1f0Var, this, (byte) 6));
        N0().J().a(n0(), new ydb(this, (byte) 21));
    }

    public final sp00 Y0() {
        sp00 sp00Var = this.L1;
        if (sp00Var != null) {
            return sp00Var;
        }
        eg.m("Failed to bind fragment_phone_number_auth");
        return null;
    }

    public final yts0 Z0() {
        yts0 yts0Var = this.H1;
        if (yts0Var != null) {
            return yts0Var;
        }
        u890.C("presenter");
        throw null;
    }

    public final void a1(m0d m0dVar) {
        p1f0 p1f0Var = (p1f0) Y0().d;
        ((TextView) p1f0Var.b).setText(m0dVar != null ? m0dVar.c : null);
        ((TextView) p1f0Var.a).setText(m0dVar != null ? m0dVar.b : null);
        EditText editText = (EditText) p1f0Var.d;
        Z0();
        editText.setHint(yts0.a(m0dVar != null ? m0dVar.a : null));
        ohv0 ohv0Var = this.G1;
        if (ohv0Var != null) {
            ohv0Var.a(new mhv0("phone_number_phone_number", ab80.b(8), ew80.b, null));
        } else {
            u890.C("preAuthUbiTracker");
            throw null;
        }
    }

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.K1;
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

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.L1 = sp00.t(layoutInflater, viewGroup);
        return Y0().q();
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        this.L1 = null;
    }
}
