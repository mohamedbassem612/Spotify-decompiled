package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class umb0 implements rlc1 {
    public final gdn0 a;
    public final /* synthetic */ vmb0 b;
    public final /* synthetic */ Object c;

    public umb0(vmb0 vmb0Var, Object obj) {
        this.b = vmb0Var;
        this.c = obj;
        int[] iArr = xr80.a;
        this.a = new gdn0();
    }

    @Override // p.rlc1
    public final long a(int i) {
        hmb0 hmb0Var = (hmb0) this.b.t.g(this.c);
        if (hmb0Var == null || !hmb0Var.I()) {
            return 0L;
        }
        int i2 = ((afn0) hmb0Var.o()).a.c;
        if (i < 0 || i >= i2) {
            qf80.e("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (!this.a.c(i)) {
            return 0L;
        }
        int i3 = ((q5t0) ((hmb0) ((afn0) hmb0Var.o()).get(i)).f1.p).a;
        return (((long) ((q5t0) ((hmb0) ((afn0) hmb0Var.o()).get(i)).f1.p).b) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // p.rlc1
    public final int b() {
        hmb0 hmb0Var = (hmb0) this.b.t.g(this.c);
        if (hmb0Var != null) {
            return ((afn0) hmb0Var.o()).a.c;
        }
        return 0;
    }

    @Override // p.rlc1
    public final void c(int i, long j) {
        vmb0 vmb0Var = this.b;
        hmb0 hmb0Var = (hmb0) vmb0Var.t.g(this.c);
        if (hmb0Var == null || !hmb0Var.I()) {
            return;
        }
        int i2 = ((afn0) hmb0Var.o()).a.c;
        if (i < 0 || i >= i2) {
            qf80.e("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (hmb0Var.J()) {
            qf80.a("Pre-measure called on node that is not placed");
        }
        hmb0 hmb0Var2 = vmb0Var.a;
        hmb0Var2.R0 = true;
        kmb0.a(hmb0Var).u((hmb0) ((afn0) hmb0Var.o()).get(i), j);
        hmb0Var2.R0 = false;
        this.a.a(i);
    }

    @Override // p.rlc1
    public final void d(q94 q94Var) {
        jdo0 jdo0Var;
        hmb0 hmb0Var = (hmb0) this.b.t.g(this.c);
        pim0 pim0Var = (hmb0Var == null || (jdo0Var = hmb0Var.e1) == null) ? null : (pim0) jdo0Var.g;
        if (pim0Var == null || !pim0Var.N0) {
            return;
        }
        don1.G(pim0Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", q94Var);
    }

    @Override // p.rlc1
    public final void dispose() {
        this.b.h(this.c);
    }
}
