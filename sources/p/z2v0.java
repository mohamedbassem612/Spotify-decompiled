package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z2v0 extends zf30 implements ug30, jik1, o6r0, bbr0 {
    public k3v0 F1;
    public e3v0 G1;
    public l3v0 H1;
    public final pjq0 I1;

    public z2v0(pjq0 pjq0Var) {
        this.I1 = pjq0Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        this.H1.a();
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        this.H1.b();
    }

    @Override // p.fn10
    public final gn10 Q() {
        return O0().getBoolean("is_root") ? mno1.R : mno1.Q;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return this.F1.b0(cls);
    }

    @Override // p.lir0
    public final mir0 c() {
        return nhc.m(d7p1.l(getViewUri().a));
    }

    @Override // p.o6r0
    public final n6r0 e() {
        return d7p1.l(getViewUri().a);
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return (lik1) O0().getParcelable("uri");
    }

    @Override // p.ug30
    public final String s() {
        return getViewUri().a;
    }

    public final void v0(Context context) {
        this.I1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = kgr0.T0;
        return xyn1.A(this.G1.a(), new g6f0((byte) 19));
    }
}
