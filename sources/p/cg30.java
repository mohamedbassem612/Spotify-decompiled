package p;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cg30 extends tg30 implements j2q0, taq0, q5q0, s5q0, sck1, s1q0, vh0, qe41, li30, psi0 {
    public final /* synthetic */ dg30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg30(dg30 dg30Var) {
        super(dg30Var, dg30Var, new Handler());
        this.h = dg30Var;
    }

    @Override // p.s5q0
    public final void C(dkl dklVar) {
        this.h.C(dklVar);
    }

    @Override // p.psi0
    public final void G(qti0 qti0Var) {
        this.h.G(qti0Var);
    }

    @Override // p.s1q0
    public final r1q0 J() {
        return this.h.J();
    }

    public final View N(int i) {
        return this.h.findViewById(i);
    }

    public final boolean O() {
        Window window = this.h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p.j2q0
    public final void T(dkl dklVar) {
        this.h.T(dklVar);
    }

    @Override // p.q5q0
    public final void V(dkl dklVar) {
        this.h.V(dklVar);
    }

    @Override // p.q5q0
    public final void W(dkl dklVar) {
        this.h.W(dklVar);
    }

    @Override // p.taq0
    public final void X(dkl dklVar) {
        this.h.X(dklVar);
    }

    @Override // p.taq0
    public final void Y(dkl dklVar) {
        this.h.Y(dklVar);
    }

    @Override // p.j2q0
    public final void Z(dkl dklVar) {
        this.h.Z(dklVar);
    }

    @Override // p.li30
    public final void a(zf30 zf30Var) {
        this.h.g0(zf30Var);
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.h.V0;
    }

    @Override // p.psi0
    public final void l(qti0 qti0Var) {
        this.h.l(qti0Var);
    }

    @Override // p.tg30
    public final void l0(PrintWriter printWriter, String[] strArr) {
        this.h.dump("  ", null, printWriter, strArr);
    }

    @Override // p.vh0
    public final sh0 m() {
        return this.h.i;
    }

    @Override // p.tg30
    public final dg30 m0() {
        return this.h;
    }

    @Override // p.s5q0
    public final void n(dkl dklVar) {
        this.h.n(dklVar);
    }

    @Override // p.tg30
    public final LayoutInflater n0() {
        dg30 dg30Var = this.h;
        return dg30Var.getLayoutInflater().cloneInContext(dg30Var);
    }

    @Override // p.sck1
    public final rck1 o() {
        return this.h.o();
    }

    @Override // p.tg30
    public final void o0() {
        this.h.invalidateOptionsMenu();
    }

    @Override // p.qe41
    public final oe41 p() {
        return this.h.d.j();
    }
}
