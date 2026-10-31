package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a1f1 extends b1f1 {
    public final wze1 a;

    public a1f1(wze1 wze1Var) {
        this.a = wze1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1f1) && this.a.equals(((a1f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
