package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b5n1 extends v7n1 {
    public final /* synthetic */ v7y b;

    public b5n1(v7y v7yVar) {
        this.b = v7yVar;
    }

    public final void b() {
        c5n1 c5n1Var = (c5n1) this.b.b;
        c5n1Var.b.b("unlinkToDeath", new Object[0]);
        c5n1Var.n.asBinder().unlinkToDeath(c5n1Var.k, 0);
        c5n1Var.n = null;
        c5n1Var.g = false;
    }
}
