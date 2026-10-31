package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jd20 extends pd20 {
    public final yc20 a;

    public jd20(yc20 yc20Var) {
        this.a = yc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd20) && this.a.equals(((jd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
