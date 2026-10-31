package p;

import android.icu.text.DateFormat;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tva1 implements tyq {
    public final Object N0;
    public final Object O0;
    public Object P0;
    public Object Q0;
    public final Object R0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final d0r b;
    public final Object c;
    public final ia00 d;
    public final psw e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public tva1(d0r d0rVar, asa1 asa1Var, esa1 esa1Var, g0l g0lVar, los losVar, oqa1 oqa1Var, q8n q8nVar, hrq hrqVar, irq irqVar, jrq jrqVar, krq krqVar, lrq lrqVar, mrq mrqVar) {
        this.a = (byte) 0;
        this.b = d0rVar;
        this.f = esa1Var;
        this.g = losVar;
        this.h = oqa1Var;
        this.i = q8nVar;
        this.t = hrqVar;
        this.X = irqVar;
        this.Y = jrqVar;
        this.Z = krqVar;
        this.N0 = lrqVar;
        this.O0 = mrqVar;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.o(new l4r(new xv00(jd11Var.b(ro7.class)), 2, qva1.d, new j4r(qva1.b), qva1.e), qva1.c);
        this.P0 = rqt0.u(new ph11(yoi1.g(((inr) g0lVar).d()), (byte) 11));
        this.Q0 = i13.v;
        hea1 hea1Var = hea1.e1;
        gp71 gp71Var = gp71.i;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new sra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ura1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cra1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ora1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ara1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bra1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pra1(asa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zqa1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qra1(asa1Var)));
        this.R0 = sbl.A(hea1Var, gp71Var, new a(asa1Var.m, coroutinesSubtypeEffectHandlerBuilderI), h9a1.e1, new pva1(this));
        this.d = n3o1.q(this).a(r8a1.d1, r8a1.e1);
        j2i j2iVar = new j2i(1735067820, new u491(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return (azg) this.R0;
            default:
                return this.d;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.e;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-814759364);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            t1c.a(u291.h(u291.f(nim0.a, 1.0f), dsa0.m(x340Var, 2131166077)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wcf1(this, i, (byte) 10);
        }
    }

    public void g(String str, String str2, String str3, String str4, b0k b0kVar, int i) {
        String str5 = str2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(233466755);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str5) ? 32 : 16) | (b0kVar2.g(str3) ? 256 : 128) | (b0kVar2.g(str4) ? 2048 : 1024) | (b0kVar2.i(this) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            y0q0 y0q0VarW = w3p1.w(ihc1.Z0(str5, "?"), str3, str4, (zwp) this.i, (b0d0) this.t, this.b, (ruz) this.X, (iac0) this.Y, (String) this.Z, (p6r0) this.N0, b0kVar2, (i2 >> 3) & 1008);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, anm1.N("agent_list_title", new wnb0(1.0f, true)), cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, i2 & 14, 0, 1712);
            b0kVar2 = b0kVar2;
            mta mtaVar = cbx.b(b0kVar2).d;
            qim0 qim0VarN = anm1.N("collection_preview_action_play", u291.m(nim0Var, 48.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarN);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            str5 = str2;
            otw.c(y0q0VarW, new n0q0(ihc1.Z0(str5, "?")), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 5, i, this, str, str5, str3, str4);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (e7m0) this.R0;
            case 1:
                return (ljm0) this.R0;
            case 2:
                return (js20) this.P0;
            default:
                return (js20) this.R0;
        }
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (i13) this.Q0;
            case 1:
                return (o3r) this.c;
            case 2:
                return (i13) this.Q0;
            default:
                return (ryf1) this.P0;
        }
    }

    public void h(boolean z, String str, trf1 trf1Var, Function0 function0, Function0 function1, vu30 vu30Var, Function0 function2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        Function0 function3;
        Function0 function4;
        vu30 vu30Var2;
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1688361490);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(trf1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function0;
            i2 |= b0kVar3.i(function3) ? 2048 : 1024;
        } else {
            function3 = function0;
        }
        if ((i & 24576) == 0) {
            function4 = function1;
            i2 |= b0kVar3.i(function4) ? 16384 : 8192;
        } else {
            function4 = function1;
        }
        if ((196608 & i) == 0) {
            vu30Var2 = vu30Var;
            i2 |= b0kVar3.i(vu30Var2) ? 131072 : 65536;
        } else {
            vu30Var2 = vu30Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.i(this) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            String str2 = trf1Var.a;
            c380 c380Var = trf1Var.b;
            boolean z2 = trf1Var.c;
            boolean z3 = trf1Var.d;
            if (z) {
                b0kVar3.i0(-384277861);
                j2iVarR = apo.r(-868132320, new juc1(this, str, trf1Var, (byte) 22), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-384035658);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            j2i j2iVar = j2iVarR;
            int i3 = i2 << 6;
            b0kVar2 = b0kVar3;
            Function0 function5 = function3;
            Function0 function6 = function4;
            vu30 vu30Var3 = vu30Var2;
            u7n0.r(str2, c380Var, z2, z3, j2iVar, function5, function6, vu30Var3, (l6q) this.g, apo.r(-594480572, new e9f1(this, (byte) 4), b0kVar3), this.b, trf1Var.e, nim0.a, false, false, trf1Var.h, trf1Var.i, trf1Var.j, function2, iu30Var, b0kVar2, (458752 & i3) | 805306368 | (3670016 & i3) | (29360128 & i3), (234881024 & i3) | 3456 | (i3 & 1879048192), 16384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ob8(this, z, str, trf1Var, function0, function1, vu30Var, function2, iu30Var, i, (byte) 6);
        }
    }

    public void i(String str, String str2, String str3, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2066433542);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = ((o1q) this.h).a(this.b, (ruz) this.X, (iac0) this.Y, (String) this.Z, (p6r0) this.N0, nik1.w6.a, new urf1(this, (byte) 0));
                x340Var.s0(objT);
            }
            otw.c((xoy) objT, new koy(str, 2, str2, str3, eoy.f), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, this, str, str2, str3, (byte) 17);
        }
    }

    public myf1 j(hyf1 hyf1Var, k1r k1rVar) {
        mxf1 nxf1Var;
        String str = hyf1Var.c;
        if (!(k1rVar instanceof i1r)) {
            return new kyf1(hyf1Var.a, str);
        }
        byf1 byf1Var = (byf1) ((i1r) k1rVar).a;
        jo70 jo70Var = byf1Var.a;
        String str2 = hyf1Var.a;
        if (jo70Var == null) {
            return new kyf1(str2, str);
        }
        String str3 = jo70Var.a;
        List list = byf1Var.b;
        int iP = list != null ? qxd0.P(list) : 0;
        Long l = byf1Var.c;
        List list2 = byf1Var.a.d;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ho70) it.next()).a);
        }
        String str4 = hyf1Var.a;
        qtt0 qtt0Var = byf1Var.d;
        String str5 = hyf1Var.b;
        String str6 = hyf1Var.c;
        oyf1 oyf1Var = hyf1Var.d;
        zoy0 zoy0Var = byf1Var.e;
        mxf1 mxf1VarValueOf = null;
        if (oyf1Var instanceof oyf1) {
            int iC = l1d.C(oyf1Var.a);
            if (iC == 0) {
                if (zoy0Var != null) {
                    yqg yqgVar = (yqg) this.f;
                    xoy0 xoy0Var = (yoy0) zoy0Var.b.b;
                    if (xoy0Var instanceof xoy0) {
                        Calendar calendarD = yqgVar.d();
                        xoy0 xoy0Var2 = xoy0Var;
                        calendarD.set(xoy0Var2.a, xoy0Var2.b - 1, xoy0Var2.c);
                        mxf1VarValueOf = DateFormat.getInstanceForSkeleton("MMMM d, y", new Locale(upn1.m())).format(calendarD.getTime());
                    } else if (xoy0Var instanceof woy0) {
                        Calendar calendarD2 = yqgVar.d();
                        woy0 woy0Var = (woy0) xoy0Var;
                        calendarD2.set(woy0Var.a, woy0Var.b - 1, 1);
                        mxf1VarValueOf = DateFormat.getInstanceForSkeleton("MMMM y", new Locale(upn1.m())).format(calendarD2.getTime());
                    } else if (xoy0Var instanceof voy0) {
                        mxf1VarValueOf = String.valueOf(((voy0) xoy0Var).a);
                    } else if (!(xoy0Var instanceof uoy0)) {
                        eg.o();
                        return null;
                    }
                }
                nxf1Var = new nxf1(mxf1VarValueOf);
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                mxf1VarValueOf = mxf1.c;
            }
            return new jyf1(str2, str3, l, arrayList, str2, iP, str4, qtt0Var, str5, str6, nxf1Var, hyf1Var.e);
        }
        if (!oyf1Var.equals(pyf1.a)) {
            eg.o();
            return null;
        }
        nxf1Var = mxf1VarValueOf;
        return new jyf1(str2, str3, l, arrayList, str2, iP, str4, qtt0Var, str5, str6, nxf1Var, hyf1Var.e);
    }

    public tva1(ycm ycmVar, l6q l6qVar, o1q o1qVar, zwp zwpVar, b0d0 b0d0Var, d0r d0rVar, ruz ruzVar, iac0 iac0Var, String str, p6r0 p6r0Var, q4h0 q4h0Var, q4h0 q4h0Var2) {
        this.a = (byte) 2;
        this.f = ycmVar;
        this.g = l6qVar;
        this.h = o1qVar;
        this.i = zwpVar;
        this.t = b0d0Var;
        this.b = d0rVar;
        this.X = ruzVar;
        this.Y = iac0Var;
        this.Z = str;
        this.N0 = p6r0Var;
        this.O0 = q4h0Var;
        this.c = q4h0Var2;
        this.P0 = z0o1.j(new urf1(this, (byte) 1), ggf1.t, new urf1(this, (byte) 2), 4);
        j2i j2iVar = new j2i(-1810511295, new y2f1(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.Q0 = i13.x;
        this.d = n3o1.q(this).a(vrf1.b, vrf1.c);
        this.R0 = new azg(this);
    }

    public tva1(axo axoVar, bxo bxoVar, jsq jsqVar, ksq ksqVar, cxo cxoVar, hlp hlpVar, uep uepVar, mwm1 mwm1Var, peq peqVar, qeq qeqVar, w8r0 w8r0Var, d0r d0rVar, q7r0 q7r0Var) {
        this.a = (byte) 1;
        this.f = axoVar;
        this.g = bxoVar;
        this.h = jsqVar;
        this.i = ksqVar;
        this.t = cxoVar;
        this.X = hlpVar;
        this.Y = uepVar;
        this.Z = mwm1Var;
        this.N0 = w8r0Var;
        this.b = d0rVar;
        this.O0 = q7r0Var;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, ljc1.Q0, new j4r(ljc1.O0), ljc1.R0), new l4r(new xv00(jd11Var.b(jo70.class)), 1, ljc1.S0, new j4r(ljc1.P0), ljc1.T0), osc1.b);
        this.R0 = h7w.B(ljc1.N0, (o8n) null, (iu30) null, new gk0(this, peqVar, qeqVar, (byte) 25), 6);
        this.d = n3o1.q(this).a(m1c1.O0, m1c1.P0);
        j2i j2iVar = new j2i(-1375860050, new vsb1(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public tva1(z08 z08Var, woq woqVar, yqg yqgVar, r6h1 r6h1Var, d0r d0rVar, mjm mjmVar, iac0 iac0Var, kkw0 kkw0Var) {
        this.a = (byte) 3;
        this.f = yqgVar;
        this.b = d0rVar;
        this.g = mjmVar;
        this.h = z08Var.a(d0rVar, iac0Var, kkw0Var, r6h1Var);
        this.i = woqVar.a(d0rVar);
        this.t = new wm31(d0rVar);
        this.X = new ryf1(this, (byte) 3);
        this.Y = new ryf1(this, (byte) 0);
        this.Z = new ryf1(this, (byte) 1);
        jd11 jd11Var = rc11.a;
        this.c = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 2, uyf1.b, new j4r(iwf1.X0), uyf1.c), new l4r(new wlu(jd11Var.b(hll.class)), 2, uyf1.d, new j4r(iwf1.Y0), uyf1.e), new l4r(new wlu(jd11Var.b(a7q0.class)), 2, uyf1.f, new j4r(iwf1.Z0), uyf1.g), rre1.g);
        this.N0 = w3p1.o(new l4r(new wlu(jd11Var.b(zoy0.class)), 2, uyf1.h, new j4r(iwf1.c1), uyf1.i), iwf1.d1);
        this.O0 = new ryf1(this, (byte) 4);
        this.P0 = new ryf1(this, (byte) 2);
        this.Q0 = w3p1.o(new l4r(pwc0.s, 2, uyf1.t, new j4r(iwf1.a1), iwf1.e1), iwf1.b1);
        this.R0 = x3p1.n(new tyf1(this, (byte) 0), new tyf1(this, (byte) 1), new wcf1(this, (byte) 13), (o8n) null, new tyf1(this, (byte) 2), 8);
        this.d = n3o1.q(this).a(vrf1.X, vrf1.Y);
        j2i j2iVar = new j2i(-919981316, new y2f1(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
