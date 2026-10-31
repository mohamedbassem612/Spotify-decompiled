package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t1o0 {
    public final i8h1 a;
    public final xok0 b;
    public final q1o0 c;
    public final d3o0 d;
    public final o2o0 e;
    public l1o0 f;
    public final CompositeDisposable g = new CompositeDisposable();
    public w1o0 h = w1o0.a;

    public t1o0(i8h1 i8h1Var, xok0 xok0Var, q1o0 q1o0Var, d3o0 d3o0Var, o2o0 o2o0Var) {
        this.a = i8h1Var;
        this.b = xok0Var;
        this.c = q1o0Var;
        this.d = d3o0Var;
        this.e = o2o0Var;
    }

    public final void a(boolean z) {
        this.h = w1o0.b;
        if (!z) {
            this.g.b(this.c.a().subscribe(new k1o0(this, (byte) 1)));
        }
        l1o0 l1o0Var = this.f;
        if (l1o0Var == null) {
            u890.C("view");
            throw null;
        }
        p2o0 p2o0VarY0 = l1o0Var.Y0();
        pf30 pf30Var = l1o0Var.H1;
        if (pf30Var != null) {
            l1o0Var.G1.b(p2o0VarY0.O(pf30Var).skip(z ? 1L : 0L).take(1L).subscribe(new lrj0(l1o0Var, (byte) 12)));
        } else {
            u890.C("launcher");
            throw null;
        }
    }
}
