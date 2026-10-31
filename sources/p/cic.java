package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cic extends aic {
    public float e;

    public cic(float f) {
        super(null);
        this.e = f;
    }

    @Override // p.aic
    public final float e() {
        char[] cArr;
        if (Float.isNaN(this.e) && (cArr = this.a) != null && cArr.length >= 1) {
            this.e = Float.parseFloat(d());
        }
        return this.e;
    }

    @Override // p.aic
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cic) {
            float fE = e();
            float fE2 = ((cic) obj).e();
            if ((Float.isNaN(fE) && Float.isNaN(fE2)) || fE == fE2) {
                return true;
            }
        }
        return false;
    }

    @Override // p.aic
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.e;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    @Override // p.aic
    public final int i() {
        char[] cArr;
        if (Float.isNaN(this.e) && (cArr = this.a) != null && cArr.length >= 1) {
            this.e = Integer.parseInt(d());
        }
        return (int) this.e;
    }
}
