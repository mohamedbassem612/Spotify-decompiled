package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dww extends fww {
    public final sq81 a;

    public dww(sq81 sq81Var) {
        this.a = sq81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dww) && this.a.equals(((dww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
