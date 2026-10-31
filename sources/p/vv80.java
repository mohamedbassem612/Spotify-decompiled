package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vv80 extends cw80 {
    public final zxo1 a;

    public vv80(zxo1 zxo1Var) {
        this.a = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv80) && this.a.equals(((vv80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
