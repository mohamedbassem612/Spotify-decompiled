package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yj implements iyf0, byf0 {
    public final kly0 a;
    public final wj b;
    public final v35 c;
    public final vku d = new vku();

    public yj(g5t g5tVar, wj wjVar, v35 v35Var) {
        this.a = g5tVar;
        this.b = wjVar;
        this.c = v35Var;
    }

    @Override // p.iyf0
    public final void c() {
        v35 v35Var = this.c;
        v35Var.a();
        if (v35Var.a()) {
            this.d.a(yoi1.i(((ck) this.a.get()).g, o6x.a).filter(y580.c).map(t9w.c).filter(e4y.c).distinctUntilChanged().flatMapCompletable(new bv40(this, (byte) 1)).subscribe());
        }
    }

    @Override // p.iyf0
    public final void d() {
        this.d.c();
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
