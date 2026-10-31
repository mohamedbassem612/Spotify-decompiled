package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bhv implements br20 {
    public float a;
    public float b;

    public bhv(float f, float f2, byte b) {
        switch (b) {
            case 2:
                this.a = f;
                this.b = f2;
                break;
            default:
                this.a = Math.max(1.0E-7f, Math.abs(f2));
                this.b = Math.max(1.0E-4f, f) * (-4.2f);
                break;
        }
    }

    public float a(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    public float b(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public float c(float f) {
        return (f / 334.0f) * this.a;
    }

    public float d() {
        return this.a;
    }

    public float e(float f) {
        return (f / 497.87f) * this.b;
    }

    public long m(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    public float p(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.a;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.b;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }
}
