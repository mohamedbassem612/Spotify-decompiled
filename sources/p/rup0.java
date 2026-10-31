package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rup0 implements qq60 {
    public final op80 a;
    public final tup0 b;

    public rup0(op80 op80Var, tup0 tup0Var) {
        this.a = op80Var;
        this.b = tup0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rup0)) {
            return false;
        }
        rup0 rup0Var = (rup0) obj;
        return this.a.equals(rup0Var.a) && this.b.equals(rup0Var.b);
    }

    @Override // p.qq60
    public final String getId() {
        return "offline-ready-shelf";
    }

    public final int hashCode() {
        return this.b.hashCode() + x0d.i(this.a, -1150326230, 31);
    }
}
