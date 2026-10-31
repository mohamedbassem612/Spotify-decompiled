package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j281 {
    public final s281 a;
    public final s281 b;

    public j281(s281 s281Var, s281 s281Var2) {
        this.a = s281Var;
        this.b = s281Var2;
    }

    public final s281 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j281)) {
            return false;
        }
        j281 j281Var = (j281) obj;
        return this.a.equals(j281Var.a) && this.b.equals(j281Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
