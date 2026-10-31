package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d0p0 extends g0p0 {
    public final ibu0 a;

    public d0p0(ibu0 ibu0Var) {
        this.a = ibu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0p0) && this.a.equals(((d0p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
