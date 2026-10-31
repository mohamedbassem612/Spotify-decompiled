package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sxl implements uxl {
    public final int a;
    public final yvh b;

    public sxl(int i, yvh yvhVar) {
        this.a = i;
        this.b = yvhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxl)) {
            return false;
        }
        sxl sxlVar = (sxl) obj;
        return this.a == sxlVar.a && this.b.equals(sxlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
