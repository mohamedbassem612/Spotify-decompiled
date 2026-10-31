package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jxm1 {
    public final h290 a;

    public jxm1(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxm1) && this.a.equals(((jxm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
