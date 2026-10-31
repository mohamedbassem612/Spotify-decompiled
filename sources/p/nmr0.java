package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nmr0 {
    public final Object a;
    public final Object b;

    public nmr0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nmr0)) {
            return false;
        }
        nmr0 nmr0Var = (nmr0) obj;
        return n8p1.o(nmr0Var.a, this.a) && n8p1.o(nmr0Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return td6.l(sb, this.b, "}");
    }
}
