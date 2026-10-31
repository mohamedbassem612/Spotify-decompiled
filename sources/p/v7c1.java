package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7c1 extends w7c1 {
    public final a6c1 a;

    public v7c1(a6c1 a6c1Var) {
        this.a = a6c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7c1) && this.a.equals(((v7c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
