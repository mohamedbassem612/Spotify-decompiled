package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b9g1 implements d9g1 {
    public final mwz0 a;

    public b9g1(mwz0 mwz0Var) {
        this.a = mwz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9g1) && this.a.equals(((b9g1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
