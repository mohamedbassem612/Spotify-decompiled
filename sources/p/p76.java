package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p76 implements m86 {
    public final nmu0 a;

    public p76(nmu0 nmu0Var) {
        this.a = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p76) && this.a == ((p76) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
