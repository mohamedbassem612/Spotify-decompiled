package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e8h0 extends if30 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public e8h0(sqe1 sqe1Var, Object obj, Object obj2) {
        super(sqe1Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // p.if30, p.sqe1
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // p.if30, p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        this.e.f(i, dqe1Var, z);
        if (Objects.equals(dqe1Var.b, this.g) && z) {
            dqe1Var.b = h;
        }
        return dqe1Var;
    }

    @Override // p.if30, p.sqe1
    public final Object l(int i) {
        Object objL = this.e.l(i);
        return Objects.equals(objL, this.g) ? h : objL;
    }

    @Override // p.if30, p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        this.e.n(i, oqe1Var, j);
        if (Objects.equals(oqe1Var.a, this.f)) {
            oqe1Var.a = oqe1.q;
        }
        return oqe1Var;
    }
}
