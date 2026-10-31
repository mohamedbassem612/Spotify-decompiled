package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rv31 implements bw31 {
    public final vh90 a;
    public final String b;

    public rv31(vh90 vh90Var) {
        String str = vh90Var.a;
        this.a = vh90Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv31)) {
            return false;
        }
        rv31 rv31Var = (rv31) obj;
        return this.a.equals(rv31Var.a) && this.b.equals(rv31Var.b);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
