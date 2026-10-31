package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class umm {
    public final zmm a;
    public final xmm b;

    public umm(xmm xmmVar, zmm zmmVar) {
        this.a = zmmVar;
        this.b = xmmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umm)) {
            return false;
        }
        umm ummVar = (umm) obj;
        return u890.j(this.a, ummVar.a) && this.b.equals(ummVar.b);
    }

    public final int hashCode() {
        zmm zmmVar = this.a;
        return this.b.a.hashCode() + ((zmmVar == null ? 0 : zmmVar.hashCode()) * 31);
    }
}
