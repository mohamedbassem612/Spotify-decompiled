package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jh8 extends th8 {
    public final zxo1 a;

    public jh8(zxo1 zxo1Var) {
        this.a = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh8) && this.a.equals(((jh8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
