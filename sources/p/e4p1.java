package p;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.familyverify.v1.BlockElement;
import com.spotify.familyverify.v1.GetManagerStepContents;
import com.spotify.familyverify.v1.GetQrCodeVerificationOnboardingResponse;
import com.spotify.familyverify.v1.OnboardingStepsContents;
import com.spotify.familyverify.v1.QrCodeDisplay;
import com.spotify.familyverify.v1.StartQrCodeVerificationFlowResponse;
import com.spotify.familyverify.v1.SupportLink;
import com.spotify.familyverify.v1.VerificationFailureViewContents;
import com.spotify.familyverify.v1.VerificationNotRequiredViewContents;
import com.spotify.familyverify.v1.VerificationSucceededViewContents;
import com.spotify.familyverify.v1.VerifyQrCodeResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class e4p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(iec iecVar, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        b0k b0kVar2;
        boolean z2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2035266338);
        int i4 = (b0kVar3.i(iecVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (b0kVar3.h(z) ? 32 : 16);
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i5 != 0 ? true : z;
            gec gecVar = iecVar.a;
            String str = gecVar.a;
            String str2 = gecVar.b;
            yae1 yae1VarQ = d5p1.q(0, b0kVar3, 1);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).h;
            wat watVar = (wat) b0kVar3.k(t4k.h);
            b0kVar3.i0(-1680818716);
            int iI0 = watVar.i0(cbx.b(b0kVar3).b.b * 2.0f);
            b0kVar3.r(false);
            boolean z4 = z3;
            j2i j2iVarR = apo.r(502969928, new j61(iI0, str2, yae1VarQ, str, lee1Var, iecVar, z4), b0kVar3);
            b0kVar2 = b0kVar3;
            w2g0.c((qim0) null, (tl3) null, j2iVarR, b0kVar2, 3072, 7);
            z2 = z4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z2 = z;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new k61((byte) 0, i, i2, iecVar, z2);
        }
    }

    public static final void b(be50 be50Var, long j, xo30 xo30Var, p3v p3vVar, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        xo30 xo30Var2;
        long jB;
        long j2;
        long j3;
        boolean z;
        float f;
        m4c m4cVar;
        j2i j2iVar2 = j2iVar;
        long j4 = xo30Var.a;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(679580543);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(be50Var) : x340Var.i(be50Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(xo30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(p3vVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            if (objT == m4cVar2) {
                objT = kaa0.h(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar2) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT2;
            long jB2 = xo30Var.b;
            long j5 = u7h.k;
            if (z4h1.b(j4, j5)) {
                x340Var.i0(-1091460127);
                uwr uwrVar = cbx.a;
                jB = u7h.b(cbx.a(x340Var).a.c, 0.65f, 0.0f, 0.0f, 0.0f, 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-1091358974);
                x340Var.r(false);
                jB = j4;
            }
            if (z4h1.b(jB2, j5)) {
                x340Var.i0(-1091240771);
                uwr uwrVar2 = cbx.a;
                jB2 = u7h.b(cbx.a(x340Var).c.b, 0.15f, 0.0f, 0.0f, 0.0f, 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-1091135712);
                x340Var.r(false);
            }
            long j6 = jB2;
            wat watVar = (wat) x340Var.k(t4k.h);
            float fX0 = watVar.X0(40.0f);
            float fX1 = watVar.X0(p3vVar.a);
            float fS = err0Var.s() + fX1;
            boolean zD = x340Var.d(fX0) | x340Var.d(fS);
            int i3 = i2;
            Object objT3 = x340Var.T();
            if (zD || objT3 == m4cVar2) {
                objT3 = Build.VERSION.SDK_INT >= 31 ? mb4.a(fX0, fS) : null;
                x340Var.s0(objT3);
            }
            vc21 vc21Var = (vc21) objT3;
            boolean zF = x340Var.f(jB);
            long j7 = jB;
            Object objT4 = x340Var.T();
            if (zF || objT4 == m4cVar2) {
                mmr0[] mmr0VarArr = new mmr0[9];
                int i4 = 0;
                for (int i5 = 9; i4 < i5; i5 = 9) {
                    float f2 = i4 / 8.0f;
                    Float fValueOf = Float.valueOf(f2);
                    long j8 = j6;
                    long jB3 = u7h.b(j7, k(f2) * u7h.c(j7), 0.0f, 0.0f, 0.0f, 14);
                    long j9 = j7;
                    int i6 = i4;
                    mmr0VarArr[i6] = new mmr0(fValueOf, new u7h(jB3));
                    i4 = i6 + 1;
                    j6 = j8;
                    j7 = j9;
                }
                j2 = j6;
                j3 = j7;
                objT4 = v9c.t(mmr0VarArr, 0.0f, 0.0f, 14);
                x340Var.s0(objT4);
            } else {
                j2 = j6;
                j3 = j7;
            }
            Brush brush = (Brush) objT4;
            boolean zD2 = x340Var.d(fX1);
            Object objT5 = x340Var.T();
            if (zD2 || objT5 == m4cVar2) {
                objT5 = new jc5((byte) 5, fX1);
                x340Var.s0(objT5);
            }
            qim0 qim0VarS = exd0.s(qim0Var, (iu30) objT5);
            boolean zI = x340Var.i(err0Var);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar2) {
                objT6 = new tu9(err0Var, (byte) 0);
                x340Var.s0(objT6);
            }
            qim0 qim0VarU = lrn1.u(qim0VarS, (iu30) objT6);
            boolean zI2 = x340Var.i(ven0Var);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == m4cVar2) {
                objT7 = new cy7(ven0Var, (byte) 6);
                x340Var.s0(objT7);
            }
            qim0 qim0VarX = ern1.x(qim0VarU, (iu30) objT7);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            if (be50Var != null) {
                x340Var.i0(-622668727);
                long jF = Offset.f(j, ((Offset) ven0Var.getValue()).a);
                nim0 nim0Var = nim0.a;
                h2c h2cVar = h2c.a;
                if (vc21Var != null) {
                    x340Var.i0(-622584903);
                    qim0 qim0VarB = h2cVar.b(nim0Var);
                    boolean zI3 = x340Var.i(vc21Var);
                    Object objT8 = x340Var.T();
                    if (zI3 || objT8 == m4cVar2) {
                        objT8 = new uv8(vc21Var, (byte) 21);
                        x340Var.s0(objT8);
                    }
                    qim0 qim0VarC = i541.C(qim0VarB, (iu30) objT8);
                    boolean zF2 = x340Var.f(jF) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(be50Var)));
                    Object objT9 = x340Var.T();
                    if (zF2 || objT9 == m4cVar2) {
                        z = false;
                        objT9 = new uu9(jF, be50Var, (byte) 0);
                        x340Var.s0(objT9);
                    } else {
                        z = false;
                    }
                    op71.g(x340Var, exd0.s(qim0VarC, (iu30) objT9));
                    x340Var.r(z);
                    m4cVar = m4cVar2;
                    f = fX1;
                } else {
                    z = false;
                    x340Var.i0(-622094111);
                    qim0 qim0VarB2 = h2cVar.b(nim0Var);
                    ukb0 ukb0Var = be50.C;
                    f = fX1;
                    m4cVar = m4cVar2;
                    i8p1.g(be50Var, fX0, qim0VarB2, jF, f, fS, x340Var, 392 | (i3 & 14));
                    x340Var.r(false);
                }
                xo30Var2 = xo30Var;
                if (xo30Var2.c) {
                    x340Var.i0(-621743191);
                    e(xo30Var2.d, 6, j2, x340Var);
                    x340Var.r(z);
                } else {
                    x340Var.i0(-621570211);
                    x340Var.r(z);
                }
                qim0 qim0VarB3 = h2cVar.b(nim0Var);
                long j10 = j3;
                boolean zF3 = ((i3 & 7168) == 2048) | x340Var.f(j10) | x340Var.i(brush) | x340Var.d(f);
                Object objT10 = x340Var.T();
                if (zF3 || objT10 == m4cVar) {
                    ef6 ef6Var = new ef6(p3vVar, j10, brush, f);
                    x340Var.s0(ef6Var);
                    objT10 = ef6Var;
                }
                op71.g(x340Var, exd0.s(qim0VarB3, (iu30) objT10));
                x340Var.r(false);
            } else {
                xo30Var2 = xo30Var;
                i3 = i3;
                x340Var.i0(-621142659);
                x340Var.r(false);
            }
            j2iVar2 = j2iVar;
            dv20.l((i3 >> 12) & 14, j2iVar2, x340Var, true);
        } else {
            xo30Var2 = xo30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu9(be50Var, j, xo30Var2, p3vVar, j2iVar2, qim0Var, i);
        }
    }

    public static final void c(boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2002380110);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(u291.h(qim0Var3, 32.0f), cbx.a(x340Var).a.b.a(), er31.a(50));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            int i3 = i2 >> 3;
            f(z, function0, cwl1.o0(x340Var, 2131958687), cwl1.o0(x340Var, 2131958686), anm1.N("mixing_undo_button", qim0Var3), false, x340Var, (i2 & 14) | 24576 | (i3 & 112), 32);
            f(z2, function1, cwl1.o0(x340Var, 2131958681), cwl1.o0(x340Var, 2131958680), anm1.N("mixing_redo_button", qim0Var3), true, x340Var, 221184 | (i3 & 14) | ((i2 >> 6) & 112), 0);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new knk0(z, z2, function0, function1, qim0Var2, i, (byte) 0);
        }
    }

    public static final void d(be50 be50Var, qim0 qim0Var, long j, xo30 xo30Var, float f, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        xo30 xo30Var2;
        j2i j2iVar2;
        float f2;
        float f3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(286751283);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(be50Var) : x340Var.i(be50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            xo30Var2 = xo30Var;
            i2 |= x340Var.g(xo30Var2) ? 2048 : 1024;
        } else {
            xo30Var2 = xo30Var;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            j2iVar2 = j2iVar;
            i3 |= x340Var.i(j2iVar2) ? 131072 : 65536;
        } else {
            j2iVar2 = j2iVar;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                f3 = 32.0f;
            } else {
                x340Var.b0();
                f3 = f;
            }
            x340Var.s();
            p3v p3vVar = new p3v(f3);
            ukb0 ukb0Var = be50.C;
            int i4 = i3 >> 3;
            b(be50Var, j, xo30Var2, p3vVar, j2iVar2, qim0Var, x340Var, (i3 & 14) | 8 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | ((i3 << 12) & 458752));
            f2 = f3;
        } else {
            x340Var.b0();
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wu9(be50Var, qim0Var, j, xo30Var, f2, j2iVar, i);
        }
    }

    public static final void e(int i, int i2, long j, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1463592948);
        int i3 = (x340Var.f(j) ? 32 : 16) | i2 | (x340Var.d(1.0f) ? 256 : 128) | (x340Var.e(l1d.C(i)) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarB = h2c.a.b(nim0.a);
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new xu9(i, j);
                x340Var.s0(objT);
            }
            op71.g(x340Var, exd0.s(qim0VarB, (iu30) objT));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yu9(i, j, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void f(boolean z, Function0 function0, String str, String str2, qim0 qim0Var, boolean z2, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        b0k b0kVar2;
        boolean z5;
        h311 h311VarV;
        boolean z6;
        ldx ldxVar;
        gdx gdxVarA;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2136692211);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i3 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                i3 |= b0kVar3.h(z3) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i3 & 1, z4)) {
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                ldxVar = ldx.c;
                gdxVarA = yla.s(b0kVar3).a();
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(str2), function0);
                if (z) {
                    haxVar = jax.a;
                } else {
                    haxVar = new hax(str);
                }
                b0kVar2 = b0kVar3;
                wro1.h(gbxVar, ldxVar, qim0Var, haxVar, gdxVarA, null, false, null, null, apo.r(-1507274500, new mv8(str2, z6, b2), b0kVar3), b0kVar2, ((i3 >> 6) & 896) | 48, 6, 968);
                z5 = z6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new oli0(z, function0, str, str2, qim0Var, z5, i, i2);
            }
        }
        i3 |= 196608;
        z3 = z2;
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i3 & 1, z4)) {
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            ldxVar = ldx.c;
            gdxVarA = yla.s(b0kVar3).a();
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(str2), function0);
            if (z) {
                haxVar = jax.a;
            } else {
                haxVar = new hax(str);
            }
            b0kVar2 = b0kVar3;
            wro1.h(gbxVar2, ldxVar, qim0Var, haxVar, gdxVarA, null, false, null, null, apo.r(-1507274500, new mv8(str2, z6, b2), b0kVar3), b0kVar2, ((i3 >> 6) & 896) | 48, 6, 968);
            z5 = z6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z5 = z3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oli0(z, function0, str, str2, qim0Var, z5, i, i2);
        }
    }

    public static final void h(ji50 ji50Var, it8 it8Var) {
        if (it8Var != null) {
            ji50Var.b.put(zoc.class, new r3r(new qlb(ji50Var.a, new hpc((kpc) it8Var.c, (byte) 0), ((xoc) it8Var.b).a), h211.c1, 4));
        }
    }

    public static final lt20 i(m441 m441Var, iu30 iu30Var) {
        l811 l811Var = new l811();
        return new lt20(new fu20(m441Var, new os20(l811Var, iu30Var, (lnm) null, (byte) 0), (byte) 1), new qr0(l811Var, iu30Var, (lnm) null, (byte) 21), (byte) 0);
    }

    public static String j(fhc fhcVar) {
        StringBuilder sb = new StringBuilder(fhcVar.size());
        for (int i = 0; i < fhcVar.size(); i++) {
            byte b2 = fhcVar.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case grn1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final float k(float f) {
        return 1.0f - (((((6.0f * f) - 15.0f) * f) + 10.0f) * ((f * f) * f));
    }

    public static final zcu0 l(k5u0 k5u0Var, Long l) {
        long j = k5u0Var.b;
        m0u0 m0u0Var = k5u0Var.a;
        String str = (String) m0u0Var.a.d.get("playback_id");
        Long l2 = k5u0Var.c;
        Long l3 = k5u0Var.d;
        boolean z = k5u0Var.e;
        return new zcu0(j, str, l2, l3, z, (z || k5u0Var.g) ? 0.0f : k5u0Var.f, k5u0Var.g, k5u0Var.h, k5u0Var.i, (ucu0) null, k5u0Var.j, k5u0Var.k.a, k5u0Var.l, m0u0Var.d, k5u0Var.m == 3 && !k5u0Var.n, k5u0Var.o, l);
    }

    public static final b180 m() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.SearchActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        long j = u7h.b;
        n6a1 n6a1Var = new n6a1(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new f9s0(15.356f, 10.558f));
        arrayList.add(new k9s0(0.0f, 2.623f, -2.16f, 4.75f, -4.823f, 4.75f));
        arrayList.add(new p9s0(-4.824f, -2.127f, -4.824f, -4.75f));
        arrayList.add(new p9s0(2.16f, -4.75f, 4.824f, -4.75f));
        arrayList.add(new p9s0(4.823f, 2.127f, 4.823f, 4.75f));
        a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
        n6a1 n6a1Var2 = new n6a1(j);
        cwh0 cwh0VarG = lf51.g(1.126f, 10.558f);
        cwh0VarG.g(0.0f, -5.14f, 4.226f, -9.28f, 9.407f, -9.28f);
        cwh0VarG.g(5.18f, 0.0f, 9.407f, 4.14f, 9.407f, 9.28f);
        cwh0VarG.c(9.16f, 9.16f, false, true, -2.077f, 5.816f);
        cwh0VarG.k(4.344f, 4.344f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.414f, 1.414f);
        cwh0VarG.k(-4.353f, -4.353f);
        cwh0VarG.c(9.45f, 9.45f, false, true, -5.907f, 2.058f);
        cwh0VarG.g(-5.18f, 0.0f, -9.407f, -4.14f, -9.407f, -9.28f);
        cwh0VarG.e();
        cwh0VarG.l(10.533f, 3.278f);
        cwh0VarG.g(-4.105f, 0.0f, -7.407f, 3.274f, -7.407f, 7.28f);
        cwh0VarG.q(3.302f, 7.279f, 7.407f, 7.279f);
        cwh0VarG.q(7.407f, -3.273f, 7.407f, -7.28f);
        cwh0VarG.g(0.0f, -4.005f, -3.302f, -7.278f, -7.407f, -7.278f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static final go80 n(klm klmVar, acp0 acp0Var, acp0 acp0Var2, ybp0 ybp0Var, acp0 acp0Var3, acp0 acp0Var4) {
        return klmVar.a("SpotifyRemoteBroadcastDaemon", new kbp0(acp0Var, acp0Var2, ybp0Var, acp0Var3, acp0Var4, (byte) 11));
    }

    public static nor0 o(BlockElement blockElement) {
        String str;
        int iN = blockElement.n();
        int i = iN == 0 ? -1 : v4r.d[l1d.C(iN)];
        if (i == 1) {
            return new lor0(blockElement.p());
        }
        if (i == 2) {
            return new dor0(blockElement.o().o(), blockElement.o().p());
        }
        if (i == 3) {
            return new cor0(blockElement.q().p(), blockElement.q().getUri());
        }
        if (i == 4) {
            eg.m("BlockElement has no element set");
            return null;
        }
        int iN2 = blockElement.n();
        if (iN2 == 1) {
            str = "PARAGRAPH";
        } else if (iN2 == 2) {
            str = "NUMBERED_LIST_ITEM";
        } else if (iN2 != 3) {
            str = iN2 != 4 ? "null" : "ELEMENT_NOT_SET";
        } else {
            str = "SUPPORT_LINK";
        }
        k220.f("Unknown block element case: ".concat(str));
        return null;
    }

    public static dbq0 p(GetQrCodeVerificationOnboardingResponse getQrCodeVerificationOnboardingResponse) {
        String str;
        int iP = getQrCodeVerificationOnboardingResponse.n().p();
        int i = iP == 0 ? -1 : v4r.b[l1d.C(iP)];
        String yaq0Var = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    eg.m("GetQrCodeVerificationOnboardingResponse has no page contents set");
                    return null;
                }
                int iP2 = getQrCodeVerificationOnboardingResponse.n().p();
                if (iP2 == 1) {
                    str = "ONBOARDING_STEPS_CONTENTS";
                } else if (iP2 != 2) {
                    str = iP2 != 3 ? "null" : "PAGECONTENTS_NOT_SET";
                } else {
                    str = "SUCCESS_VIEW_CONTENTS";
                }
                k220.f("Unknown page contents case: ".concat(str));
                return null;
            }
            VerificationSucceededViewContents verificationSucceededViewContentsQ = getQrCodeVerificationOnboardingResponse.n().q();
            String strP = verificationSucceededViewContentsQ.p();
            String title = verificationSucceededViewContentsQ.getTitle();
            h290<BlockElement> h290VarN = verificationSucceededViewContentsQ.n();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (BlockElement blockElement : h290VarN) {
                blockElement.getClass();
                arrayList.add(o(blockElement));
            }
            return new bbq0(strP, title, arrayList);
        }
        OnboardingStepsContents onboardingStepsContentsO = getQrCodeVerificationOnboardingResponse.n().o();
        GetManagerStepContents getManagerStepContentsP = onboardingStepsContentsO.p();
        String strP2 = getManagerStepContentsP.p();
        String title2 = getManagerStepContentsP.getTitle();
        h290<BlockElement> h290VarN2 = getManagerStepContentsP.n();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN2, 10));
        for (BlockElement blockElement2 : h290VarN2) {
            blockElement2.getClass();
            arrayList2.add(o(blockElement2));
        }
        String subtitle = getManagerStepContentsP.getSubtitle();
        if (subtitle.length() == 0) {
            subtitle = null;
        }
        zaq0 zaq0Var = new zaq0(strP2, title2, subtitle, arrayList2);
        String strP3 = onboardingStepsContentsO.q().p();
        String title3 = onboardingStepsContentsO.q().getTitle();
        h290<BlockElement> h290VarN3 = onboardingStepsContentsO.q().n();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarN3, 10));
        for (BlockElement blockElement3 : h290VarN3) {
            blockElement3.getClass();
            arrayList3.add(o(blockElement3));
        }
        zaq0 zaq0Var2 = new zaq0(strP3, title3, (String) null, arrayList3);
        SupportLink supportLinkO = onboardingStepsContentsO.o();
        if (supportLinkO.p().length() <= 0) {
            supportLinkO = null;
        }
        if (supportLinkO != null) {
            String strP4 = supportLinkO.p();
            String uri = supportLinkO.getUri();
            String strO = supportLinkO.o();
            yaq0Var = new yaq0(strP4, uri, strO.length() != 0 ? strO : null);
        }
        return new abq0(zaq0Var, zaq0Var2, yaq0Var);
    }

    public static eib1 q(StartQrCodeVerificationFlowResponse startQrCodeVerificationFlowResponse) {
        String str;
        int iO = startQrCodeVerificationFlowResponse.n().o();
        int i = iO == 0 ? -1 : v4r.a[l1d.C(iO)];
        if (i == 1) {
            QrCodeDisplay qrCodeDisplayP = startQrCodeVerificationFlowResponse.n().p();
            String title = qrCodeDisplayP.p().getTitle();
            h290<BlockElement> h290VarN = qrCodeDisplayP.p().n();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (BlockElement blockElement : h290VarN) {
                blockElement.getClass();
                arrayList.add(o(blockElement));
            }
            return new eib1(title, arrayList, new dib1(qrCodeDisplayP.o().p(), qrCodeDisplayP.o().q(), qrCodeDisplayP.o().o()));
        }
        if (i == 2) {
            VerificationNotRequiredViewContents verificationNotRequiredViewContentsQ = startQrCodeVerificationFlowResponse.n().q();
            String title2 = verificationNotRequiredViewContentsQ.getTitle();
            h290<BlockElement> h290VarN2 = verificationNotRequiredViewContentsQ.n();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN2, 10));
            for (BlockElement blockElement2 : h290VarN2) {
                blockElement2.getClass();
                arrayList2.add(o(blockElement2));
            }
            return new eib1(title2, arrayList2, (dib1) null);
        }
        if (i == 3) {
            eg.m("StartQrCodeVerificationFlowResponse has no page contents set");
            return null;
        }
        int iO2 = startQrCodeVerificationFlowResponse.n().o();
        if (iO2 == 1) {
            str = "QR_CODE_VIEW";
        } else if (iO2 != 2) {
            str = iO2 != 3 ? "null" : "PAGECONTENTS_NOT_SET";
        } else {
            str = "VERIFICATION_NOT_REQUIRED_VIEW";
        }
        k220.f("Unknown page contents case: ".concat(str));
        return null;
    }

    public static fwg r(VerifyQrCodeResponse verifyQrCodeResponse) {
        String str;
        int iP = verifyQrCodeResponse.n().p();
        int i = iP == 0 ? -1 : v4r.c[l1d.C(iP)];
        if (i == 1) {
            VerificationSucceededViewContents verificationSucceededViewContentsQ = verifyQrCodeResponse.n().q();
            String strP = verificationSucceededViewContentsQ.p();
            String title = verificationSucceededViewContentsQ.getTitle();
            h290<BlockElement> h290VarN = verificationSucceededViewContentsQ.n();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (BlockElement blockElement : h290VarN) {
                blockElement.getClass();
                arrayList.add(o(blockElement));
            }
            return new ewg(strP, title, arrayList);
        }
        if (i == 2) {
            VerificationFailureViewContents verificationFailureViewContentsO = verifyQrCodeResponse.n().o();
            String title2 = verificationFailureViewContentsO.getTitle();
            h290<BlockElement> h290VarN2 = verificationFailureViewContentsO.n();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN2, 10));
            for (BlockElement blockElement2 : h290VarN2) {
                blockElement2.getClass();
                arrayList2.add(o(blockElement2));
            }
            return new dwg(title2, arrayList2);
        }
        if (i == 3) {
            eg.m("VerifyQrCodeResponse has no page contents set");
            return null;
        }
        int iP2 = verifyQrCodeResponse.n().p();
        if (iP2 == 1) {
            str = "SUCCESS_VIEW_CONTENTS";
        } else if (iP2 != 2) {
            str = iP2 != 3 ? "null" : "PAGECONTENTS_NOT_SET";
        } else {
            str = "FAILURE_VIEW_CONTENTS";
        }
        k220.f("Unknown page contents case: ".concat(str));
        return null;
    }

    public static final o6b1 s(Optional optional) {
        kv71 kv71Var = (kv71) optional.orElse(null);
        if (kv71Var == null || !kv71Var.a.b()) {
            return null;
        }
        return (o6b1) kv71Var.b.get();
    }

    public static final void t(z480 z480Var, uga0 uga0Var) {
        z480Var.s(uga0Var.toString());
    }

    public static final void u(z480 z480Var, int i) {
        String str;
        switch (i) {
            case 1:
                str = "CLOSED";
                break;
            case 2:
                str = "COPY";
                break;
            case 3:
                str = "ERROR";
                break;
            case 4:
                str = "OPENED";
                break;
            case 5:
                str = "OPENED_EXTERNAL_BROWSER";
                break;
            case 6:
                str = "LAUNCHED_UNSUPPORTED_URI";
                break;
            case 7:
                str = "PAGE_LOADED";
                break;
            case 8:
                str = "REFRESH";
                break;
            case 9:
                str = "SHARE";
                break;
            default:
                throw null;
        }
        z480Var.t(str.toLowerCase(Locale.US));
    }

    public static final t7e0 v(nhr0 nhr0Var, Bundle bundle) {
        return new t7e0(nhr0Var, bundle);
    }

    public static List w(List list) {
        return list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }
}
