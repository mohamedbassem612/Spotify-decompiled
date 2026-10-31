package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class quf0 extends fac0 implements ug30, jik1 {
    public suf0 G1;
    public yuf0 H1;
    public ur00 I1;
    public boolean J1;
    public final c8d0 K1;

    public quf0(c8d0 c8d0Var) {
        this.K1 = c8d0Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return context.getString(2131957997);
    }

    public final void G0() {
        super.G0();
        this.H1.a();
        if (this.J1) {
            return;
        }
        this.I1.C();
    }

    public final void H0() {
        super.H0();
        this.H1.b();
        if (this.J1) {
            return;
        }
        this.I1.D();
    }

    @Override // p.fn10
    public final gn10 Q() {
        return mno1.H;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.m(yon1.D2());
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return nik1.B1;
    }

    @Override // p.ug30
    public final String s() {
        return "made-for-you-hub";
    }

    public final void v0(Context context) {
        this.K1.f(this);
        super/*p.zf30*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = kgr0.T0;
        return xyn1.z(this.G1.a());
    }

    @Override // p.ug30
    public final zf30 b() {
        return this;
    }
}
