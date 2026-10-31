package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i9o0 extends zf30 implements ug30 {
    public final m6k0 F1;
    public xxr G1;
    public final gn10 H1 = mno1.p;

    public i9o0(m6k0 m6k0Var) {
        this.F1 = m6k0Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return context.getString(2131959111);
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.H1;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.k6());
    }

    @Override // p.ug30
    public final String s() {
        return "new_episodes";
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        View viewInflate = layoutInflater.inflate(2131624681, viewGroup, false);
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (string = bundle2.getString("username")) == null) {
            string = "";
        }
        if (this.G1 == null) {
            u890.C("episodesTabFragmentFactory");
            throw null;
        }
        wxr wxrVarA = xxr.a(string);
        wwo1.J(wxrVarA, new a690(mno1.p));
        th30 th30VarG0 = g0();
        th30VarG0.getClass();
        nu9 nu9Var = new nu9(th30VarG0);
        nu9Var.n(2131428212, wxrVarA, (String) null);
        nu9Var.f();
        int i = kgr0.T0;
        viewInflate.getClass();
        return xyn1.z(viewInflate);
    }
}
