package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oef extends zro1 {
    public final boolean b;
    public final nlv c;

    public oef(boolean z, nlv nlvVar) {
        this.b = z;
        this.c = nlvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oef)) {
            return false;
        }
        oef oefVar = (oef) obj;
        return this.b == oefVar.b && u890.j(this.c, oefVar.c);
    }

    public final int hashCode() {
        int i;
        int iHashCode = Boolean.hashCode(this.b) * 31;
        nlv nlvVar = this.c;
        if (nlvVar == null) {
            i = 0;
        } else {
            nlvVar.getClass();
            i = 2020616790;
        }
        return iHashCode + i;
    }
}
