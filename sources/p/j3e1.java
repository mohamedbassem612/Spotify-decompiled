package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j3e1 implements g3e1 {
    public final long a;
    public final /* synthetic */ k3e1 b;

    public j3e1(k3e1 k3e1Var, long j) {
        this.b = k3e1Var;
        this.a = j;
    }

    @Override // p.g3e1
    public final f3e1 R() {
        return o2p1.g(this.b);
    }

    @Override // p.g3e1
    public final long l0(elb0 elb0Var) {
        elb0 elb0Var2 = (elb0) this.b.R0.getValue();
        if (elb0Var2 != null) {
            if (elb0Var2.a()) {
                return elb0Var.l(elb0Var2.E(this.a));
            }
            return 0L;
        }
        tf80.d("Tried to open context menu before the anchor was placed.");
        jah.d();
        return 0L;
    }

    @Override // p.g3e1
    public final n511 o0(elb0 elb0Var) {
        return anm1.g(l0(elb0Var), 0L);
    }
}
