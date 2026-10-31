package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g2i0 extends sqe1 {
    public final sqe1 e;
    public final l280 f;
    public final l280 g;

    public g2i0(sqe1 sqe1Var, l280 l280Var, l280 l280Var2) {
        this.e = sqe1Var;
        this.f = l280Var;
        this.g = l280Var2;
    }

    @Override // p.sqe1
    public final int a(boolean z) {
        return this.e.a(z);
    }

    @Override // p.sqe1
    public final int b(Object obj) {
        Object obj2;
        boolean z = obj instanceof String;
        sqe1 sqe1Var = this.e;
        return (!z || (obj2 = this.g.h.get(obj)) == null) ? sqe1Var.b(obj) : sqe1Var.b(obj2);
    }

    @Override // p.sqe1
    public final int c(boolean z) {
        return this.e.c(z);
    }

    @Override // p.sqe1
    public final int e(int i, int i2, boolean z) {
        return this.e.e(i, i2, z);
    }

    @Override // p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        String str;
        String str2;
        this.e.f(i, dqe1Var, z);
        if (z) {
            Object obj = dqe1Var.a;
            l280 l280Var = this.g;
            if (obj != null && (str2 = (String) l280Var.get(obj)) != null) {
                dqe1Var.a = str2;
            }
            Object obj2 = dqe1Var.b;
            if (obj2 != null && (str = (String) l280Var.get(obj2)) != null) {
                dqe1Var.b = str;
            }
        }
        return dqe1Var;
    }

    @Override // p.sqe1
    public final int h() {
        return this.e.h();
    }

    @Override // p.sqe1
    public final int k(int i, int i2, boolean z) {
        return this.e.k(i, i2, z);
    }

    @Override // p.sqe1
    public final Object l(int i) {
        Object objL = this.e.l(i);
        String str = (String) this.g.get(objL);
        return str == null ? objL : str;
    }

    @Override // p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        String str;
        this.e.n(i, oqe1Var, j);
        Object obj = oqe1Var.a;
        if (obj != null && (str = (String) this.f.get(obj)) != null) {
            oqe1Var.a = str;
        }
        return oqe1Var;
    }

    @Override // p.sqe1
    public final int o() {
        return this.e.o();
    }
}
