package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class isf {
    public final xpw a;
    public final psf b;

    public isf(bmr bmrVar, psf psfVar) {
        this.a = bmrVar;
        this.b = psfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isf)) {
            return false;
        }
        isf isfVar = (isf) obj;
        return this.a.equals(isfVar.a) && this.b.equals(isfVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
