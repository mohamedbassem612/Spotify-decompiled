package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bif0 implements cif0 {
    public final xlk1 a;

    public bif0(xlk1 xlk1Var) {
        this.a = xlk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bif0) && this.a == ((bif0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
