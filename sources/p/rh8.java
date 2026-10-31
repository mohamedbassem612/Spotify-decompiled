package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rh8 extends th8 {
    public final sq81 a;

    public rh8(sq81 sq81Var) {
        this.a = sq81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh8) && this.a.equals(((rh8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
