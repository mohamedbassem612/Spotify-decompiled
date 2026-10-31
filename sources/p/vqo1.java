package p;

import android.content.Context;
import android.os.PowerManager;
import android.os.UserManager;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vqo1 {
    public static final zap1 a = new zap1();
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0231  */
    /* JADX WARN: Code duplicated, block: B:109:0x023a  */
    /* JADX WARN: Code duplicated, block: B:110:0x023e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0262  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:117:0x0292  */
    /* JADX WARN: Code duplicated, block: B:118:0x0296  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    public static final void a(boolean z, iu30 iu30Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, qim0 qim0Var2, int i, float f, max maxVar, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        qim0 qim0Var3;
        int i5;
        float f2;
        boolean z2;
        int i6;
        qim0 qim0Var4;
        float f3;
        qim0 qim0Var5;
        max maxVar2;
        h311 h311VarV;
        int i7;
        qim0 qim0Var6;
        qim0 qim0Var7;
        max maxVar3;
        qim0 qim0Var8;
        int i8;
        int i9;
        vex vexVar;
        boolean zI;
        Object objT;
        Object objT2;
        Object objT3;
        boolean zI2;
        Object objT4;
        int iC;
        zzq0 zzq0Var;
        j2i j2iVarR;
        ?? r6;
        float f4;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        int iC2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1557488756);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i4 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        int i10 = i4 | 24576;
        int i11 = i3 & 32;
        if (i11 == 0) {
            if ((196608 & i2) == 0) {
                qim0Var3 = qim0Var2;
                i10 |= x340Var.i(qim0Var3) ? 131072 : 65536;
            }
            i5 = i10 | 1572864;
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f2 = f;
                    int i12 = x340Var.d(f2) ? 8388608 : 4194304;
                    i5 |= i12;
                } else {
                    f2 = f;
                }
                i5 |= i12;
            } else {
                f2 = f;
            }
            if ((100663296 & i2) == 0) {
                i5 |= 33554432;
            }
            if ((38347923 & i5) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i5 & 1, z2)) {
                x340Var.d0();
                i7 = i2 & 1;
                qim0Var6 = nim0.a;
                if (i7 != 0 || x340Var.E()) {
                    if (i11 != 0) {
                        qim0Var3 = qim0Var6;
                    }
                    if ((i3 & 128) != 0) {
                        i5 &= -29360129;
                        f2 = Float.NaN;
                    }
                    qim0Var7 = qim0Var3;
                    maxVar3 = jax.a;
                    qim0Var8 = qim0Var6;
                    i8 = i5 & (-234881025);
                    i9 = 1;
                } else {
                    x340Var.b0();
                    if ((i3 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    maxVar3 = maxVar;
                    qim0Var7 = qim0Var3;
                    i8 = i5 & (-234881025);
                    qim0Var8 = qim0Var;
                    i9 = i;
                }
                x340Var.s();
                gdx gdxVarS = yla.s(x340Var);
                uwr uwrVar = cbx.a;
                vexVar = (vex) zex.a.e;
                zI = x340Var.i(vexVar);
                objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new zj7(vexVar, (byte) 1);
                    x340Var.s0(objT);
                }
                vu30 vu30Var = (vu30) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = c37.i;
                    x340Var.s0(objT2);
                }
                hdx hdxVar = new hdx(0, vu30Var, (vu30) objT2, (vu30) null, (hw61) null, 25);
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = c37.h;
                    x340Var.s0(objT3);
                }
                vu30 vu30Var2 = (vu30) objT3;
                zI2 = x340Var.i(vexVar);
                objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new zj7(vexVar, (byte) 0);
                    x340Var.s0(objT4);
                }
                hdx hdxVar2 = new hdx(0, vu30Var2, (vu30) objT4, (vu30) null, (hw61) null, 25);
                iC = l1d.C(i9);
                if (iC != 0) {
                    x340Var.i0(-2125561489);
                    cvx cvxVar = cbx.b(x340Var).b;
                    mta mtaVar = cbx.b(x340Var).d;
                    zzq0Var = new zzq0(12.0f, 8.0f, 40.0f, 8.0f);
                    x340Var.r(false);
                } else {
                    if (iC == 1) {
                        throw p3d1.k(x340Var, -1454041059, false);
                    }
                    x340Var.i0(-2125255953);
                    mta mtaVar2 = cbx.b(x340Var).d;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(40.0f, 8.0f, 12.0f, 8.0f);
                    x340Var.r(false);
                }
                j2iVarR = apo.r(-1751989460, new qw1(z, iu30Var, hdxVar, qim0Var7, hdxVar2, maxVar3, gdxVarS, zzq0Var, j2iVar), x340Var);
                if (p3v.c(f2, Float.NaN)) {
                    x340Var.i0(-614459711);
                    mta mtaVar3 = cbx.b(x340Var).d;
                    r6 = 0;
                    x340Var.r(false);
                    f4 = 32.0f;
                } else {
                    r6 = 0;
                    x340Var.i0(-614401989);
                    x340Var.r(false);
                    f4 = f2;
                }
                jw31VarA = ew31.a(new d36(-f4, true, new um5((boolean) r6)), een.N0, x340Var, (int) r6);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var8);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z3 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z3) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                iC2 = l1d.C(i9);
                if (iC2 != 0) {
                    x340Var.i0(-577449855);
                    j2iVarR.invoke(x340Var, 6);
                    dv20.l((i8 >> 9) & 14, j2iVar2, x340Var, false);
                } else {
                    if (iC2 == 1) {
                        throw p3d1.k(x340Var, -295723396, false);
                    }
                    x340Var.i0(-577375548);
                    qim0 qim0VarX = lrn1.x(qim0Var6, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int i13 = i8;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    dv20.l((i13 >> 9) & 14, j2iVar2, x340Var, true);
                    j2iVarR.invoke(x340Var, 6);
                    x340Var.r(false);
                }
                x340Var.r(true);
                i6 = i9;
                f3 = f2;
                qim0Var4 = qim0Var7;
                qim0Var5 = qim0Var8;
                maxVar2 = maxVar3;
            } else {
                x340Var.b0();
                i6 = i;
                qim0Var4 = qim0Var3;
                f3 = f2;
                qim0Var5 = qim0Var;
                maxVar2 = maxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yj7(z, iu30Var, j2iVar, j2iVar2, qim0Var5, qim0Var4, i6, f3, maxVar2, i2, i3);
            }
        }
        i10 = 221184 | i4;
        qim0Var3 = qim0Var2;
        i5 = i10 | 1572864;
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                }
                i5 |= i12;
            } else {
                f2 = f;
            }
            i5 |= i12;
        } else {
            f2 = f;
        }
        if ((100663296 & i2) == 0) {
            i5 |= 33554432;
        }
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i5 & 1, z2)) {
            x340Var.d0();
            i7 = i2 & 1;
            qim0Var6 = nim0.a;
            if (i7 != 0) {
                if (i11 != 0) {
                    qim0Var3 = qim0Var6;
                }
                if ((i3 & 128) != 0) {
                    i5 &= -29360129;
                    f2 = Float.NaN;
                }
                qim0Var7 = qim0Var3;
                maxVar3 = jax.a;
                qim0Var8 = qim0Var6;
                i8 = i5 & (-234881025);
                i9 = 1;
            } else {
                if (i11 != 0) {
                    qim0Var3 = qim0Var6;
                }
                if ((i3 & 128) != 0) {
                    i5 &= -29360129;
                    f2 = Float.NaN;
                }
                qim0Var7 = qim0Var3;
                maxVar3 = jax.a;
                qim0Var8 = qim0Var6;
                i8 = i5 & (-234881025);
                i9 = 1;
            }
            x340Var.s();
            gdx gdxVarS2 = yla.s(x340Var);
            uwr uwrVar2 = cbx.a;
            vexVar = (vex) zex.a.e;
            zI = x340Var.i(vexVar);
            objT = x340Var.T();
            if (zI) {
                objT = new zj7(vexVar, (byte) 1);
                x340Var.s0(objT);
            } else {
                objT = new zj7(vexVar, (byte) 1);
                x340Var.s0(objT);
            }
            vu30 vu30Var3 = (vu30) objT;
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = c37.i;
                x340Var.s0(objT2);
            }
            hdx hdxVar3 = new hdx(0, vu30Var3, (vu30) objT2, (vu30) null, (hw61) null, 25);
            objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = c37.h;
                x340Var.s0(objT3);
            }
            vu30 vu30Var4 = (vu30) objT3;
            zI2 = x340Var.i(vexVar);
            objT4 = x340Var.T();
            if (zI2) {
                objT4 = new zj7(vexVar, (byte) 0);
                x340Var.s0(objT4);
            } else {
                objT4 = new zj7(vexVar, (byte) 0);
                x340Var.s0(objT4);
            }
            hdx hdxVar4 = new hdx(0, vu30Var4, (vu30) objT4, (vu30) null, (hw61) null, 25);
            iC = l1d.C(i9);
            if (iC != 0) {
                x340Var.i0(-2125561489);
                cvx cvxVar3 = cbx.b(x340Var).b;
                mta mtaVar4 = cbx.b(x340Var).d;
                zzq0Var = new zzq0(12.0f, 8.0f, 40.0f, 8.0f);
                x340Var.r(false);
            } else {
                if (iC == 1) {
                    throw p3d1.k(x340Var, -1454041059, false);
                }
                x340Var.i0(-2125255953);
                mta mtaVar5 = cbx.b(x340Var).d;
                cvx cvxVar4 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(40.0f, 8.0f, 12.0f, 8.0f);
                x340Var.r(false);
            }
            j2iVarR = apo.r(-1751989460, new qw1(z, iu30Var, hdxVar3, qim0Var7, hdxVar4, maxVar3, gdxVarS2, zzq0Var, j2iVar), x340Var);
            if (p3v.c(f2, Float.NaN)) {
                x340Var.i0(-614459711);
                mta mtaVar6 = cbx.b(x340Var).d;
                r6 = 0;
                x340Var.r(false);
                f4 = 32.0f;
            } else {
                r6 = 0;
                x340Var.i0(-614401989);
                x340Var.r(false);
                f4 = f2;
            }
            jw31VarA = ew31.a(new d36(-f4, true, new um5((boolean) r6)), een.N0, x340Var, (int) r6);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var8);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z3 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            iC2 = l1d.C(i9);
            if (iC2 != 0) {
                x340Var.i0(-577449855);
                j2iVarR.invoke(x340Var, 6);
                dv20.l((i8 >> 9) & 14, j2iVar2, x340Var, false);
            } else {
                if (iC2 == 1) {
                    throw p3d1.k(x340Var, -295723396, false);
                }
                x340Var.i0(-577375548);
                qim0 qim0VarX2 = lrn1.x(qim0Var6, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int i14 = i8;
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                dv20.l((i14 >> 9) & 14, j2iVar2, x340Var, true);
                j2iVarR.invoke(x340Var, 6);
                x340Var.r(false);
            }
            x340Var.r(true);
            i6 = i9;
            f3 = f2;
            qim0Var4 = qim0Var7;
            qim0Var5 = qim0Var8;
            maxVar2 = maxVar3;
        } else {
            x340Var.b0();
            i6 = i;
            qim0Var4 = qim0Var3;
            f3 = f2;
            qim0Var5 = qim0Var;
            maxVar2 = maxVar;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yj7(z, iu30Var, j2iVar, j2iVar2, qim0Var5, qim0Var4, i6, f3, maxVar2, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z, hux huxVar, gbx gbxVar, String str, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z2;
        h311 h311VarV;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(35163557);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(gbxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(str) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                if (i5 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                fq7.g(z, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(1523101645, new c9y(qim0Var3, str, gbxVar, huxVar, (byte) 26), x340Var), x340Var, (i4 & 14) | 196608, 18);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(z, huxVar, gbxVar, str, qim0Var2, i, i2);
            }
        }
        i3 |= 24576;
        qim0Var2 = qim0Var;
        i4 = i3;
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            if (i5 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            fq7.g(z, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(1523101645, new c9y(qim0Var3, str, gbxVar, huxVar, (byte) 26), x340Var), x340Var, (i4 & 14) | 196608, 18);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(z, huxVar, gbxVar, str, qim0Var2, i, i2);
        }
    }

    public static final kp00 c(Set set, iu30 iu30Var) {
        return new kp00(new tzq(set, iu30Var));
    }

    public static final void d(ps60 ps60Var, String str, int i, qim0 qim0Var, Function0 function0, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1988867468);
        int i3 = i2 | (x340Var.i(ps60Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | 3072 | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            tob1 tob1VarA = w191.a(z4p1.e(i), irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), "trackColorAnimation", x340Var, 384, 8);
            String strN0 = cwl1.n0(2131956502, new Object[]{str}, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(u291.f(qim0Var3, 1.0f), ((u7h) tob1VarA.getValue()).a, d4o1.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 8.0f, 8.0f);
            boolean z = (i3 & 57344) == 16384;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new isr0(function0, (byte) 9);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarY, false, null, null, null, (Function0) objT, 15);
            boolean zG = x340Var.g(strN0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new atp0(strN0, (byte) 17);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var2 = qim0Var3;
            w0h1.a(tnx.c, isl.a, anm1.N("pendingJamAttachmentJamIcon", u291.r(qim0Var3, 16.0f)), 0L, 0L, false, x340Var, tnx.d | 48, 56);
            cvx cvxVar3 = cbx.b(x340Var).b;
            lee1 lee1Var = ktd.l(qim0Var2, 4.0f, x340Var, x340Var).j;
            long j = cbx.a(x340Var).b.a;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(strN0, anm1.N("pendingJamAttachmentMessage", uyn1.B(wnb0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11)), lee1Var, j, null, null, 2, false, null, 0, null, x340Var, 0, 0, 1968);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 8.0f));
            qim0 qim0VarN = anm1.N("pendingJamAttachmentFacePile", qim0Var2);
            String str2 = ps60Var.c;
            String str3 = str2 == null ? "" : str2;
            String str4 = ps60Var.a;
            String str5 = ps60Var.b;
            fc11.a(mqo1.A(Collections.singletonList(new phx(8, 0L, str3, str4, str5 == null ? "" : str5))), qim0VarN, hcx.b, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 504);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(ps60Var, str, i, qim0Var2, function0, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(l8v0 l8v0Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strN0;
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1668355869);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(l8v0Var) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(bin.x(u291.f(nim0Var, 1.0f), false, null, null, null, function1, 15), 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
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
            uwo1.e(cwl1.o0(x340Var, 2131960231), null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            if (l8v0Var instanceof j8v0) {
                strN0 = x0d.k(x340Var, -1037685685, 2131960229, x340Var, false);
            } else if (l8v0Var instanceof i8v0) {
                strN0 = x0d.k(x340Var, -1037681078, 2131960228, x340Var, false);
            } else {
                if (!(l8v0Var instanceof k8v0)) {
                    throw p3d1.k(x340Var, -1037688052, false);
                }
                x340Var.i0(-1037676400);
                n7r n7rVar = (n7r) o7h.t0(((k8v0) l8v0Var).a - 1, n7r.i);
                if (n7rVar == null) {
                    n7rVar = n7r.a;
                }
                String[] weekdays = DateFormatSymbols.getInstance(Locale.forLanguageTag(upn1.p())).getWeekdays();
                int iA = n7rVar.a();
                strN0 = cwl1.n0(2131960230, new Object[]{(iA < 0 || iA >= weekdays.length) ? "" : weekdays[iA]}, x340Var);
                x340Var.r(false);
            }
            function1 = function0;
            uwo1.e(strN0, uyn1.B(nim0Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            nl70.c(i3o1.n(2131231590, x340Var, 0), (String) null, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, x340Var, 56, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(l8v0Var, function1, i, (byte) 12);
        }
    }

    public static final void f(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1259168681);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = osc1.c;
                x340Var.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            hdx hdxVar = new hdx(0, (vu30) null, (vu30) null, vu30Var, er31.b(8.0f), 7);
            cvx cvxVar = cbx.b(x340Var).b;
            boolean z = false;
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            float fM = dsa0.m(x340Var, 2131167089);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = sgc1.H(2, u291.b(fM, 0.0f, 2, qim0Var3));
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new are(iu30Var, str, (byte) 14);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(str), function0), hdxVar, qim0VarH, null, null, zzq0Var, null, null, null, null, apo.r(2126488854, new nl41(str, (byte) 26), x340Var), x340Var, 0, 48, 1976);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zj10(str, iu30Var, qim0Var2, i, (byte) 3);
        }
    }

    public static final boolean g(int i, String str) {
        if (str.length() == 0) {
            return false;
        }
        return ihc1.i0(str, '\n') || i > 1;
    }

    public static boolean h(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final ia00 i(xpw xpwVar) {
        return n3o1.q(xpwVar).a(h40.W0, ytg0.Y0);
    }

    public static final boolean j(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1455354909);
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            x340Var.r(false);
            return false;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        boolean z = !(powerManager != null && powerManager.isPowerSaveMode());
        x340Var.r(false);
        return z;
    }

    public static final int k(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2;
        }
        if (iC == 1) {
            return 3;
        }
        if (iC == 2) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public static final qim0 l(qim0 qim0Var) {
        return i1p1.q(exd0.r(qim0Var, s8x.O0), er31.a);
    }
}
