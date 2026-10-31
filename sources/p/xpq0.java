package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xpq0 extends ypq0 {
    public final lj70 a;

    public xpq0(lj70 lj70Var) {
        this.a = lj70Var;
    }

    public final lj70 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpq0) && this.a.equals(((xpq0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
