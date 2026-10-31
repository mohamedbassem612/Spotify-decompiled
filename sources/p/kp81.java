package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kp81 extends eq81 {
    public final sh2 a;

    public kp81(sh2 sh2Var) {
        this.a = sh2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp81) && this.a.equals(((kp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
