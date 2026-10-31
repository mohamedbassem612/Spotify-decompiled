package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c7u0 implements byf0 {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public faa0 e;
    public final llm f;
    public t6u0 g;

    public c7u0(kly0 kly0Var, kly0 kly0Var2, caq caqVar, caq caqVar2, q8n q8nVar) {
        this.a = kly0Var;
        this.b = kly0Var2;
        this.c = caqVar;
        this.d = caqVar2;
        this.f = smo1.e(ilo1.B(q8nVar, guo1.B()).y(new z8n("PlaybackTimeoutUiPlugin")));
    }

    @Override // p.byf0
    public final void c() {
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.e = c921.y(this.f, (o8n) null, 0, new f3t0(this, (lnm) null, (byte) 16), 3);
    }

    @Override // p.byf0
    public final void d() {
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.e = null;
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
    }
}
