package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nz implements m10 {
    public final float a;
    public final int b;
    public final int c;
    public final q5v d;

    public nz(float f, int i, int i2, q5v q5vVar) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = q5vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz)) {
            return false;
        }
        nz nzVar = (nz) obj;
        return Float.compare(this.a, nzVar.a) == 0 && this.b == nzVar.b && this.c == nzVar.c && this.d.equals(nzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
