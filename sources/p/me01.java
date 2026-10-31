package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class me01 implements ne01 {
    public final hc01 a;

    public me01(hc01 hc01Var) {
        this.a = hc01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me01) && this.a == ((me01) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
