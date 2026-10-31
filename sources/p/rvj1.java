package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rvj1 implements tvj1 {
    public final y1k1 a;

    public rvj1(y1k1 y1k1Var) {
        this.a = y1k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvj1) && this.a.equals(((rvj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
