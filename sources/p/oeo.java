package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oeo {
    public final iyl1 a;
    public final int b;

    public oeo(iyl1 iyl1Var, int i) {
        this.a = iyl1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeo)) {
            return false;
        }
        oeo oeoVar = (oeo) obj;
        return this.a.equals(oeoVar.a) && this.b == oeoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
