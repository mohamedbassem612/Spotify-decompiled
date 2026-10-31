package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k341 extends r341 {
    public final zxo1 a;

    public k341(zxo1 zxo1Var) {
        this.a = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k341) && this.a.equals(((k341) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
