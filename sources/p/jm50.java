package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jm50 implements km50 {
    public final zv31 a;

    public jm50(zv31 zv31Var) {
        this.a = zv31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm50) && this.a.equals(((jm50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
