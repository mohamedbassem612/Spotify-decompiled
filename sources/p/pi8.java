package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pi8 implements w11 {
    public final nl8 a;

    public pi8(nl8 nl8Var) {
        this.a = nl8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi8) && this.a.equals(((pi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
