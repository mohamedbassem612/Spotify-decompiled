package p;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gho1 {
    public static final kg91 a = new kg91();
    public static final mg91 b = new mg91();
    public static b180 c;

    public static final void a(hw2 hw2Var, nm1 nm1Var, nm1 nm1Var2, el9 el9Var, lwm lwmVar, b0k b0kVar, int i) {
        hw2 hw2Var2;
        nm1 nm1Var3;
        nm1 nm1Var4;
        el9 el9Var2;
        lwm lwmVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-335632702);
        int i2 = (x340Var.i(hw2Var) ? 4 : 2) | i | (x340Var.i(nm1Var) ? 32 : 16) | (x340Var.i(nm1Var2) ? 256 : 128) | (x340Var.i(el9Var) ? 2048 : 1024) | (x340Var.g(lwmVar) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            q7r0 q7r0VarG = ((cir0) x340Var.k(k2r0.a)).g();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new eq80(new e3h1((l6h1) q7r0VarG.b(l6h1.class), (n7h1) q7r0VarG.b(n7h1.class), (i8h1) q7r0VarG.b(i8h1.class)));
                x340Var.s0(objT);
            }
            eq80 eq80Var = (eq80) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new v7l(eq80Var, (byte) 23);
                x340Var.s0(objT2);
            }
            hw2Var2 = hw2Var;
            nm1Var3 = nm1Var;
            nm1Var4 = nm1Var2;
            el9Var2 = el9Var;
            lwmVar2 = lwmVar;
            dgo1.c("contributor-sheet-logger", (iu30) objT2, apo.r(939958534, new mwm(hw2Var2, lwmVar2, nm1Var3, nm1Var4, el9Var2), x340Var), x340Var, 438);
        } else {
            hw2Var2 = hw2Var;
            nm1Var3 = nm1Var;
            nm1Var4 = nm1Var2;
            el9Var2 = el9Var;
            lwmVar2 = lwmVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mwm(hw2Var2, nm1Var3, nm1Var4, el9Var2, lwmVar2, i);
        }
    }

    public static final void b(float f, int i, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1965215563);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.d(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new vgf(i, f, j2iVar);
                x340Var.s0(objT);
            }
            ejo1.l(0, 1, x340Var, (vu30) objT, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dq00(f, i, j2iVar, i2);
        }
    }

    public static final void c(boolean z, boolean z2, float f, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(574193114);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.d(f) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(326677828, new b360(z, z2, f, j2iVar, j2iVar2), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c360(z, z2, f, j2iVar, j2iVar2, qim0Var, i);
        }
    }

    public static final void d(nt70 nt70Var, Function0 function0, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-546270780);
        int i2 = i | (x340Var.g(nt70Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = nt70Var.h != null;
            String str = nt70Var.c;
            if (str == null || ihc1.y0(str)) {
                str = null;
            }
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = ktd.o(0.0f, x340Var);
            }
            gfx.g(7, apo.r(1567983921, new q3(qim0Var, nt70Var, z, (ven0) objT, function0, iu30Var, (wat) x340Var.k(t4k.h), str), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, nt70Var, function0, qim0Var, iu30Var, (byte) 29);
        }
    }

    public static final void e(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1488900514);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2);
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = s4h0.d1;
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("device-max-quality-test-tag", s161.b(qim0VarZ, true, (iu30) objT));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131957744), null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            uwo1.e(cwl1.o0(x340Var, i), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 2, i, i2);
        }
    }

    public static final void f(kdh0 kdh0Var, b0k b0kVar, int i) {
        Integer num = kdh0Var.o;
        Integer num2 = kdh0Var.m;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-782137938);
        int i2 = (x340Var.g(kdh0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.D(uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), (era) null, 3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            hr80.d(u291.f(nim0Var, 1.0f), 1.0f, ((vex) zex.a.e).i, x340Var, 0, 0);
            if (num2 != null) {
                x340Var.i0(1639614260);
                g(num2.intValue(), kdh0Var.n, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1639746878);
                x340Var.r(false);
            }
            if (num != null) {
                x340Var.i0(1639802523);
                e(num.intValue(), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1639866910);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbf0(kdh0Var, i, (byte) 28);
        }
    }

    public static final void g(int i, Integer num, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1996780059);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.g(num) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = s4h0.e1;
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("max-streaming-quality-test-tag", s161.b(qim0VarZ, true, (iu30) objT));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131957746), null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            uwo1.e(cwl1.o0(x340Var, i), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            if (num == null) {
                x340Var.i0(-1578104132);
                x340Var.r(false);
            } else {
                x340Var.i0(-1578104131);
                uwo1.e(cwl1.o0(x340Var, num.intValue()), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(i, i2, num);
        }
    }

    public static final void h(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1127899639);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.c;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, new uvx(0, (pgx) null, 2, new zzq0(f, 16.0f, f, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499), null, false, null, null, new gbx(z50.c, function0), null, apo.r(-701580653, new xo6(str3, str, (byte) 10), b0kVar3), null, null, null, null, null, null, apo.r(-1348302003, new qdg0(str2, (byte) 15), b0kVar3), b0kVar2, 100663360, 196608, 32444);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new duh(str, str2, str3, function0, qim0Var2, i, (byte) 3);
        }
    }

    public static final void i(i2c i2cVar, zyq0 zyq0Var, rk41 rk41Var, boolean z, i26 i26Var, qim0 qim0Var, b0k b0kVar, int i) {
        i2c i2cVar2;
        int i2;
        cfs0 cfs0Var;
        float f;
        boolean z2;
        ven0 ven0VarP;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-447289469);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2cVar2 = i2cVar;
            i2 = (x340Var.g(i2cVar2) ? 4 : 2) | i;
        } else {
            i2cVar2 = i2cVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(zyq0Var) : x340Var.i(zyq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(i26Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            float fD = i2cVar2.d();
            float fC = i2cVar2.c();
            float fO = fho1.o(fD, fC);
            float f2 = yoi1.m(new p3v(fC * 0.08f), new p3v(fO / 0.67085785f)).a;
            cfs0 cfs0Var2 = new cfs0(fO, f2);
            if (z) {
                x340Var.i0(2083393423);
                flv flvVar = ilv.a;
                flvVar.getClass();
                ceo ceoVar = flv.d;
                hsi1 hsi1VarQ = wxo1.q("packSlideInDp", f2, -5.0f, new pxg1(1000, 1500, ceoVar));
                flvVar.getClass();
                hsi1 hsi1VarQ2 = wxo1.q("packWiggleDown", -5.0f, 5.0f, new pxg1(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, ceoVar));
                flvVar.getClass();
                hsi1 hsi1VarQ3 = wxo1.q("packWiggleUp", 5.0f, -5.0f, new pxg1(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, ceoVar));
                flvVar.getClass();
                hsi1 hsi1VarQ4 = wxo1.q("packWiggleDownAgain", -5.0f, 5.0f, new pxg1(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, ceoVar));
                flvVar.getClass();
                cfs0Var = cfs0Var2;
                f = fO;
                z2 = false;
                ven0VarP = zod.P(mqo1.s(hsi1VarQ, hsi1VarQ2, hsi1VarQ3, hsi1VarQ4, wxo1.q("packWiggleSettle", 5.0f, 0.0f, new pxg1(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar))), rk41Var.a, (String) null, (Function0) null, (Function0) null, x340Var, 8, 28);
                x340Var.r(false);
            } else {
                x340Var.i0(2083294192);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.o(0.0f, x340Var);
                }
                ven0VarP = (ven0) objT;
                x340Var.r(false);
                f = fO;
                cfs0Var = cfs0Var2;
                z2 = false;
            }
            qim0 qim0VarR = i1p1.r(u291.d(qim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.X, z2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            qim0 qim0VarR2 = d7e.r(0.67085785f, u291.v(nim0.a, f), z2);
            boolean zG = x340Var.g(cfs0Var) | x340Var.g(ven0VarP);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new cc2(cfs0Var, ven0VarP, (byte) 28);
                x340Var.s0(objT2);
            }
            qim0 qim0VarD = a8o.D(i541.C(qim0VarR2, (iu30) objT2), i26Var);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            fho1.b(zyq0Var, null, x340Var, ((i3 >> 3) & 14) | 8);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(i2cVar, zyq0Var, rk41Var, z, i26Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void j(c380 c380Var, String str, int i, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1713814011);
        int i3 = i2 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(2) ? 32 : 16) | (x340Var.d(16.0f) ? 256 : 128) | (x340Var.d(61.5f) ? 2048 : 1024) | (x340Var.g(str) ? 16384 : 8192) | (x340Var.e(i) ? 131072 : 65536) | 12582912;
        if (!x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (c380Var.size() > 2) {
                eg.m("The size of the stories list has to be equal or less than the number of cards to be displayed in the column");
                return;
            }
            boolean z = (458752 & i3) == 131072;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new sl11(i, (byte) 11);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iA = (int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L);
            boolean zE = ((i3 & 57344) == 16384) | ((i3 & 14) == 4) | x340Var.e(iA) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | x340Var.i(pbh.a);
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                objT2 = new um81(iA, str, c380Var, j2iVar);
                x340Var.s0(objT2);
            }
            ejo1.l(0, 1, x340Var, (vu30) objT2, null);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(c380Var, str, i, j2iVar, qim0Var2, i2);
        }
    }

    public static boolean k(String str) {
        int length = str.length();
        if (length >= 10 && length <= 20) {
            int length2 = str.length();
            boolean z = false;
            for (int i = 0; i < length2; i++) {
                char cCharAt = str.charAt(i);
                if (l(cCharAt)) {
                    if ('A' <= cCharAt && cCharAt < '[') {
                        z = true;
                    }
                }
            }
            return z;
        }
        return false;
    }

    public static boolean l(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        if ('A' > c2 || c2 >= '[') {
            return '0' <= c2 && c2 < ':';
        }
        return true;
    }

    public static final boolean m(ltl1 ltl1Var) {
        return ltl1Var.equals(ltl1.c) || ltl1Var.equals(ltl1.d);
    }

    public static boolean n(String str) {
        if (str.length() == 22) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (l(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static gg11 o(Parcel parcel, Parcelable.Creator creator) {
        int i = parcel.readInt();
        h380 h380VarA = j380.a();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return h380VarA.b(true);
            }
            h380VarA.e(parcel.readString(), creator.createFromParcel(parcel));
            i = i2;
        }
    }

    public static final Bitmap p(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = z4p1.G(z4p1.f(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static final ezz q(l2e l2eVar, boolean z) {
        return new ezz(l2eVar.a, z, l2eVar.e, l2eVar.g);
    }

    public static final eln0 r(n1x n1xVar) {
        return new eln0(n1xVar.a, n1xVar.b, n1xVar.e, n1xVar.c, n1xVar.d, n1xVar.f);
    }

    public static void s(Parcel parcel, Integer num) {
        if (num != null) {
            hrt.l(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void t(Parcel parcel, Map map) {
        Iterator itJ = xcg1.j(parcel, map);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            entry.getKey().getClass();
            entry.getValue().getClass();
            String str = (String) entry.getKey();
            str.getClass();
            parcel.writeString(str);
            ((Parcelable) entry.getValue()).writeToParcel(parcel, 0);
        }
    }

    public static void u(int i, int i2) {
        String strN;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strN = zho1.N("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(f4i1.c(i2, "negative size: "));
                    return;
                }
                strN = zho1.N("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static void v(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(x(i, i2, "index"));
        }
    }

    public static void w(int i, int i2, int i3) {
        String strX;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strX = x(i, i3, "start index");
            } else {
                strX = (i2 < 0 || i2 > i3) ? x(i2, i3, "end index") : zho1.N("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strX);
        }
    }

    public static String x(int i, int i2, String str) {
        if (i < 0) {
            return zho1.N("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zho1.N("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(f4i1.c(i2, "negative size: "));
        return null;
    }
}
