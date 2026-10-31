package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j9g1 implements l9g1 {
    public final mwz0 a;

    public j9g1(mwz0 mwz0Var) {
        this.a = mwz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9g1) && this.a.equals(((j9g1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
