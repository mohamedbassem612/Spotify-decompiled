package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h8k1 {
    public final Object a;
    public final Object b;

    public h8k1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8k1)) {
            return false;
        }
        h8k1 h8k1Var = (h8k1) obj;
        return u890.j(this.a, h8k1Var.a) && u890.j(this.b, h8k1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
