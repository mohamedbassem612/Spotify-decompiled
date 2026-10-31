package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yvw extends fww {
    public final zxo1 a;

    public yvw(zxo1 zxo1Var) {
        this.a = zxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvw) && this.a.equals(((yvw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
