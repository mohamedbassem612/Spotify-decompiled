package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class nel1 {
    public static final long a;
    public static final long b;

    static {
        long j = u7h.f;
        a = u7h.b(j, 0.25f, 0.0f, 0.0f, 0.0f, 14);
        b = u7h.b(j, 0.55f, 0.0f, 0.0f, 0.0f, 14);
    }

    public static final void a(nue1 nue1Var, zge1 zge1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f;
        float[] fArrCopyOf;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1176757602);
        int i2 = (x340Var.i(nue1Var) ? 4 : 2) | i | (x340Var.i(zge1Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ejk1 ejk1Var = nue1Var.a;
            float f2 = ejk1Var.b;
            long j = ejk1Var.a;
            if (f2 <= 0.0f || ejk1Var.b() <= 0.0f || j <= 0) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mel1(nue1Var, zge1Var, i, (byte) 0);
                    return;
                }
                return;
            }
            boolean zG = x340Var.g(zge1Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                ArrayList arrayList = zge1Var.c;
                int size = arrayList.size();
                ArrayList arrayList2 = zge1Var.d;
                int size2 = arrayList2.size();
                ArrayList arrayList3 = zge1Var.e;
                f = 0.0f;
                int iMin = Math.min(size, Math.min(size2, arrayList3.size()));
                if (iMin == 0) {
                    objT = new float[0];
                } else {
                    float[] fArr = new float[iMin];
                    float f3 = 0.0f;
                    for (int i3 = 0; i3 < iMin; i3++) {
                        float fD = ((float) u890.D(((p3h1) arrayList.get(i3)).a & 255)) + ((float) u890.D(((p3h1) arrayList2.get(i3)).a & 255)) + ((float) u890.D(((p3h1) arrayList3.get(i3)).a & 255));
                        fArr[i3] = fD;
                        if (fD > f3) {
                            f3 = fD;
                        }
                    }
                    if (f3 <= 0.0f) {
                        objT = new float[0];
                    } else {
                        float[] fArr2 = new float[iMin];
                        int i4 = 0;
                        while (i4 < iMin) {
                            float[] fArr3 = fArr2;
                            fArr3[i4] = (float) Math.pow(fArr[i4] / f3, 0.6499999761581421d);
                            i4++;
                            iMin = iMin;
                            fArr2 = fArr3;
                        }
                        objT = fArr2;
                    }
                }
                x340Var.s0(objT);
            } else {
                f = 0.0f;
            }
            float[] fArr4 = (float[]) objT;
            if (fArr4.length == 0) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new mel1(nue1Var, zge1Var, i, (byte) 1);
                    return;
                }
                return;
            }
            float fB = ejk1Var.b() * j;
            int i5 = (int) fB;
            if (i5 < 1) {
                i5 = 1;
            }
            boolean zG2 = x340Var.g(fArr4) | x340Var.e(i5);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                if (i5 <= 0 || fArr4.length == 0) {
                    int i6 = i5;
                    fArrCopyOf = new float[i6 < 0 ? 0 : i6];
                } else {
                    if (i5 < fArr4.length) {
                        float[] fArr5 = new float[i5];
                        int i7 = 0;
                        while (i7 < i5) {
                            long j2 = i7;
                            int i8 = i7;
                            long j3 = i5;
                            float[] fArr6 = fArr5;
                            int i9 = i5;
                            int length = (int) (((j2 + 1) * ((long) fArr4.length)) / j3);
                            float f4 = f;
                            for (int length2 = (int) ((((long) fArr4.length) * j2) / j3); length2 < length; length2++) {
                                float f5 = fArr4[length2];
                                if (f5 > f4) {
                                    f4 = f5;
                                }
                            }
                            fArr6[i8] = f4;
                            i7 = i8 + 1;
                            fArr5 = fArr6;
                            i5 = i9;
                        }
                        objT2 = fArr5;
                    } else if (i5 == fArr4.length) {
                        fArrCopyOf = Arrays.copyOf(fArr4, fArr4.length);
                    } else {
                        fArrCopyOf = new float[i5];
                        for (int i10 = 0; i10 < i5; i10++) {
                            fArrCopyOf[i10] = fArr4[yoi1.q(jch0.U((i10 * (fArr4.length - 1)) / (i5 - 1)), new tr80(0, fArr4.length - 1, 1))];
                        }
                    }
                    x340Var.s0(objT2);
                }
                objT2 = fArrCopyOf;
                x340Var.s0(objT2);
            }
            float[] fArr7 = (float[]) objT2;
            qim0Var2 = nim0.a;
            qim0 qim0VarR = i1p1.r(u291.h(u291.f(qim0Var2, 1.0f), 46.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            boolean zG3 = x340Var.g(ejk1Var) | x340Var.d(fB) | x340Var.i(fArr7);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new ja5(ejk1Var, fB, fArr7, (byte) 10);
                x340Var.s0(objT3);
            }
            j0o1.b(0, x340Var, (iu30) objT3, qim0VarD);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new pej1(nue1Var, zge1Var, qim0Var2, i, (byte) 14);
        }
    }

    public static final void b(DrawScope drawScope, float[] fArr, float f, float f2, float f3, float f4, long j) {
        tw4 tw4VarA = ww4.a();
        tw4VarA.k(0.0f, f);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            tw4VarA.j((f3 / 2.0f) + (i * f3), f - Math.max((fArr[i] * f2) * f4, 0.5f));
        }
        int length2 = fArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                tw4VarA.j((f3 / 2.0f) + (length2 * f3), Math.max(fArr[length2] * f2 * f4, 0.5f) + f);
                if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        tw4VarA.g();
        DrawScope.w0(drawScope, tw4VarA, j, (DrawStyle) null, 60);
    }
}
