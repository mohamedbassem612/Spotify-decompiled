package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q76 implements m86 {
    public final nmu0 a;

    public q76(nmu0 nmu0Var) {
        this.a = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q76) && this.a == ((q76) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
