package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ezg0 implements tyq {
    public static final o3r S0 = w3p1.o(new l4r(new xv00(rc11.a.b(jo70.class)), 1, jtg0.t, new j4r(jtg0.g), jtg0.X), jtg0.h);
    public final js20 O0;
    public final i13 P0;
    public final ia00 Q0;
    public final psw R0;
    public final i5w0 X;
    public final d0r Y;
    public final joe a;
    public final a1r0 b;
    public final mr4 c;
    public final kvp d;
    public final w9u0 e;
    public final mpa1 f;
    public final g38 g;
    public final tra0 h;
    public final yo2 i;
    public final pe t;
    public final bbc Z = mno1.a(-2, 0, 6);
    public final xgn0 N0 = ygn0.a();

    public ezg0(joe joeVar, a1r0 a1r0Var, Flowable flowable, mr4 mr4Var, kvp kvpVar, w9u0 w9u0Var, mpa1 mpa1Var, g38 g38Var, tra0 tra0Var, yo2 yo2Var, pe peVar, i5w0 i5w0Var, d0r d0rVar) {
        this.a = joeVar;
        this.b = a1r0Var;
        this.c = mr4Var;
        this.d = kvpVar;
        this.e = w9u0Var;
        this.f = mpa1Var;
        this.g = g38Var;
        this.h = tra0Var;
        this.i = yo2Var;
        this.t = peVar;
        this.X = i5w0Var;
        this.Y = d0rVar;
        vbm[] vbmVarArr = q601.a;
        this.O0 = x3p1.m(hu20.e(rqt0.u(new dy20(new kge(flowable), (byte) 8)), new zz90((lnm) null, this, (byte) 18)), jtg0.i, bzg0.b, (o8n) null, new e4f0(this, (byte) 28), 8);
        this.P0 = i13.o;
        this.Q0 = n3o1.q(this).a(ytg0.g, new kmd0(this, (byte) 28));
        j2i j2iVar = new j2i(2130054425, new qcd0(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.R0 = new psw(j2iVar, (byte) 0);
    }

    public static void g(ezg0 ezg0Var, String str, String str2, int i) {
        String str3 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            str2 = null;
        }
        a1r0 a1r0Var = ezg0Var.b;
        String str4 = nik1.w6.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("martini-launch-parameters", l6h0.a);
        if (str2 == null) {
            bundle.putBoolean("martini-open-with-keyboard", true);
        } else {
            bundle.putString("martini-prompt", str2);
            bundle.putBoolean("martini-open-with-keyboard", false);
            bundle.putBoolean("martini-resume-playback-after-tts", false);
        }
        a1r0.j(a1r0Var, str4, str3, bundle, false, 8);
    }

    public final rqw a() {
        return this.Q0;
    }

    public final jsw c() {
        return this.R0;
    }

    public final d0r e() {
        return this.Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ksw kswVar, uyg0 uyg0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) throws Throwable {
        String strK;
        String strK2;
        String strK3;
        c9 c9VarS;
        Object z290Var;
        ven0 ven0Var;
        tob1 tob1Var;
        Throwable th;
        qim0 qim0Var;
        qim0 qim0VarX;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1523446167);
        int i2 = i | (x340Var.i(uyg0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9361) != 9360)) {
            String str = uyg0Var.b;
            gzg0 gzg0Var = uyg0Var.e;
            if (!h()) {
                gzg0Var = null;
            }
            if (gzg0Var != null) {
                x340Var.i0(805799216);
                x340Var.r(false);
                c9VarS = mqo1.s(new String[]{gzg0Var.a});
            } else if (uyg0Var.c) {
                x340Var.i0(805802679);
                c9VarS = mqo1.s(new String[]{cwl1.o0(x340Var, 2131958246), cwl1.o0(x340Var, 2131958247), cwl1.o0(x340Var, 2131958248), cwl1.o0(x340Var, 2131958249), cwl1.o0(x340Var, 2131958250), cwl1.o0(x340Var, 2131958251), cwl1.o0(x340Var, 2131958252), cwl1.o0(x340Var, 2131958253), cwl1.o0(x340Var, 2131958254), cwl1.o0(x340Var, 2131958255)});
                x340Var.r(false);
            } else if (uyg0Var.d) {
                x340Var.i0(805829173);
                c9VarS = mqo1.s(new String[]{cwl1.o0(x340Var, 2131958222), cwl1.o0(x340Var, 2131958223), cwl1.o0(x340Var, 2131958224), cwl1.o0(x340Var, 2131958225), cwl1.o0(x340Var, 2131958226), cwl1.o0(x340Var, 2131958227), cwl1.o0(x340Var, 2131958229), cwl1.o0(x340Var, 2131958245), cwl1.o0(x340Var, 2131958230)});
                x340Var.r(false);
            } else {
                x340Var.i0(-788348746);
                if (str != null) {
                    x340Var.i0(805854319);
                    strK = cwl1.n0(2131958232, new Object[]{str}, x340Var);
                    x340Var.r(false);
                } else {
                    strK = x0d.k(x340Var, 805857227, 2131958233, x340Var, false);
                }
                String str2 = strK;
                if (str != null) {
                    x340Var.i0(805861711);
                    strK2 = cwl1.n0(2131958239, new Object[]{str}, x340Var);
                    x340Var.r(false);
                } else {
                    strK2 = x0d.k(x340Var, 805864619, 2131958240, x340Var, false);
                }
                String str3 = strK2;
                if (str != null) {
                    x340Var.i0(805869103);
                    strK3 = cwl1.n0(2131958243, new Object[]{str}, x340Var);
                    x340Var.r(false);
                } else {
                    strK3 = x0d.k(x340Var, 805872011, 2131958244, x340Var, false);
                }
                c9VarS = mqo1.s(new String[]{str2, cwl1.o0(x340Var, 2131958234), cwl1.o0(x340Var, 2131958235), cwl1.o0(x340Var, 2131958236), cwl1.o0(x340Var, 2131958237), cwl1.o0(x340Var, 2131958238), str3, cwl1.o0(x340Var, 2131958241), cwl1.o0(x340Var, 2131958242), strK3, cwl1.o0(x340Var, 2131958245)});
                x340Var.r(false);
            }
            pe peVar = this.t;
            if (!peVar.b(5)) {
                c9VarS = mqo1.s(new String[]{o7h.q0(c9VarS)});
            }
            mr4 mr4Var = this.c;
            boolean zL = mr4Var.l();
            boolean zB = peVar.b(6);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            krm0 krm0Var = krm0.a;
            if (objT == obj) {
                objT = v8r.q(krm0Var);
                x340Var.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            ven0 ven0VarS = v8r.s(c9VarS, x340Var);
            ven0 ven0VarS2 = v8r.s(iu30Var2, x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zI = x340Var.i(this) | ((i2 & 896) == 256) | x340Var.i(ven0Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                ven0Var = ven0Var2;
                tob1Var = tob1Var2;
                th = null;
                z290Var = new z290(this, iu30Var, ven0Var, (lnm) null, (byte) 23);
                x340Var.s0(z290Var);
            } else {
                ven0Var = ven0Var2;
                z290Var = objT3;
                tob1Var = tob1Var2;
                th = null;
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, x340Var, (vu30) z290Var);
            uwr uwrVar = cbx.a;
            enk1 enk1Var = new enk1(cbx.a(x340Var).a.b.a(), (umk1) null, mr4Var.x(), 30);
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                ty60 ty60VarA = this.f.a(this.g);
                j7s j7sVar = new j7s();
                j7sVar.c = ven0Var;
                j7sVar.d = ven0VarS;
                j7sVar.e = this;
                j7sVar.a = zL;
                j7sVar.b = zB;
                j7sVar.f = ven0VarS2;
                objT4 = this.d.a(this.e, ty60VarA, j7sVar, new sqa0(ven0VarS2, (byte) 22), new sqa0(tob1Var, (byte) 23), (4000 & 32) != 0 ? null : null, enk1Var, (4000 & 128) != 0 ? nim0.a : null, false, z7i0.d1, (4000 & 1024) != 0 ? z7i0.e1 : null, (4000 & 2048) != 0 ? null : null);
                x340Var.s0(objT4);
            }
            orm0 orm0Var = (orm0) objT4;
            krm0 krm0Var2 = (krm0) tob1Var.getValue();
            qim0 qim0Var2 = nim0.a;
            if (krm0Var2 == krm0Var) {
                x340Var.i0(67624379);
                boolean z = (i2 & 7168) == 2048;
                Object objT5 = x340Var.T();
                if (z || objT5 == obj) {
                    objT5 = new ebg0(iu30Var2, (byte) 15);
                    x340Var.s0(objT5);
                }
                qim0VarX = bin.x(qim0Var2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT5, 15);
                qim0Var = qim0Var2;
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                x340Var.i0(67708017);
                x340Var.r(false);
                qim0VarX = qim0Var;
            }
            qim0 qim0VarThen = dug.f(u291.f(qim0Var, 1.0f), ((yex) zex.a.d).c, er31.b(16.0f)).then(qim0VarX);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("MartiniChatEntryCard.Card", uyn1.x(qim0VarThen, 16.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
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
            otw.c(orm0Var, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 2, i, this, kswVar, uyg0Var, iu30Var, iu30Var2);
        }
    }

    public final mqw getBehavior() {
        return this.O0;
    }

    public final f4r getData() {
        return this.P0;
    }

    public final boolean h() {
        return this.c.s() && !this.t.e();
    }
}
