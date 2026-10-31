package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p3g0 implements q3g0 {
    public final r3g0 a;

    public p3g0(r3g0 r3g0Var) {
        this.a = r3g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3g0) && this.a == ((p3g0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
