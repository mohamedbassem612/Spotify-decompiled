package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kxb0 implements xpw {
    public final int a;
    public final int b;
    public final gw70 c;
    public final i01 d;
    public final i44 e;
    public final jjh1 f;
    public final byp g;
    public final rey0 h = new rey0(new yy80(this, (byte) 25));
    public final ia00 i;
    public final psw t;

    public kxb0(int i, int i2, gw70 gw70Var, i01 i01Var, i44 i44Var, jjh1 jjh1Var, byp bypVar) {
        ia00 ia00VarA;
        this.a = i;
        this.b = i2;
        this.c = gw70Var;
        this.d = i01Var;
        this.e = i44Var;
        this.f = jjh1Var;
        this.g = bypVar;
        int iC = l1d.C(i2);
        if (iC == 0) {
            ia00VarA = n3o1.q(this).a(new ixb0(this, (byte) 1), lta0.P0);
        } else {
            if (iC != 1 && iC != 2) {
                eg.o();
                throw null;
            }
            ia00VarA = n3o1.q(this).a(new ixb0(this, (byte) 0), lta0.O0);
        }
        this.i = ia00VarA;
        j2i j2iVar = new j2i(-1581326972, new pba0(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:42:0x0087 A[PHI: r3
      0x0087: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v12 java.lang.String) binds: [B:52:0x009f, B:40:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092 A[PHI: r2
      0x0092: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v18 java.lang.String) binds: [B:54:0x00a7, B:44:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e(ji0 ji0Var, int i, boolean z, iu30 iu30Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        String strR;
        String str;
        fgh0 fgh0Var = ji0Var.g;
        String str2 = ji0Var.V0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1654812778);
        int i3 = i2 | (b0kVar2.i(ji0Var) ? 4 : 2) | (b0kVar2.e(i) ? 32 : 16) | (b0kVar2.h(z) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar2.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar2.i(this) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        if (b0kVar2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String str3 = "";
            if (z) {
                str = ji0Var.U0;
                if (str != null) {
                    if (str.length() == 0) {
                        str = null;
                    }
                    if (str == null) {
                    }
                }
                if (str2 != null) {
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    str = str3;
                }
                strR = ila0.r(fgh0Var.a);
                if (strR != null) {
                    str3 = strR;
                }
                str = str3;
            } else {
                if (str2 != null) {
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    str = str3;
                }
                strR = ila0.r(fgh0Var.a);
                if (strR != null) {
                    str3 = strR;
                }
                str = str3;
            }
            Uri uri = Uri.parse(str);
            boolean zI = b0kVar2.i(ji0Var) | b0kVar2.i(this);
            Object objT = b0kVar2.T();
            if (zI || objT == fkj0.X) {
                objT = new vq80(ji0Var, this, (byte) 18);
                b0kVar2.s0(objT);
            }
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 126974);
            String str4 = ji0Var.c;
            if (ihc1.y0(str4)) {
                str4 = null;
            }
            String str5 = ji0Var.S0;
            if (str5 == null || ihc1.y0(str5)) {
                str5 = null;
            }
            b0kVar2.i0(-1137155177);
            String strY0 = o7h.y0(f46.i0(new String[]{str4, str5}), ": ", (String) null, (String) null, (iu30) null, 62);
            if (ihc1.y0(strY0)) {
                strY0 = cwl1.o0(b0kVar2, 2131951993);
            }
            b0kVar2.r(false);
            int iC = l1d.C(this.a);
            if (iC == 0) {
                b0kVar2 = b0kVar2;
                b0kVar2.i0(-1137151362);
                int i4 = i3 << 3;
                f(ji0Var, i, ni7VarA, strY0, iu30Var, b0kVar2, (i3 & 126) | (i4 & 57344) | (i4 & 458752));
                b0kVar2.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(b0kVar2, -1137152513, false);
                }
                b0kVar2.i0(-1137143870);
                int i5 = i3 & 126;
                int i6 = i3 << 3;
                b0kVar2 = b0kVar2;
                g(ji0Var, i, ni7VarA, strY0, iu30Var, b0kVar2, i5 | (i6 & 57344) | (i6 & 458752));
                b0kVar2.r(false);
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, ji0Var, i, z, iu30Var, i2);
        }
    }

    public final void f(ji0 ji0Var, int i, ni7 ni7Var, String str, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1968838157);
        j06 j06Var = x340Var2.a;
        int i3 = (x340Var2.i(ji0Var) ? 4 : 2) | i2 | (x340Var2.e(i) ? 32 : 16) | (x340Var2.g(ni7Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var2.g(str) ? SemanticState.Modal : SemanticState.ReadOnly);
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 16384 : SemanticState.Multiline;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String str2 = azd1.a + "-" + i;
            qim0 qim0VarX = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N(str2, qim0VarX), 1.0f);
            if (ji0Var.b()) {
                x340Var2.i0(-1583792600);
                String str3 = ji0Var.R0;
                String str4 = (str3 == null || ihc1.y0(str3)) ? null : str3;
                pm31 pm31Var = new pm31(0);
                boolean z = (i3 & 57344) == 16384;
                Object objT = x340Var2.T();
                if (z || objT == m4cVar) {
                    objT = new sya0(iu30Var, (byte) 4);
                    x340Var2.s0(objT);
                }
                qim0VarX = bin.x(qim0VarX, false, str4, pm31Var, (idn0) null, (Function0) objT, 9);
                qim0Var = qim0VarX;
                x340Var2.r(false);
            } else {
                qim0Var = qim0VarX;
                x340Var2.i0(-1583580343);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarX);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new z9b0(str, (byte) 1);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarThen, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0Var2 = qim0Var;
            int i4 = i3;
            eso1.h(ni7Var, isl.a, i1p1.q(qim0Var, er31.b(2.0f)), new p3v(104.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 56 | ((i3 >> 6) & 14), 496);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var2);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(ji0Var.c, (qim0) null, cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1722);
            String str5 = ji0Var.S0;
            if (str5 == null) {
                str5 = "";
            }
            uwo1.e(str5, (qim0) null, cbx.d(x340Var2).j, ((vex) zex.a.e).m, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1714);
            x340Var = x340Var2;
            if (ji0Var.b()) {
                x340Var.i0(321125923);
                boolean z4 = (i4 & 57344) == 16384;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new sya0(iu30Var, (byte) 5);
                    x340Var.s0(objT3);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT3);
                idx idxVar = new idx();
                gdx gdxVarS = yla.s(x340Var);
                cvx cvxVar2 = cbx.b(x340Var).b;
                foo1.c(gbxVar, idxVar, uyn1.B(qim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1000086311, new exb0(ji0Var, (byte) 0), x340Var), x340Var, 0, 48, 2008);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(321491413);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fxb0(this, ji0Var, i, ni7Var, str, iu30Var, i2, (byte) 0);
        }
    }

    public final void g(ji0 ji0Var, int i, ni7 ni7Var, String str, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(506987683);
        j06 j06Var = x340Var2.a;
        int i3 = (x340Var2.i(ji0Var) ? 4 : 2) | i2 | (x340Var2.e(i) ? 32 : 16) | (x340Var2.g(ni7Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var2.g(str) ? SemanticState.Modal : SemanticState.ReadOnly);
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 16384 : SemanticState.Multiline;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String str2 = azd1.a + "-" + i;
            qim0 qim0VarV = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N(str2, qim0VarV), 1.0f);
            if (ji0Var.b()) {
                x340Var2.i0(-1729560331);
                jtr jtrVar = jtr.f;
                String str3 = ji0Var.R0;
                String str4 = (str3 == null || ihc1.y0(str3)) ? null : str3;
                pm31 pm31Var = new pm31(0);
                boolean z = (i3 & 57344) == 16384;
                Object objT = x340Var2.T();
                if (z || objT == m4cVar) {
                    objT = new sya0(iu30Var, (byte) 6);
                    x340Var2.s0(objT);
                }
                qim0VarV = bin.v(qim0VarV, (idn0) null, jtrVar, false, str4, pm31Var, (Function0) objT, 4);
                qim0Var = qim0VarV;
                x340Var2.r(false);
            } else {
                qim0Var = qim0VarV;
                x340Var2.i0(-1729252935);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarV);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarThen, er31.b(8.0f));
            zsc zscVar = zex.a;
            qim0 qim0VarF2 = dug.f(qim0VarQ, ((yex) zscVar.d).c, d4o1.a);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 12.0f);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new z9b0(str, (byte) 2);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarX, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            mta mtaVar = cbx.b(x340Var2).d;
            as80 as80Var = mif1.V0;
            cua cuaVar2 = cbx.b(x340Var2).f;
            int i4 = i3;
            eso1.h(ni7Var, isl.a, i1p1.q(qim0Var, er31.b(4.0f)), new p3v(56.0f), (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, x340Var2, 56 | ((i3 >> 6) & 14), 432);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, wnb0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(ji0Var.c, (qim0) null, cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1722);
            String str5 = ji0Var.S0;
            if (str5 == null) {
                str5 = "";
            }
            uwo1.e(str5, (qim0) null, cbx.d(x340Var2).j, ((vex) zscVar.e).m, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1714);
            x340Var = x340Var2;
            x340Var.r(true);
            if (ji0Var.b()) {
                x340Var.i0(1061656048);
                boolean z4 = (i4 & 57344) == 16384;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new sya0(iu30Var, (byte) 7);
                    x340Var.s0(objT3);
                }
                foo1.c(new gbx(z50.c, (Function0) objT3), new idx(), (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-917403935, new exb0(ji0Var, (byte) 1), x340Var), x340Var, 0, 48, 2012);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1061943387);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fxb0(this, ji0Var, i, ni7Var, str, iu30Var, i2, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
