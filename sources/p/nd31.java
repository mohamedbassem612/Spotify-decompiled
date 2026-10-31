package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nd31 implements od31 {
    public final a4g1 a;

    public nd31(a4g1 a4g1Var) {
        this.a = a4g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd31) && this.a.equals(((nd31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
