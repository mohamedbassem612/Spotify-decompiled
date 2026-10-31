package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mgj1 implements ogj1 {
    public final qij1 a;

    public mgj1(qij1 qij1Var) {
        this.a = qij1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgj1) && this.a.equals(((mgj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
