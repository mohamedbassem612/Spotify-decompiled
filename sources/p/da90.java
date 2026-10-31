package p;

import android.icu.text.DecimalFormat;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class da90 extends f311 {
    public final bz60 a;
    public long b;
    public long c;
    public boolean d;
    public final qk41 e;

    public da90(bz60 bz60Var) {
        this.a = bz60Var;
        this.e = bz60Var.b ? new ok41((int) bz60Var.a) : pk41.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        i2c i2cVar2;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(156077502);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2cVar2 = i2cVar;
            i2 = (x340Var.g(i2cVar2) ? 4 : 2) | i;
        } else {
            i2cVar2 = i2cVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ux70(this, (byte) 20);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int i3 = i2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarU = qxy0.u(uyn1.z(32.0f, 0.0f, 2, h2c.a.a(u291.j(0.0f, i2cVar2.c() * 0.75f, 1, u291.f(nim0Var, 1.0f)), een.h)), (idn0) null, 3);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = o390.f;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarU, true, (iu30) objT2);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            g990 g990Var = (g990) this.a.c;
            if (g990Var instanceof d990) {
                x340Var.i0(-1842973659);
                e(rk41Var, (d990) g990Var, x340Var, (i3 >> 3) & 910);
                x340Var.r(false);
            } else if (g990Var instanceof f990) {
                x340Var.i0(-1842971065);
                f(rk41Var, (f990) g990Var, x340Var, (i3 >> 3) & 910);
                x340Var.r(false);
            } else {
                if (!(g990Var instanceof e990)) {
                    throw p3d1.k(x340Var, -1842976001, false);
                }
                x340Var.i0(-1297449890);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, i2cVar, rk41Var, function0, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01e9  */
    public final void e(rk41 rk41Var, d990 d990Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        long j;
        tob1 tob1Var;
        int i2;
        boolean z;
        int i3;
        bz60 bz60Var = this.a;
        boolean z2 = bz60Var.b;
        Object obj = fkj0.X;
        Integer num = 0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-388051461);
        int i4 = (i & 6) == 0 ? ((i & 8) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= b0kVar3.i(d990Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= b0kVar3.i(this) ? 256 : 128;
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            tob1 tob1Var2 = (tob1) bz60Var.d;
            boolean z3 = rk41Var.a;
            ilv.a.getClass();
            tob1 tob1VarO = mym.o(tob1Var2, z3, "counterReveal", 700, flv.g, (Function0) null, b0kVar3, 32);
            qan qanVar = d990Var.a;
            san sanVar = qanVar.d;
            String str = sanVar.b;
            if (z2 && ((tob1Var = (tob1) bz60Var.d) == null || ((Boolean) tob1Var.getValue()).booleanValue())) {
                b0kVar3.i0(1611410300);
                boolean z4 = rk41Var.a;
                b0kVar3.i0(1457062336);
                boolean zG = b0kVar3.g(qanVar);
                Object objT = b0kVar3.T();
                if (zG || objT == obj) {
                    long j2 = qanVar.a;
                    long j3 = qanVar.b;
                    if (j2 <= 0 || j3 <= j2 || (i2 = qanVar.c) <= 0) {
                        objT = new long[]{j3};
                    } else {
                        long j4 = ((long) i2) * 1000;
                        if (j4 > 2147483647L) {
                            j4 = 2147483647L;
                        }
                        int iP = yoi1.p(((int) j4) / 700, 2, 10000);
                        int i5 = iP - 1;
                        long j5 = j2 ^ j3;
                        hkm1 hkm1Var = new hkm1((int) j5, (int) (j5 >> 32));
                        int i6 = (iP + 3) / 5;
                        float[] fArr = new float[i6];
                        for (int i7 = 0; i7 < i6; i7++) {
                            fArr[i7] = (hkm1Var.e() * 2.9f) + 0.1f;
                        }
                        float[] fArr2 = new float[i5];
                        for (int i8 = 0; i8 < i5; i8++) {
                            fArr2[i8] = ((hkm1Var.e() * 0.59999996f) + 0.7f) * fArr[i8 / 5];
                        }
                        float f = 0.0f;
                        for (int i9 = 0; i9 < i5; i9++) {
                            f += fArr2[i9];
                        }
                        double d = f;
                        long j6 = j3 - j2;
                        long[] jArr = new long[iP];
                        jArr[0] = j2;
                        double d2 = 0.0d;
                        int i10 = 0;
                        while (i10 < i5) {
                            int i11 = i10;
                            double d3 = d;
                            d2 += (double) fArr2[i11];
                            i10 = i11 + 1;
                            jArr[i10] = ((long) (j6 * (d2 / d3))) + j2;
                            d = d3;
                        }
                        jArr[i5] = j3;
                        objT = jArr;
                    }
                    b0kVar3.s0(objT);
                } else {
                    tob1VarO = tob1VarO;
                    sanVar = sanVar;
                    str = str;
                }
                long[] jArr2 = (long[]) objT;
                Object objT2 = b0kVar3.T();
                if (objT2 == obj) {
                    if (this.b == 0) {
                        this.b = System.nanoTime();
                    }
                    long jNanoTime = ((System.nanoTime() - this.b) - this.c) / 1000000;
                    int length = jArr2.length;
                    long j7 = qanVar.a;
                    if (j7 <= 0 || qanVar.b <= j7 || (i3 = qanVar.c) <= 0 || length <= 1) {
                        objT2 = null;
                    } else {
                        long j8 = ((long) i3) * 1000;
                        if (j8 > 2147483647L) {
                            j8 = 2147483647L;
                        }
                        long j9 = (int) j8;
                        if (jNanoTime >= j9) {
                            objT2 = null;
                        } else {
                            if (jNanoTime < 0) {
                                jNanoTime = 0;
                            }
                            int i12 = length - 1;
                            objT2 = new ran(yoi1.p((int) ((jNanoTime / j9) * ((double) i12)), 0, i12), (int) (j9 - jNanoTime));
                        }
                    }
                    b0kVar3.s0(objT2);
                }
                ran ranVar = (ran) objT2;
                if (this.d || ranVar == null) {
                    b0kVar2 = b0kVar3;
                    z = false;
                    if (jArr2.length == 0) {
                        bhn0.t("Array is empty.");
                        return;
                    }
                    j = jArr2[jArr2.length - 1];
                } else {
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    boolean zH = b0kVar3.h(z4) | b0kVar3.i(this);
                    Object objT3 = b0kVar3.T();
                    if (zH || objT3 == obj) {
                        objT3 = new cb8(z4, this, (byte) 13);
                        b0kVar3.s0(objT3);
                    }
                    qxd0.i(boolValueOf, (iu30) objT3, b0kVar3);
                    hsi1 hsi1Var = new hsi1("liveCounter", Integer.valueOf(ranVar.a), Integer.valueOf(jArr2.length - 1), irn1.o0(ranVar.b, 0, mlv.d, 2), rno1.b);
                    boolean zI = b0kVar3.i(this);
                    Object objT4 = b0kVar3.T();
                    if (zI || objT4 == obj) {
                        objT4 = new nd70(this, (byte) 27);
                        b0kVar3.s0(objT4);
                    }
                    b0kVar2 = b0kVar3;
                    j = jArr2[((Number) zod.R(hsi1Var, z4, (Function0) objT4, b0kVar2, 8, 0).getValue()).intValue()];
                    z = false;
                }
                b0kVar2.r(z);
                b0kVar2.r(z);
            } else {
                str = str;
                b0kVar2 = b0kVar3;
                num = num;
                tob1VarO = tob1VarO;
                sanVar = sanVar;
                if (z2) {
                    b0kVar2.i0(1611570074);
                    b0kVar2.r(false);
                    j = qanVar.a;
                } else {
                    b0kVar2.i0(1611521404);
                    b0kVar2.r(false);
                    j = qanVar.b;
                }
            }
            boolean zI2 = b0kVar2.i(d990Var) | b0kVar2.f(j);
            Object objT5 = b0kVar2.T();
            if (zI2 || objT5 == obj) {
                objT5 = new lpa(d990Var, j, (byte) 2);
                b0kVar2.s0(objT5);
            }
            qxd0.S((Function0) objT5, b0kVar2);
            boolean zF = b0kVar2.f(j) | b0kVar2.g(sanVar);
            Object objT6 = b0kVar2.T();
            if (zF || objT6 == obj) {
                objT6 = nhc1.W(((DecimalFormat) sanVar.c.getValue()).format(j), ",", str);
                b0kVar2.s0(objT6);
            }
            String str2 = (String) objT6;
            boolean zG2 = b0kVar2.g(str2);
            Object objT7 = b0kVar2.T();
            if (zG2 || objT7 == obj) {
                objT7 = nhc1.W(str2, str, str.concat("\u200b"));
                b0kVar2.s0(objT7);
            }
            String str3 = (String) objT7;
            Integer num2 = num;
            vnr0 vnr0Var = (vnr0) d990Var.b.invoke(b0kVar2, num2);
            boolean zG3 = b0kVar2.g(vnr0Var) | b0kVar2.g(str3);
            Object objT8 = b0kVar2.T();
            if (zG3 || objT8 == obj) {
                objT8 = vnr0.a(vnr0Var, str3, lee1.a(vnr0Var.b, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), (kor0) null, 0L, 28);
                b0kVar2.s0(objT8);
            }
            vnr0 vnr0Var2 = (vnr0) objT8;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean zG4 = b0kVar2.g(str2);
            Object objT9 = b0kVar2.T();
            if (zG4 || objT9 == obj) {
                objT9 = new ry40(str2, (byte) 19);
                b0kVar2.s0(objT9);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT9);
            boolean zG5 = b0kVar2.g(tob1VarO);
            Object objT10 = b0kVar2.T();
            if (zG5 || objT10 == obj) {
                objT10 = new pak(tob1VarO, (byte) 14);
                b0kVar2.s0(objT10);
            }
            b0kVar3 = b0kVar2;
            qgo1.f(vnr0Var2, i541.C(qim0VarA, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, b0kVar3, 8, 56);
            op71.g(b0kVar3, u291.h(nim0Var, 6.0f));
            tob1 tob1Var3 = d990Var.e;
            boolean z5 = rk41Var.a;
            ilv.a.getClass();
            ven0 ven0VarO = mym.o(tob1Var3, z5, "subtitleReveal", StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, flv.d, (mim1) bz60Var.e, b0kVar3, 0);
            vnr0 vnr0Var3 = (vnr0) d990Var.c.invoke(b0kVar3, num2);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            boolean zG6 = b0kVar3.g(ven0VarO);
            Object objT11 = b0kVar3.T();
            if (zG6 || objT11 == obj) {
                objT11 = new pak(ven0VarO, (byte) 15);
                b0kVar3.s0(objT11);
            }
            qgo1.f(vnr0Var3, i541.C(qim0VarF2, (iu30) objT11), new a0e1(3), 0, false, (iu30) null, b0kVar3, 8, 56);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(this, rk41Var, d990Var, i, (byte) 10);
        }
    }

    public final void f(rk41 rk41Var, f990 f990Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(868852166);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(f990Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            bz60 bz60Var = this.a;
            tob1 tob1Var = (tob1) bz60Var.d;
            boolean z = rk41Var.a;
            ilv.a.getClass();
            ven0 ven0VarO = mym.o(tob1Var, z, "noCounterTitleReveal", 700, flv.g, (mim1) bz60Var.e, x340Var, 0);
            vnr0 vnr0Var = (vnr0) f990Var.a.invoke(x340Var, 0);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean zG = x340Var.g(ven0VarO);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new pak(ven0VarO, (byte) 16);
                x340Var.s0(objT);
            }
            qgo1.f(vnr0Var, i541.C(qim0VarF, (iu30) objT), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(this, rk41Var, f990Var, i, (byte) 11);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.e;
    }
}
