package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b820 implements d820 {
    public final xo20 a;

    public b820(xo20 xo20Var) {
        this.a = xo20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b820) && u890.j(this.a, ((b820) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
