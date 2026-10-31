package p;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class chg1 extends cjg1 implements dhv {
    public boolean b;
    public boolean c;
    public d8b1 e;
    public final dna1 f;
    public Runnable g;
    public final /* synthetic */ glg1 h;
    public long a = -1;
    public byte d = 0;

    public chg1(glg1 glg1Var) {
        this.h = glg1Var;
        dna1 dna1Var = new dna1();
        long[] jArr = new long[20];
        dna1Var.b = jArr;
        dna1Var.c = new float[20];
        dna1Var.a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = dna1Var;
    }

    public final void b(jhg1 jhg1Var) {
        this.c = true;
    }

    @Override // p.dhv
    public final void h(float f) {
        glg1 glg1Var = this.h;
        long jMax = Math.max(-1L, Math.min(((jhg1) glg1Var).Y0 + 1, Math.round(f)));
        glg1Var.K(jMax, this.a);
        this.a = jMax;
    }

    public final void i() {
        if (this.b) {
            j();
            this.e.a(((jhg1) this.h).Y0 + 1);
        } else {
            this.d = (byte) 1;
            this.g = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    public final void j() {
        float f;
        dna1 dna1Var = this.f;
        float[] fArr = (float[]) dna1Var.c;
        long[] jArr = (long[]) dna1Var.b;
        if (this.e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f2 = this.a;
        boolean z = true;
        char c = 20;
        int i = (dna1Var.a + 1) % 20;
        dna1Var.a = i;
        jArr[i] = jCurrentAnimationTimeMillis;
        fArr[i] = f2;
        int i2 = 0;
        ir20 ir20Var = new ir20((byte) 0);
        float fSqrt = 0.0f;
        ir20Var.b = 0.0f;
        this.e = new d8b1(ir20Var);
        e8b1 e8b1Var = new e8b1();
        e8b1Var.a();
        e8b1Var.b(200.0f);
        d8b1 d8b1Var = this.e;
        d8b1Var.m = e8b1Var;
        d8b1Var.b = this.a;
        d8b1Var.c = true;
        ArrayList arrayList = d8b1Var.l;
        if (d8b1Var.f) {
            hhg1.h("Error: Update listeners must be added beforethe animation.");
            return;
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        d8b1 d8b1Var2 = this.e;
        int i3 = dna1Var.a;
        if (i3 != 0 || jArr[i3] != Long.MIN_VALUE) {
            long j = jArr[i3];
            long j2 = j;
            while (true) {
                long j3 = jArr[i3];
                if (j3 == Long.MIN_VALUE) {
                    f = fSqrt;
                    break;
                }
                f = fSqrt;
                boolean z2 = z;
                float f3 = j - j3;
                float fAbs = Math.abs(j3 - j2);
                if (f3 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i3 == 0) {
                    i3 = 20;
                }
                i3--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                j2 = j3;
                z = z2;
                fSqrt = f;
            }
            if (i2 < 2) {
                fSqrt = f;
            } else {
                int i4 = dna1Var.a;
                float f4 = 1000.0f;
                if (i2 == 2) {
                    int i5 = i4 == 0 ? 19 : i4 - 1;
                    float f5 = jArr[i4] - jArr[i5];
                    if (f5 == f) {
                        fSqrt = f;
                    } else {
                        fSqrt = 1000.0f * ((fArr[i4] - fArr[i5]) / f5);
                    }
                } else {
                    int i6 = ((i4 - i2) + 21) % 20;
                    int i7 = (i4 + 21) % 20;
                    long j4 = jArr[i6];
                    float f6 = fArr[i6];
                    int i8 = i6 + 1;
                    int i9 = i8 % 20;
                    float f7 = f;
                    while (i9 != i7) {
                        long j5 = jArr[i9];
                        char c2 = c;
                        long j6 = j4;
                        float f8 = j5 - j6;
                        if (f8 == f) {
                            j4 = j6;
                        } else {
                            float f9 = fArr[i9];
                            float f10 = (f9 - f6) / f8;
                            float fAbs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(Math.abs(f7) * 2.0f) * ((double) Math.signum(f7)))))) + f7;
                            i9 = i9;
                            if (i9 == i8) {
                                fAbs2 *= 0.5f;
                            }
                            f7 = fAbs2;
                            f6 = f9;
                            j4 = j5;
                        }
                        i9 = (i9 + 1) % 20;
                        f4 = f4;
                        c = c2;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f7) * 2.0f) * ((double) Math.signum(f7)))) * f4;
                }
            }
        }
        d8b1Var2.a = fSqrt;
        d8b1 d8b1Var3 = this.e;
        d8b1Var3.g = ((jhg1) this.h).Y0 + 1;
        d8b1Var3.h = -1.0f;
        d8b1Var3.j = 4.0f;
        chv chvVar = new chv() { // from class: p.bhg1
            @Override // p.chv
            public final void a(d8b1 d8b1Var4, boolean z3, float f11) {
                chg1 chg1Var = this.a;
                glg1 glg1Var = chg1Var.h;
                if (z3) {
                    return;
                }
                hhg1 hhg1Var = ihg1.w0;
                if (f11 >= 1.0f) {
                    glg1Var.D(glg1Var, hhg1Var, false);
                    return;
                }
                long j7 = ((jhg1) glg1Var).Y0;
                jhg1 jhg1VarV = glg1Var.V(0);
                jhg1 jhg1Var = jhg1VarV.S0;
                jhg1VarV.S0 = null;
                glg1Var.K(-1L, chg1Var.a);
                glg1Var.K(j7, -1L);
                chg1Var.a = j7;
                Runnable runnable = chg1Var.g;
                if (runnable != null) {
                    runnable.run();
                }
                ((jhg1) glg1Var).U0.clear();
                if (jhg1Var != null) {
                    jhg1Var.D(jhg1Var, hhg1Var, true);
                }
            }
        };
        ArrayList arrayList2 = d8b1Var3.k;
        if (arrayList2.contains(chvVar)) {
            return;
        }
        arrayList2.add(chvVar);
    }

    public final void k() {
        glg1 glg1Var = this.h;
        long j = ((jhg1) glg1Var).Y0 == 0 ? 1L : 0L;
        glg1Var.K(j, this.a);
        this.a = j;
    }

    public final void l() {
        this.b = true;
        byte b = this.d;
        if (b == 1) {
            this.d = (byte) 0;
            i();
        } else if (b == 2) {
            this.d = (byte) 0;
            this.g = this.g;
            j();
            this.e.a(0.0f);
        }
    }
}
