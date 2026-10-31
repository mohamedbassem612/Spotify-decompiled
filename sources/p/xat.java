package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xat implements wat {
    public final float a;
    public final float b;

    public xat(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // p.wat
    public final float U0() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xat)) {
            return false;
        }
        xat xatVar = (xat) obj;
        return Float.compare(this.a, xatVar.a) == 0 && Float.compare(this.b, xatVar.b) == 0;
    }

    @Override // p.wat
    public final float h() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ")";
    }
}
