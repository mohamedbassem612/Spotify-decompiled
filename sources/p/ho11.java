package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ho11 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final pim0 g;

    public ho11(long j, long j2, long j3, long j4, long j5, pim0 pim0Var, float[] fArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = pim0Var;
    }

    public final ur80 a() {
        long j = this.a;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.b;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.f;
        if (fArr != null) {
            return hm5.H(kch0.c(fArr, new n511(i, i2, i3, i4)));
        }
        long j3 = this.d;
        long j4 = this.c;
        int i5 = ((int) (j3 >> 32)) - ((int) (j4 >> 32));
        int i6 = ((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L));
        return new ur80(i + i5, i2 + i6, i3 + i5, i4 + i6);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && ho11.class == obj.getClass()) {
                ho11 ho11Var = (ho11) obj;
                if (this.a == ho11Var.a && this.b == ho11Var.b && this.e == ho11Var.e && qr80.b(this.c, ho11Var.c) && qr80.b(this.d, ho11Var.d)) {
                    float[] fArr = ho11Var.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.g.equals(ho11Var.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.e, 31), this.c, 31), this.d, 31);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iF + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
