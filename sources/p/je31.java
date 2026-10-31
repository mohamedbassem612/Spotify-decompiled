package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class je31 extends hah {
    public static final bhn0 r;
    public final fol1 d;
    public final float e;
    public final float f;
    public final zeg1 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final zqu k;
    public final zw11 l;
    public final ge31 m;
    public final zqu n;
    public final hbz0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ge31 f51p;
    public final boolean q;

    static {
        new jxa((byte) 23);
        r = new bhn0((byte) 20);
    }

    public je31(String str, float[] fArr, fol1 fol1Var, float[] fArr2, zqu zquVar, zqu zquVar2, float f, float f2, zeg1 zeg1Var, int i) {
        super(12884901888L, i, str);
        this.d = fol1Var;
        this.e = f;
        this.f = f2;
        this.g = zeg1Var;
        this.k = zquVar;
        this.l = new zw11(this, (byte) 13);
        this.m = new ge31(this, (byte) 0);
        this.n = zquVar2;
        this.o = new hbz0(this, (byte) 8);
        this.f51p = new ge31(this, (byte) 1);
        if (fArr.length != 6 && fArr.length != 9) {
            hhg1.n("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            bhn0.j("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArrM = jxa.m(fArr);
        this.h = fArrM;
        if (fArr2 == null) {
            fArr2 = jxa.a(fArrM, fol1Var);
            this.i = fArr2;
        } else {
            if (fArr2.length != 9) {
                hhg1.n(f4i1.c(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.i = fArr2;
        }
        this.j = h5p1.A(fArr2);
        jxa.j(f, f2, fArrM);
        this.q = jxa.g(fArrM, fol1Var, zquVar, zquVar2, f, f2, i);
    }

    @Override // p.hah
    public final float a(int i) {
        return this.f;
    }

    @Override // p.hah
    public final float b(int i) {
        return this.e;
    }

    @Override // p.hah
    public final boolean c() {
        return this.q;
    }

    @Override // p.hah
    public final long d(float f, float f2, float f3) {
        double d = f;
        ge31 ge31Var = this.f51p;
        float fC = (float) ge31Var.c(d);
        float fC2 = (float) ge31Var.c(f2);
        float fC3 = (float) ge31Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fC3) + ((fArr[3] * fC2) + (fArr[0] * fC)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))));
    }

    @Override // p.hah
    public final float e(float f, float f2, float f3) {
        double d = f;
        ge31 ge31Var = this.f51p;
        float fC = (float) ge31Var.c(d);
        float fC2 = (float) ge31Var.c(f2);
        float fC3 = (float) ge31Var.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // p.hah
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || je31.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        je31 je31Var = (je31) obj;
        if (Float.compare(je31Var.e, this.e) != 0 || Float.compare(je31Var.f, this.f) != 0 || !u890.j(this.d, je31Var.d) || !Arrays.equals(this.h, je31Var.h)) {
            return false;
        }
        zeg1 zeg1Var = je31Var.g;
        zeg1 zeg1Var2 = this.g;
        if (zeg1Var2 != null) {
            return u890.j(zeg1Var2, zeg1Var);
        }
        if (zeg1Var == null) {
            return true;
        }
        if (u890.j(this.k, je31Var.k)) {
            return u890.j(this.n, je31Var.n);
        }
        return false;
    }

    @Override // p.hah
    public final long f(float f, float f2, float f3, float f4, hah hahVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        ge31 ge31Var = this.m;
        return z4p1.d((float) ge31Var.c(f5), (float) ge31Var.c(f6), (float) ge31Var.c(f7), f4, hahVar);
    }

    @Override // p.hah
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        zeg1 zeg1Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (zeg1Var != null ? zeg1Var.hashCode() : 0);
        if (zeg1Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public je31(String str, float[] fArr, fol1 fol1Var, zeg1 zeg1Var, int i) {
        this(str, fArr, fol1Var, null, jxa.e(zeg1Var), jxa.c(zeg1Var), 0.0f, 1.0f, zeg1Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public je31(String str, float[] fArr, fol1 fol1Var, final double d, float f, float f2, int i) {
        zqu zquVar;
        zqu zquVar2 = r;
        if (d == 1.0d) {
            zquVar = zquVar2;
        } else {
            final byte b = 0;
            zquVar = new zqu() { // from class: p.he31
                @Override // p.zqu
                public final double c(double d2) {
                    switch (b) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final byte b2 = 1;
            zquVar2 = new zqu() { // from class: p.he31
                @Override // p.zqu
                public final double c(double d2) {
                    switch (b2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, fol1Var, null, zquVar, zquVar2, f, f2, new zeg1(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
