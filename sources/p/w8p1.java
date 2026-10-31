package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w8p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1958505668);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hux huxVarD = xxq0.d(str);
            kja kjaVar = (kja) xxq0.c.getOrDefault(huxVarD, xxq0.b);
            qim0Var2 = qim0Var;
            b(huxVarD, qim0Var2, kjaVar.a, 0L, kjaVar.b, null, x340Var, 56 | ((i2 << 3) & 896));
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 10);
        }
    }

    public static final void b(hux huxVar, qim0 qim0Var, long j, long j2, Brush brush, Brush brush2, b0k b0kVar, int i) {
        int i2;
        Brush brush3;
        Brush brush4;
        int i3;
        Brush brush5;
        long j3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2050701782);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(isl.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            brush3 = brush;
            i2 |= x340Var.i(brush3) ? 131072 : 65536;
        } else {
            brush3 = brush;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        int i4 = i2 | 12582912;
        if (x340Var.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                i3 = i4 & (-3727361);
                brush5 = brush3;
                j3 = j;
            } else {
                x340Var.b0();
                i3 = i4 & (-3727361);
                j3 = j2;
                brush5 = brush2;
            }
            x340Var.s();
            gra graVar = een.h;
            qim0 qim0VarF = dug.f(qim0Var, j, er31.b(8.0f));
            gfh0 gfh0VarC = t1c.c(graVar, false);
            j2 = j3;
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i5 = (i3 & 14) | 8 | (i3 & 112);
            int i6 = i3 >> 6;
            y9g1.f(huxVar, u291.d(nim0.a, 0.66f), brush3, brush5, x340Var, (i6 & 458752) | i5 | (i6 & 7168));
            x340Var.r(true);
            brush4 = brush5;
        } else {
            x340Var.b0();
            brush4 = brush2;
        }
        long j4 = j2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lja(huxVar, qim0Var, j, j4, brush, brush4, i);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [p.p7n] */
    public static final void c(final x6e1 x6e1Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        nim0 nim0VarThen;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1533506138);
        final byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(x6e1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(-885604480);
            if (x6e1Var.i()) {
                nim0VarThen = dko1.u(new jt0(x6e1Var, null, (byte) 3)).then(new t3e1(x6e1Var.x, new rv3(x6e1Var, (lnm) null, (byte) 2), new s6e1(x6e1Var, (lnm) null, (byte) 0), (p7n) new iu30() { // from class: p.p7n
                    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
                    public final Object invoke(Object obj) {
                        n511 n511Var;
                        elb0 elb0VarC;
                        char c;
                        float fIntBitsToFloat;
                        elb0 elb0VarC2;
                        elb0 elb0VarC3;
                        elb0 elb0VarC4;
                        elb0 elb0VarC5;
                        byte b3 = b2;
                        x6e1 x6e1Var2 = x6e1Var;
                        switch (b3) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                return new rm(x6e1Var2, (byte) 27);
                            case 1:
                                x6e1Var2.s();
                                return rih1.a;
                            default:
                                elb0 elb0Var = (elb0) obj;
                                r1c0 r1c0Var = x6e1Var2.d;
                                if (r1c0Var == null) {
                                    n511Var = n511.e;
                                } else {
                                    if (r1c0Var.p) {
                                        r1c0Var = null;
                                    }
                                    if (r1c0Var != null) {
                                        hyp0 hyp0Var = x6e1Var2.b;
                                        long j = x6e1Var2.l().b;
                                        int i3 = nbe1.c;
                                        int iO = hyp0Var.o((int) (j >> 32));
                                        int iO2 = x6e1Var2.b.o((int) (x6e1Var2.l().b & 4294967295L));
                                        r1c0 r1c0Var2 = x6e1Var2.d;
                                        long jO = 0;
                                        long jO2 = (r1c0Var2 == null || (elb0VarC5 = r1c0Var2.c()) == null) ? 0L : elb0VarC5.O(x6e1Var2.j(true));
                                        r1c0 r1c0Var3 = x6e1Var2.d;
                                        if (r1c0Var3 != null && (elb0VarC4 = r1c0Var3.c()) != null) {
                                            jO = elb0VarC4.O(x6e1Var2.j(false));
                                        }
                                        r1c0 r1c0Var4 = x6e1Var2.d;
                                        float fIntBitsToFloat2 = 0.0f;
                                        if (r1c0Var4 == null || (elb0VarC3 = r1c0Var4.c()) == null) {
                                            c = ' ';
                                            fIntBitsToFloat = 0.0f;
                                        } else {
                                            z9e1 z9e1VarD = r1c0Var.d();
                                            c = ' ';
                                            fIntBitsToFloat = Float.intBitsToFloat((int) (elb0VarC3.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(z9e1VarD != null ? z9e1VarD.a.c(iO).b : 0.0f)) & 4294967295L)) & 4294967295L));
                                        }
                                        r1c0 r1c0Var5 = x6e1Var2.d;
                                        if (r1c0Var5 != null && (elb0VarC2 = r1c0Var5.c()) != null) {
                                            z9e1 z9e1VarD2 = r1c0Var.d();
                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (elb0VarC2.O((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(z9e1VarD2 != null ? z9e1VarD2.a.c(iO2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                                        }
                                        int i4 = (int) (jO2 >> c);
                                        int i5 = (int) (jO >> c);
                                        n511Var = new n511(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (((wat) r1c0Var.a.d).h() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jO2 & 4294967295L)), Float.intBitsToFloat((int) (jO & 4294967295L))));
                                    } else {
                                        n511Var = n511.e;
                                    }
                                }
                                r1c0 r1c0Var6 = x6e1Var2.d;
                                if (r1c0Var6 == null || (elb0VarC = r1c0Var6.c()) == null) {
                                    return null;
                                }
                                return nko1.J(n511Var, elb0VarC, elb0Var);
                        }
                    }
                }));
            } else {
                nim0VarThen = nim0.a;
            }
            ryo1.i(i2 & 112, j2iVar, x340Var, nim0VarThen);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bsh(x6e1Var, j2iVar, i, (byte) 0);
        }
    }

    public static final void d(r7e1 r7e1Var, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        qim0 qim0VarU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1442752422);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(r7e1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.i0(-1299459355);
            if (z) {
                x340Var.i0(-1299415211);
                boolean zI = x340Var.i(r7e1Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new csh(r7e1Var, (lnm) null);
                    x340Var.s0(objT);
                }
                qim0VarU = dko1.u((vu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(-1298836224);
                x340Var.r(false);
                qim0VarU = nim0.a;
            }
            ryo1.i((i2 >> 3) & 112, j2iVar, x340Var, qim0VarU);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ash(r7e1Var, z, j2iVar, i, (byte) 0);
        }
    }

    public static final void e(upo upoVar, boolean z, iu30 iu30Var, q01 q01Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-760983039);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(upoVar) : x340Var.i(upoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(q01Var) ? 2048 : 1024;
        }
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(Boolean.valueOf(z), x340Var);
            ven0 ven0VarS2 = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS3 = v8r.s(q01Var, x340Var);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(upoVar))) {
                z2 = true;
            }
            boolean zG = x340Var.g(ven0VarS) | z2 | x340Var.g(ven0VarS3) | x340Var.g(ven0VarS2);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                bh bhVar = new bh(upoVar, ven0VarS, ven0VarS3, ven0VarS2, (lnm) null, (byte) 4);
                x340Var.s0(bhVar);
                objT = bhVar;
            }
            n8b1 n8b1Var = upo.l;
            qxd0.t(upoVar, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(upoVar, z, iu30Var, q01Var, i);
        }
    }

    public static final void f(fh51 fh51Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1746253950);
        int i2 = i | (x340Var2.g(fh51Var) ? 4 : 2) | 432;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = mls.R0;
                x340Var2.s0(objT);
            }
            iu30 iu30Var3 = (iu30) objT;
            vzq0 vzq0Var = ((uvx) x340Var2.k(vvx.a)).e;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.w(qim0Var3, vzq0Var), 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarH = u291.h(qim0VarF, 48.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarH);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0Var2 = qim0Var3;
            uwo1.e(fh51Var.a, anm1.N("sideDrawerSectionHeaderTitle", qim0Var3), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            x340Var.i0(-522947904);
            x340Var.r(false);
            x340Var.r(true);
            iu30Var2 = iu30Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            iu30Var2 = iu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won((byte) 14, i, fh51Var, qim0Var2, iu30Var2);
        }
    }

    public static final void g(boolean z, y7e1 y7e1Var, xtb0 xtb0Var, String str, q01 q01Var, bx1 bx1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-644765530);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(y7e1Var) ? 32 : 16) | (x340Var.g(xtb0Var) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | (x340Var.i(q01Var) ? 16384 : 8192) | (x340Var.i(bx1Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p4.e1;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            ven0 ven0VarS = v8r.s(q01Var, x340Var);
            ven0 ven0VarS2 = v8r.s(bx1Var, x340Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | x340Var.g(ven0Var) | x340Var.g(ven0VarS) | x340Var.g(ven0VarS2);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                vr1 vr1Var = new vr1(xtb0Var, z, y7e1Var, str, ven0Var, ven0VarS, ven0VarS2, (lnm) null);
                x340Var.s0(vr1Var);
                objT2 = vr1Var;
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(z, (Object) y7e1Var, (Object) xtb0Var, (Object) str, (Object) q01Var, (cv30) bx1Var, i, (byte) 0);
        }
    }

    public static final void h(yl80 yl80Var, ahs ahsVar, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-143712012);
        int i2 = (x340Var.g(yl80Var) ? 4 : 2) | i | (x340Var.g(ahsVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N(yl80Var.d, qim0Var);
            uwr uwrVar = cbx.a;
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.a, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zl80 zl80Var = yl80Var.a;
            ul80 ul80Var = yl80Var.b;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ql80(ahsVar, (byte) 0);
                x340Var.s0(objT);
            }
            x8p1.g(zl80Var, ul80Var, (vu30) objT, null, x340Var, 0);
            zl80 zl80Var2 = yl80Var.a;
            wl80 wl80Var = yl80Var.c;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ql80(ahsVar, (byte) 1);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean z3 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ql80(ahsVar, (byte) 2);
                x340Var.s0(objT3);
            }
            vu30 vu30Var2 = (vu30) objT3;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            b9p1.g(zl80Var2, wl80Var, vu30Var, vu30Var2, u291.d(uyn1.y(nim0.a, 16.0f, 8.0f), 1.0f), x340Var, 0);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) yl80Var, (Object) ahsVar, (Object) qim0Var, i, (byte) 25);
        }
    }

    public static final void i(xtb0 xtb0Var, c380 c380Var, ab abVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2139340087);
        int i2 = (x340Var.g(xtb0Var) ? 4 : 2) | i | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(abVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarS = v8r.s(abVar, x340Var);
            boolean zG = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.g(ven0VarS);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                c6 c6Var = new c6(xtb0Var, c380Var, ven0VarS, (lnm) null, (byte) 9);
                x340Var.s0(c6Var);
                objT = c6Var;
            }
            qxd0.s(xtb0Var, c380Var, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) xtb0Var, (Object) c380Var, (Object) abVar, i, (byte) 20);
        }
    }

    public static final void j(yf yfVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-173844978);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(yfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 25);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), yfVar, qim0Var2, null, null, null, false, null, null, jdj.a, x340Var, (i2 << 3) & 1008, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(yfVar, qim0Var, function0, i, (byte) 28);
        }
    }

    public static final void k(otn0 otn0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2093903110);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(otn0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp >= 600;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarJ = zr7.j(u291.f(nim0Var, 1.0f), new ec3(otn0Var, (byte) 6));
            uvx uvxVar = (uvx) x340Var.k(vvx.a);
            float f2 = 16.0f;
            if (z) {
                x340Var.i0(-261166067);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            } else {
                x340Var.i0(-261162565);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            }
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            hdh hdhVarN = lnn1.n(new zzq0(f, 4.0f, 4.0f, 4.0f), otn0Var.a);
            if (z) {
                x340Var.i0(-261148232);
                cvx cvxVar6 = cbx.b(x340Var).b;
                x340Var.r(false);
            } else {
                x340Var.i0(-261146372);
                cvx cvxVar7 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 6.0f;
            }
            cvx cvxVar8 = cbx.b(x340Var).b;
            boolean z2 = z;
            jto1.b(qim0VarJ, uvx.a(uvxVar, (pgx) null, 2, hdhVarN, (vzq0) null, new tvx(0.0f, f2, 6.0f), (p3v) null, 466), null, false, null, null, otn0Var.h, null, apo.r(-74629014, new k681(otn0Var, (byte) 9), x340Var), null, null, null, null, null, null, apo.r(-220893200, new zw2((Object) otn0Var, z, (byte) 21), x340Var), x340Var, 100663360, 196608, 32444);
            x340Var = x340Var;
            if (z2 && otn0Var.g) {
                x340Var.i0(494740170);
                t1c.a(dug.f(h2c.a.a(u291.s(nim0Var, 4.0f, 28.0f), een.g), cbx.a(x340Var).c.c, d4o1.a), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(494928526);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(otn0Var, qim0Var, i, (byte) 25);
        }
    }

    public static md50 l(String str, xd xdVar, String str2) {
        String str3;
        String str4 = md50.j;
        md50 md50VarR = cwl1.R(xdVar, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), (JSONObject) null, (id50) null);
        Bundle bundle = md50VarR.d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context contextA = wf10.a();
        try {
            str3 = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        bundle.putString("device_session_id", wwg.a());
        md50VarR.d = bundle;
        md50VarR.i(new km5((byte) 2));
        return md50VarR;
    }

    public static void m() {
        o0c.q("Not in application's main thread", w());
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static final String o(tdi1 tdi1Var) {
        List listM = p7h.M(new String[]{tdi1Var.d, tdi1Var.e});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
        return strY0.length() == 0 ? tdi1Var.c : strY0;
    }

    public static final List p() {
        if (p7h.M(new String[]{"debug", "canary"}).contains("release")) {
            return mhp0.c;
        }
        rhp0 rhp0Var = rhp0.a;
        return z6x.a;
    }

    public static FontWeight q() {
        return FontWeight.Z;
    }

    public static final List r() {
        if (p7h.M(new String[]{"debug", "canary"}).contains("release")) {
            return mhp0.d;
        }
        rhp0 rhp0Var = rhp0.a;
        return rhp0.b;
    }

    public static FontWeight s() {
        return FontWeight.t;
    }

    public static final List t() {
        if (p7h.M(new String[]{"debug", "canary"}).contains("release")) {
            return mhp0.b;
        }
        rhp0 rhp0Var = rhp0.a;
        t641 t641Var = new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 4));
        Set setSingleton = Collections.singleton("playback.connect_transfer");
        qm81 qm81Var = qm81.b;
        vgp0 vgp0Var = new vgp0("playback.connect_transfer", "baseline", t641Var, Collections.singletonMap(qm81Var, setSingleton), 300L, 16);
        vgp0 vgp0Var2 = new vgp0("scheduler.workmanager.execution", "baseline", new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 5)), Collections.singletonMap(qm81Var, Collections.singleton("scheduler.workmanager.execution")), 3600L, 16);
        vgp0 vgp0Var3 = new vgp0("playback.start", "baseline", new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 6)), Collections.singletonMap(qm81Var, Collections.singleton("playback.start")), (Long) null, 48);
        t641 t641Var2 = new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 7));
        mmr0 mmr0Var = new mmr0(qm81Var, f46.S0(new String[]{"playback.start", "network.http.requests", "list_player_playback_latency", "timeline_conductor.playable_clip", "metadata.observe", "ui.hitches"}));
        Set setS0 = f46.S0(new String[]{"network.connection_quality", "network.reachability"});
        qm81 qm81Var2 = qm81.d;
        mmr0 mmr0Var2 = new mmr0(qm81Var2, setS0);
        Set setS1 = f46.S0(new String[]{ehp0.a.a(), ehp0.c.a()});
        qm81 qm81Var3 = qm81.e;
        vgp0 vgp0Var4 = new vgp0("playback.start", "detailed", t641Var2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0(qm81Var3, setS1)}), (Long) null, 48);
        vgp0 vgp0Var5 = new vgp0("ads.fetch", "baseline", new u641(((double) yiq0.b) / 10000.0d), sqg0.J(new mmr0[]{new mmr0(qm81Var, f46.S0(new String[]{"ads.fetch", "network.http.requests"})), new mmr0(qm81Var2, f46.S0(new String[]{"network.connection_quality", "network.reachability"}))}), (Long) null, 48);
        vgp0 vgp0Var6 = new vgp0("ads.fetch.break", "baseline", new u641(((double) yiq0.b) / 10000.0d), Collections.singletonMap(qm81Var, f46.S0(new String[]{"ads.fetch.break", "ads.fetch"})), (Long) null, 48);
        vgp0 vgp0Var7 = new vgp0("data.offline.startup", "detailed", new u641(1.0d), Collections.singletonMap(qm81Var, Collections.singleton("data.offline.startup")), (Long) null, 48);
        vgp0 vgp0Var8 = new vgp0("ux.sharing.episode_upload", "baseline", new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 8)), sqg0.J(new mmr0[]{new mmr0(qm81Var, f46.S0(new String[]{"ux.sharing.episode_upload", "sharing.episode_upload.file_copy", "sharing.episode_upload.signed_url_fetch", "sharing.episode_upload.file_transfer", "sharing.episode_upload.begin_processing", "network.http.requests"})), new mmr0(qm81Var2, f46.S0(new String[]{"sharing.episode_upload.events", "network.connection_quality", "network.reachability"}))}), (Long) null, 48);
        vgp0 vgp0Var9 = new vgp0("ux.podcast.cover_art_upload", "baseline", new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 9)), sqg0.J(new mmr0[]{new mmr0(qm81Var, f46.S0(new String[]{"ux.podcast.cover_art_upload", "podcast.cover_art_upload.signed_url_fetch", "podcast.cover_art_upload.upload_image", "podcast.cover_art_upload.begin_processing", "podcast.cover_art_upload.get_status", "network.http.requests"})), new mmr0(qm81Var2, f46.S0(new String[]{"podcast.cover_art_upload.events", "network.connection_quality", "network.reachability"}))}), (Long) null, 48);
        t641 t641Var3 = new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 10));
        mmr0 mmr0Var3 = new mmr0(qm81Var, f46.S0(new String[]{"ui.hitches", "ui.scrolling"}));
        nqj0 nqj0Var = dkc1.a;
        String strA = nqj0Var.a();
        nqj0 nqj0Var2 = dkc1.c;
        String strA2 = nqj0Var2.a();
        nqj0 nqj0Var3 = dkc1.e;
        String strA3 = nqj0Var3.a();
        nqj0 nqj0Var4 = dkc1.g;
        return p7h.M(new vgp0[]{vgp0Var, vgp0Var2, vgp0Var3, vgp0Var4, vgp0Var5, vgp0Var6, vgp0Var7, vgp0Var8, vgp0Var9, new vgp0("page.visit", "baseline", t641Var3, sqg0.J(new mmr0[]{mmr0Var3, new mmr0(qm81Var3, f46.S0(new String[]{strA, strA2, strA3, nqj0Var4.a()}))}), (Long) null, 48), new vgp0("page.visit", "detailed", new t641(new wao0(1, rhp0Var, rhp0.class, "samplingProbability", "samplingProbability(Lcom/spotify/performancesdk/observationplatform/api/ObservationConfig;)D", 0, (byte) 11)), sqg0.J(new mmr0[]{new mmr0(qm81Var, f46.S0(new String[]{"ui.hitches", "ui.scrolling", "network.http.requests", "metadata.observe"})), new mmr0(qm81Var3, f46.S0(new String[]{nqj0Var.a(), nqj0Var2.a(), nqj0Var3.a(), nqj0Var4.a()}))}), (Long) null, 48), new vgp0("sharing.share_sheet", "baseline", new u641(0.5d), Collections.singletonMap(qm81Var, f46.S0(new String[]{"sharing.off_platform_destinations_loading", "sharing.on_platform_destinations_loading", "sharing.share_formats_loading", "sharing.entry_point_plugins_loading", "sharing.slots_configuration_loading", "sharing.entity_share_format_loading", "sharing.video_timestamp_share_format_loading", "sharing.video_chapter_share_format_loading", "sharing.audio_chapter_share_format_loading", "sharing.text_content_share_format_loading", "network.http.requests"})), (Long) null, 48), new vgp0("page.home.load_slots", "detailed", new u641(0.01d), sqg0.J(new mmr0[]{new mmr0(qm81Var, f46.S0(new String[]{"page.home.load_slots", "page.home.load_layout", "page.home.load_slot"})), new mmr0(qm81Var2, Collections.singleton("page.home.slot_loading"))}), 120L, 16), new vgp0("page.home.load_legacy", "detailed", new u641(0.01d), Collections.singletonMap(qm81Var, Collections.singleton("page.home_load")), 120L, 16)});
    }

    public static final List u() {
        if (p7h.M(new String[]{"debug", "canary"}).contains("release")) {
            return mhp0.e;
        }
        rhp0 rhp0Var = rhp0.a;
        return rhp0.c;
    }

    public static FontWeight v() {
        return FontWeight.f;
    }

    public static boolean w() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static ksk0 x() {
        return new ksk0((byte) 7);
    }

    public static void y(Runnable runnable) {
        if (w()) {
            runnable.run();
        } else {
            o0c.q("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static String z(long j) {
        return gvg.f(j, "PointerId(value=", ")");
    }
}
