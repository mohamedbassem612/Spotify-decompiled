package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lm8 extends rm8 {
    public final zxo1 a;

    public lm8(zxo1 zxo1Var) {
        this.a = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm8) && this.a.equals(((lm8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
