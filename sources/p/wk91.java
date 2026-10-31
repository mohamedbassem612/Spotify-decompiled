package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wk91 extends yk91 {
    public final y0a1 a;

    public wk91(y0a1 y0a1Var) {
        this.a = y0a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk91) && this.a.equals(((wk91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
