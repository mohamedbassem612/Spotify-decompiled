package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s7i0 extends hno1 {
    public final e7i0 c;

    public s7i0(e7i0 e7i0Var) {
        this.c = e7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7i0) && u890.j(this.c, ((s7i0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
