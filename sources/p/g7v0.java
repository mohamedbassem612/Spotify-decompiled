package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g7v0 extends zf30 implements ug30, o6r0 {
    public final pjq0 F1;
    public dgs G1;
    public egs H1;
    public kt91 I1;
    public tjq J1;
    public final gn10 K1 = mno1.S;

    public g7v0(pjq0 pjq0Var) {
        this.F1 = pjq0Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    public final void I0(View view, Bundle bundle) {
        Bundle bundle2 = ((zf30) this).f;
        String string = bundle2 != null ? bundle2.getString("key.showuri") : null;
        if (string == null) {
            hhg1.n("Required value was null.");
            return;
        }
        dgs dgsVar = this.G1;
        if (dgsVar == null) {
            u890.C("presenter");
            throw null;
        }
        tjq tjqVar = this.J1;
        if (tjqVar != null) {
            dgsVar.b(string, tjqVar);
        } else {
            u890.C("viewBinder");
            throw null;
        }
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.K1;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.R3());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.R3();
    }

    @Override // p.ug30
    public final String s() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.R3().a;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        egs egsVar = this.H1;
        if (egsVar == null) {
            u890.C("toolbarFactory");
            throw null;
        }
        kt91 kt91Var = this.I1;
        if (kt91Var == null) {
            u890.C("snackbarManager");
            throw null;
        }
        tjq tjqVar = new tjq(layoutInflater, viewGroup, egsVar, kt91Var);
        this.J1 = tjqVar;
        return tjqVar.s();
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        dgs dgsVar = this.G1;
        if (dgsVar != null) {
            dgsVar.a();
        } else {
            u890.C("presenter");
            throw null;
        }
    }
}
