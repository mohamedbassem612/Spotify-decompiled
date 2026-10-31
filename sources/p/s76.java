package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s76 implements m86 {
    public final nmu0 a;

    public s76(nmu0 nmu0Var) {
        this.a = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s76) && this.a == ((s76) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
