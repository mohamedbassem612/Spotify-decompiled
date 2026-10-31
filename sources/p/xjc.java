package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xjc extends t3k1 {
    public final zxo1 b;

    public xjc(zxo1 zxo1Var) {
        this.b = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjc) && this.b.equals(((xjc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
