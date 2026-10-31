package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sui1 {
    public final boolean a;
    public final int b;
    public final int c;
    public final b0r[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public sui1(int i, boolean z) {
        int i2;
        this.a = z;
        this.b = i;
        if (z && l1d.d(i, 1)) {
            eg.m("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            i2 = 3;
        } else {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            i2 = 2;
        }
        this.c = i2;
        this.d = new b0r[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        b0r[] b0rVarArr = this.d;
        b0r b0rVar = b0rVarArr[i];
        if (b0rVar != null) {
            b0rVar.a = j;
            b0rVar.b = f;
        } else {
            b0r b0rVar2 = new b0r();
            b0rVar2.a = j;
            b0rVar2.b = f;
            b0rVarArr[i] = b0rVar2;
        }
    }

    public final float b() {
        boolean z;
        int i;
        float[] fArr;
        int i2;
        float[] fArr2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        b0r[] b0rVarArr = this.d;
        b0r b0rVar = b0rVarArr[i3];
        if (b0rVar == null) {
            return 0.0f;
        }
        int i4 = 0;
        b0r b0rVar2 = b0rVar;
        do {
            b0r b0rVar3 = b0rVarArr[i3];
            z = this.a;
            i = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (b0rVar3 == null) {
                i2 = i4;
                fArr2 = fArr3;
                f = 0.0f;
            } else {
                long j = b0rVar.a;
                i2 = i4;
                f = 0.0f;
                long j2 = b0rVar3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                float fAbs = Math.abs(j2 - b0rVar2.a);
                b0rVar2 = (i == 1 || z) ? b0rVar3 : b0rVar;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i2] = b0rVar3.b;
                    fArr[i2] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i2 + 1;
                }
            }
            i4 = i2;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            try {
                float[] fArr4 = this.h;
                eyo1.z(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iC != 1) {
                eg.o();
                return f;
            }
            int i5 = i4 - 1;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            qf80.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ sui1() {
        this(1, false);
    }
}
