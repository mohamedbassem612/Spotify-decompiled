package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wif0 implements yif0 {
    public final tv80 a;

    public wif0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wif0) && this.a.equals(((wif0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
