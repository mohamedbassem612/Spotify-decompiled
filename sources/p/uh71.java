package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uh71 {
    public final tka0 a;
    public final Integer b;

    public uh71(tka0 tka0Var, Integer num) {
        this.a = tka0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh71)) {
            return false;
        }
        uh71 uh71Var = (uh71) obj;
        return u890.j(this.a, uh71Var.a) && u890.j(this.b, uh71Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
