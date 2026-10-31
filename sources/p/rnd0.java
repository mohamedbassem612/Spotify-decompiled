package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rnd0 {
    public final k900 a;

    public rnd0(k900 k900Var) {
        this.a = k900Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnd0) && this.a.equals(((rnd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
