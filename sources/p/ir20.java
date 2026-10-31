package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ir20 implements l890, s7v, br20 {
    public final /* synthetic */ byte a;
    public float b;

    public ir20(wat watVar) {
        this.a = (byte) 5;
        this.b = watVar.h() * 386.0878f * 160.0f * 0.84f;
    }

    public float a(float f, long j) {
        long jM = m(f);
        return ((Float.intBitsToFloat((int) (lj4.a(jM > 0 ? j / jM : 1.0f) & 4294967295L)) * e(f)) / jM) * 1.0E9f;
    }

    public float b(float f, float f2, long j) {
        long jM = m(f2);
        return us71.e((int) (lj4.a(jM > 0 ? j / jM : 1.0f) >> 32), e(f2), f);
    }

    public j8n c(j8n j8nVar) {
        return j8nVar instanceof eo11 ? j8nVar : new c32(this.b, j8nVar);
    }

    public float d() {
        return 0.0f;
    }

    public float e(float f) {
        float[] fArr = lj4.a;
        float f2 = jsl1.a;
        float f3 = this.b;
        return Math.signum(f) * ((float) (Math.exp((jsl1.b / jsl1.c) * Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (f2 * f3)))) * f2 * f3));
    }

    public Drawable f(Bitmap bitmap) {
        bitmap.getClass();
        return new bcg(bitmap, this.b);
    }

    public mmr0 g(int i, int i2) {
        float f = this.b;
        if (i == 0 || i2 == 0) {
            return new mmr0(0, 0);
        }
        Integer numValueOf = Integer.valueOf(jch0.U(i / (f < 1.0f ? 1.0f : f)));
        float f2 = i2;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return new mmr0(numValueOf, Integer.valueOf(jch0.U(f2 / f)));
    }

    public long m(float f) {
        float[] fArr = lj4.a;
        return (long) (Math.exp(Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (jsl1.a * this.b))) / jsl1.c) * 1.0E9d);
    }

    public float p(float f, float f2) {
        return e(f2) + f;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return String.format(Locale.US, "unit(%.2f, %.2f)", Float.valueOf(0.0f), Float.valueOf(this.b));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ir20(byte b, float f) {
        this.a = b;
        this.b = f;
    }

    public float q(float f, float f2, float f3) {
        return f3;
    }
}
