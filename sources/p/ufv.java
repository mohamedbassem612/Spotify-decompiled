package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ufv {
    public final sfv a;
    public final iix0 b;

    public ufv(sfv sfvVar, iix0 iix0Var) {
        this.a = sfvVar;
        this.b = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufv)) {
            return false;
        }
        ufv ufvVar = (ufv) obj;
        return this.a.equals(ufvVar.a) && this.b.equals(ufvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
