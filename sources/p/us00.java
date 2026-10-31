package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class us00 {
    public final ss00 a;
    public final ts00 b;

    public us00(ss00 ss00Var, ts00 ts00Var) {
        this.a = ss00Var;
        this.b = ts00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us00)) {
            return false;
        }
        us00 us00Var = (us00) obj;
        return this.a.equals(us00Var.a) && this.b.equals(us00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
