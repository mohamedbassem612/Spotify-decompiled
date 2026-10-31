package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jj2 extends kj2 {
    public final ci2 a;

    public jj2(ci2 ci2Var) {
        this.a = ci2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jj2) && this.a.equals(((jj2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
