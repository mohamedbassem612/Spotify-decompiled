package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zv30 {
    public final yv30 a;
    public final int b;

    public zv30(yv30 yv30Var, int i) {
        this.a = yv30Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv30)) {
            return false;
        }
        zv30 zv30Var = (zv30) obj;
        return this.a.equals(zv30Var.a) && this.b == zv30Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return l1d.o(sb, this.b, ')');
    }
}
