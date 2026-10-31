package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1h implements v1h {
    public final qnb1 a;

    public p1h(qnb1 qnb1Var) {
        this.a = qnb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1h) && this.a.equals(((p1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
