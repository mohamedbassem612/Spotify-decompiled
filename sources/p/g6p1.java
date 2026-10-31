package p;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class g6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(avc0 avc0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str = avc0Var.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1765897347);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = (b0kVar2.g(avc0Var) ? 4 : 2) | i | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            d36 d36Var = new d36(24.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 24.0f, 0.0f, 24.0f, 24.0f, 2);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            w0h1.a(xxq0.d(str), isl.a, (qim0) null, xxq0.c(avc0Var.b), 0L, huj.d(str), b0kVar2, 56, 20);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0Var3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            String str2 = avc0Var.c;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).d;
            long j = cbx.a(b0kVar2).b.a;
            b0kVar2 = b0kVar2;
            uwo1.e(str2, null, lee1Var, j, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            uwo1.e(avc0Var.d, null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(avc0Var, qim0Var2, i, (byte) 12);
        }
    }

    public static final void b(a001 a001Var, b0k b0kVar, int i) {
        float f;
        xzz0 xzz0Var = a001Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1468275551);
        pw31 pw31Var = pw31.a;
        int i2 = (x340Var.g(pw31Var) ? 4 : 2) | i | (x340Var.g(a001Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (xzz0Var.a()) {
                x340Var.i0(-2031431935);
                x340Var.r(false);
                f = 0.0f;
            } else {
                x340Var.i0(-2031431035);
                uwr uwrVar = cbx.a;
                f = cbx.b(x340Var).b.a;
                x340Var.r(false);
            }
            qim0 qim0VarA = pw31Var.a(1.0f, nim0.a, false);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            i6p1.c(f, 0, x340Var, null);
            dem1.j(6, a001Var.d, x340Var, xzz0Var.a());
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pae0(a001Var, i);
        }
    }

    public static final void c(lik1 lik1Var, a001 a001Var, idm idmVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        xzz0 xzz0Var = a001Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-510638642);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(lik1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(a001Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(idmVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new g21(xzz0Var.a() ? een.R0 : een.P0, (byte) 29)), fraVar, x340Var, 48);
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
            x340Var.i0(1976246021);
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(apo.r(1211920556, new qae0(lik1Var, a001Var, idmVar, (byte) 0), x340Var));
            smc0VarN.add(apo.r(177075413, new pae0(a001Var), x340Var));
            smc0VarN.add(wwi.a);
            List listK = k4p1.k(smc0VarN);
            x340Var.r(false);
            if (!xzz0Var.a()) {
                listK = o7h.T0(listK);
            }
            x340Var.i0(1976259756);
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                ((vu30) it.next()).invoke(x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) lik1Var, (Object) a001Var, (Object) idmVar, qim0Var2, i, i2, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:64:0x0347  */
    /* JADX WARN: Code duplicated, block: B:65:0x034b  */
    /* JADX WARN: Code duplicated, block: B:72:0x037a  */
    /* JADX WARN: Code duplicated, block: B:74:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x03be  */
    /* JADX WARN: Code duplicated, block: B:78:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x041e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0422  */
    public static final void d(yqg yqgVar, sbe1 sbe1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        Function0 function0;
        mmr0 mmr0Var;
        int i2;
        Function0 function1;
        Object obj;
        String strO0;
        qim0 qim0Var3;
        boolean z;
        boolean z2;
        Object objT;
        boolean zG;
        Object objT2;
        boolean z3;
        Object obj2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-955410173);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(yqgVar) ? 4 : 2) | (x340Var.i(sbe1Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            fra fraVar = een.N0;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("text-reaction-input-test-tag", qim0Var4), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z4) {
                x340Var.l(function2);
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
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function2;
                x340Var.l(function0);
            } else {
                function0 = function2;
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (sbe1Var instanceof rbe1) {
                x340Var.i0(-106541377);
                String str = ((rbe1) sbe1Var).a;
                mmr0Var = new mmr0(cwl1.n0(2131963153, new Object[]{str}, x340Var), cwl1.n0(2131963155, new Object[]{str}, x340Var));
                i2 = 0;
                x340Var.r(false);
            } else {
                if (!(sbe1Var instanceof qbe1)) {
                    throw p3d1.k(x340Var, -106543906, false);
                }
                x340Var.i0(-106529501);
                mmr0Var = new mmr0(cwl1.o0(x340Var, 2131963152), cwl1.o0(x340Var, 2131963154));
                i2 = 0;
                x340Var.r(false);
            }
            String str2 = (String) mmr0Var.a;
            String str3 = (String) mmr0Var.b;
            es41 es41VarC = l6o1.C(i2, i2, 1, x340Var);
            mta mtaVar = cbx.b(x340Var).d;
            Function0 function3 = function0;
            qim0 qim0VarF2 = dug.f(u291.f(u291.j(48.0f, 0.0f, 2, qim0Var4), 1.0f), cbx.a(x340Var).a.a.c(), er31.b(24.0f));
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 10.0f);
            boolean zG2 = x340Var.g(str2);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj2) {
                objT3 = new hqa1(str2, (byte) 23);
                x340Var.s0(objT3);
            }
            qim0 qim0VarB2 = s161.b(qim0VarY, false, (iu30) objT3);
            Object objT4 = x340Var.T();
            if (objT4 == obj2) {
                objT4 = vy5.f;
                x340Var.s0(objT4);
            }
            xea.c(y7e1VarD, qim0VarB2, false, false, (dk80) objT4, lee1.a(cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), new kua0(3, (Boolean) null, 0, 0, 126), (yta0) null, new c6e1(0, 5, 1), (vu30) null, (idn0) null, new n6a1(cbx.a(x340Var).b.c), (uwg) null, new lvc1(es41VarC, y7e1VarD, str3, (byte) 11), (es41) null, x340Var, 0, 0, 22156);
            x340Var = x340Var;
            x340Var.r(true);
            boolean zY0 = ihc1.y0(y7e1VarD.d().d);
            tob1 tob1VarB = z95.b(!zY0 ? 1.0f : 0.0f, irn1.o0(0, 0, null, 7), "alpha", (iu30) null, x340Var, 3072, 20);
            tob1 tob1VarA = z95.a(!zY0 ? 48.0f : 0.0f, irn1.o0(0, 0, null, 7), "size", x340Var, 384, 8);
            mta mtaVar2 = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0Var4);
            gra graVar2 = een.h;
            gfh0 gfh0VarC2 = t1c.c(graVar2, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarJ);
            x340Var.m0();
            if (x340Var.S) {
                function1 = function3;
                x340Var.l(function1);
            } else {
                function1 = function3;
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            boolean zI = x340Var.i(tob1VarB);
            Object objT5 = x340Var.T();
            if (zI) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objT5 == obj) {
                }
                qim0 qim0VarR = u291.r(i541.C(qim0Var4, (iu30) objT5), ((p3v) tob1VarA.getValue()).a);
                gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarR);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                if (zY0 || p3v.b(((p3v) tob1VarA.getValue()).a, 0.0f) > 0) {
                    x340Var.i0(-1969941690);
                    strO0 = cwl1.o0(x340Var, 2131963156);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    qim0Var3 = qim0Var4;
                    qim0 qim0VarF3 = dug.f(u291.r(uyn1.B(qim0Var4, 8.0f, 0.0f, 0.0f, 0.0f, 14), 36.0f), cbx.a(x340Var).c.c, er31.a);
                    boolean zI2 = x340Var.i(y7e1VarD);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zI2 | z;
                    objT = x340Var.T();
                    if (z2 || objT == obj) {
                        objT = new efb(y7e1VarD, iu30Var, (byte) 10);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarI = zr7.i(qim0VarF3, new arf(yqgVar, (Function0) objT, (byte) 1));
                    zG = x340Var.g(strO0);
                    objT2 = x340Var.T();
                    if (zG || objT2 == obj) {
                        objT2 = new hqa1(strO0, (byte) 24);
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarA = s161.a(qim0VarI, (iu30) objT2);
                    gfh0 gfh0VarC4 = t1c.c(graVar, false);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarA);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar4);
                    qim0 qim0VarX = uyn1.x(h2c.a.a(qim0Var3, graVar2), 10.0f);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(qpx.c, isl.a, u291.r(qim0VarX, 16.0f), ((vex) zex.a.b).a, 0L, false, x340Var, qpx.d | 48, 48);
                    z3 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1968817320);
                    x340Var.r(false);
                    qim0Var3 = qim0Var4;
                    z3 = true;
                }
                us71.m(x340Var, z3, z3, z3);
                qim0Var2 = qim0Var3;
            }
            objT5 = new ctd1(tob1VarB, (byte) 2);
            x340Var.s0(objT5);
            qim0 qim0VarR2 = u291.r(i541.C(qim0Var4, (iu30) objT5), ((p3v) tob1VarA.getValue()).a);
            gfh0 gfh0VarC5 = t1c.c(graVar2, false);
            int iHashCode6 = Long.hashCode(x340Var.T);
            xos0 xos0VarM6 = x340Var.m();
            qim0 qim0VarE6 = zr7.E(x340Var, qim0VarR2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC5, x340Var, lljVar);
            nko1.H(xos0VarM6, x340Var, lljVar2);
            x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE6, x340Var, lljVar4);
            if (zY0) {
                x340Var.i0(-1969941690);
                strO0 = cwl1.o0(x340Var, 2131963156);
                cvx cvxVar6 = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                qim0 qim0VarF4 = dug.f(u291.r(uyn1.B(qim0Var4, 8.0f, 0.0f, 0.0f, 0.0f, 14), 36.0f), cbx.a(x340Var).c.c, er31.a);
                boolean zI3 = x340Var.i(y7e1VarD);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zI3 | z;
                objT = x340Var.T();
                if (z2) {
                    objT = new efb(y7e1VarD, iu30Var, (byte) 10);
                    x340Var.s0(objT);
                } else {
                    objT = new efb(y7e1VarD, iu30Var, (byte) 10);
                    x340Var.s0(objT);
                }
                qim0 qim0VarI2 = zr7.i(qim0VarF4, new arf(yqgVar, (Function0) objT, (byte) 1));
                zG = x340Var.g(strO0);
                objT2 = x340Var.T();
                if (zG) {
                    objT2 = new hqa1(strO0, (byte) 24);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new hqa1(strO0, (byte) 24);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarA2 = s161.a(qim0VarI2, (iu30) objT2);
                gfh0 gfh0VarC6 = t1c.c(graVar, false);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarA2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC6, x340Var, lljVar);
                nko1.H(xos0VarM7, x340Var, lljVar2);
                x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar4);
                qim0 qim0VarX2 = uyn1.x(h2c.a.a(qim0Var3, graVar2), 10.0f);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(qpx.c, isl.a, u291.r(qim0VarX2, 16.0f), ((vex) zex.a.b).a, 0L, false, x340Var, qpx.d | 48, 48);
                z3 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var.i0(-1969941690);
                strO0 = cwl1.o0(x340Var, 2131963156);
                cvx cvxVar7 = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                qim0 qim0VarF5 = dug.f(u291.r(uyn1.B(qim0Var4, 8.0f, 0.0f, 0.0f, 0.0f, 14), 36.0f), cbx.a(x340Var).c.c, er31.a);
                boolean zI4 = x340Var.i(y7e1VarD);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zI4 | z;
                objT = x340Var.T();
                if (z2) {
                    objT = new efb(y7e1VarD, iu30Var, (byte) 10);
                    x340Var.s0(objT);
                } else {
                    objT = new efb(y7e1VarD, iu30Var, (byte) 10);
                    x340Var.s0(objT);
                }
                qim0 qim0VarI3 = zr7.i(qim0VarF5, new arf(yqgVar, (Function0) objT, (byte) 1));
                zG = x340Var.g(strO0);
                objT2 = x340Var.T();
                if (zG) {
                    objT2 = new hqa1(strO0, (byte) 24);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new hqa1(strO0, (byte) 24);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarA3 = s161.a(qim0VarI3, (iu30) objT2);
                gfh0 gfh0VarC7 = t1c.c(graVar, false);
                int iHashCode8 = Long.hashCode(x340Var.T);
                xos0 xos0VarM8 = x340Var.m();
                qim0 qim0VarE8 = zr7.E(x340Var, qim0VarA3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC7, x340Var, lljVar);
                nko1.H(xos0VarM8, x340Var, lljVar2);
                x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE8, x340Var, lljVar4);
                qim0 qim0VarX3 = uyn1.x(h2c.a.a(qim0Var3, graVar2), 10.0f);
                zov0 zov0Var3 = cbx.b(x340Var).g;
                w0h1.a(qpx.c, isl.a, u291.r(qim0VarX3, 16.0f), ((vex) zex.a.b).a, 0L, false, x340Var, qpx.d | 48, 48);
                z3 = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            us71.m(x340Var, z3, z3, z3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, yqgVar, sbe1Var, iu30Var, qim0Var2, (byte) 1);
        }
    }

    public static final void e(u8d1 u8d1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Uri uri = u8d1Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1204436278);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(u8d1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(nim0.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            woa woaVar = (woa) x340Var.k(mge0.a);
            uoa uoaVarA = woa.a(woaVar, "share-video-swatch", new o2u0(uri.toString(), 14, (Map) null), (w2k1) null, (kma) x340Var.k(mge0.b), (List) null, false, (bas) null, (sn10) null, 1012);
            uoaVarA.q(true);
            uoaVarA.p(2);
            tho1.l(u8d1Var.b, u8d1Var.c, function0, apo.r(-599860679, new eii1(uoaVarA, u8d1Var, (byte) 17), x340Var), x340Var, ((i2 << 6) & 7168) | (i2 & 896) | 24576);
            boolean zI = x340Var.i(woaVar) | x340Var.i(uoaVarA);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new m760(woaVar, uoaVarA, (byte) 2);
                x340Var.s0(objT);
            }
            qxd0.i(uri, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(u8d1Var, function0, i);
        }
    }

    public static final ajr f(Context context, Long l) {
        Context applicationContext = context.getApplicationContext();
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        if (l != null) {
            for (Integer num : map.keySet()) {
                num.getClass();
                map.put(num, l);
            }
        }
        return new ajr(applicationContext, map);
    }

    public static nrk0 g(Integer num, r6h1 r6h1Var) {
        return new nrk0(num, r6h1Var);
    }

    public static final List i(Map map) {
        m9m m9mVar;
        Set setKeySet = map.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (nhc1.Y((String) obj, "content_type_", false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                String strU0 = ihc1.U0(str, "content_type_", str);
                m9m[] m9mVarArrValues = m9m.values();
                int length = m9mVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    m9mVar = m9mVarArrValues[i];
                    if (m9mVar.a.equalsIgnoreCase(strU0)) {
                        break;
                    }
                    i++;
                }
            } catch (NoSuchElementException e) {
                Logger.d(gvg.h("Recents: Failed to parse content tag: ", str, "\n", e.getMessage()), new Object[0]);
                m9mVar = null;
            }
            if (m9mVar != null) {
                arrayList2.add(m9mVar);
            }
        }
        return o7h.j0(arrayList2);
    }

    public static final String j(zuc0 zuc0Var) {
        for (String str : zuc0Var.g.keySet()) {
            if (nhc1.Y(str, "group_id_", false)) {
                return str;
            }
        }
        return null;
    }

    public static final br01 k(zuc0 zuc0Var) {
        Map map = zuc0Var.g;
        if (map.get("recent_type_shared") != null) {
            return br01.c;
        }
        if (map.get("recent_type_saved") != null) {
            return br01.b;
        }
        return map.get("recent_type_auto_generated") != null ? br01.e : br01.d;
    }

    public static final m441 m(ve01 ve01Var, bpb1 bpb1Var) {
        return z4p1.J(ve01Var, new gg00(bpb1Var, (lnm) null, (byte) 1));
    }

    public static final go80 n(klm klmVar, cdp0 cdp0Var) {
        return klmVar.a("WhereToPlayDeviceSuggestionsSourceDaemon", new mcp0(cdp0Var, (byte) 28));
    }

    public static final boolean o(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean p(zuc0 zuc0Var, boolean z) {
        try {
            return new y6b1(zuc0Var.c, false).c == v6b1.I1 && (z || i(zuc0Var.g).contains(m9m.b));
        } catch (Exception unused) {
        }
    }

    public static final lvl0 q(urk0 urk0Var, e381 e381Var) {
        d8r0 d8r0Var = e381Var.g;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), e381Var.f, (byte) 3);
    }

    public static final GroupMetadata r(Map map) {
        String str = (String) map.get("group_metadata");
        if (str == null) {
            return null;
        }
        try {
            return GroupMetadata.s(Base64.decode(str, 0));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final lch s(f1r f1rVar, f1r f1rVar2) {
        List listSingletonList;
        List listSingletonList2;
        lch lchVar = f1rVar instanceof lch ? (lch) f1rVar : null;
        if (lchVar != null) {
            listSingletonList = lchVar.a;
        } else {
            if (f1rVar == null) {
                f1rVar = new p6x();
            }
            listSingletonList = Collections.singletonList(f1rVar);
        }
        lch lchVar2 = f1rVar2 instanceof lch ? (lch) f1rVar2 : null;
        if (lchVar2 != null) {
            listSingletonList2 = lchVar2.a;
        } else {
            if (f1rVar2 == null) {
                f1rVar2 = new p6x();
            }
            listSingletonList2 = Collections.singletonList(f1rVar2);
        }
        return new lch(o7h.N0(listSingletonList2, listSingletonList));
    }

    public static boolean t(pg4 pg4Var) {
        return pg4Var.b();
    }

    public static boolean u(pg4 pg4Var) {
        return pg4Var.h();
    }

    public static boolean v(pg4 pg4Var) {
        return pg4Var.c();
    }

    public static boolean w(pg4 pg4Var) {
        return pg4Var.i();
    }

    public abstract hvu0 h();

    public boolean l() {
        return true;
    }
}
