package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yp81 extends eq81 {
    public final j6s0 a;

    public yp81(j6s0 j6s0Var) {
        this.a = j6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp81) && this.a.equals(((yp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
