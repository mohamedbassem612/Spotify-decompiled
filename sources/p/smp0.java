package p;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class smp0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final jsw b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public smp0(Context context, ffe1 ffe1Var, los losVar, kvs0 kvs0Var, a0i1 a0i1Var) {
        this.a = (byte) 11;
        this.c = context;
        this.d = kvs0Var;
        d781 d781Var = new d781(this, (byte) 19);
        this.e = x3p1.n(new hhb1(new hce1((yzh1) ffe1Var.b, (nke1) ffe1Var.c, at50.a, context.getResources(), (byte) 1), (byte) 0), d781Var, new iuy0(d781Var, (byte) 18), (o8n) null, new e971(a0i1Var, new bu51((Object) this, (lnm) null, (byte) 7), new xx0(this, (lnm) null, (byte) 23), losVar, (byte) 9), 8);
        this.f = n3o1.q(this).a(c781.a1, c781.b1);
        this.b = new f70((byte) 14);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (ia00) obj;
            case 1:
                return (eih1) obj;
            case 2:
                return (eih1) obj;
            case 3:
                return (ia00) obj;
            case 4:
                return new eih1();
            case 5:
                return (hy00) obj;
            case 6:
                return (eih1) obj;
            case 7:
                return (ia00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (eih1) obj;
            case 10:
                return (ia00) obj;
            case 11:
                return (ia00) obj;
            case 12:
                return (eih1) obj;
            case 13:
                return (eih1) obj;
            default:
                return (ia00) obj;
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return this.b;
    }

    public void e(p861 p861Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        ArrayList arrayList = p861Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-909162131);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(p861Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zG = x340Var.g(arrayList);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                dnc0 dnc0Var = new dnc0((d0r) this.c, (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
                dnc0Var.b(new gj50(new mn41(p861Var, (byte) 27), false), new mn41(this, (byte) 28));
                objT = dnc0Var.a();
                x340Var.s0(objT);
            }
            cnc0 cnc0Var = (cnc0) objT;
            int iIndexOf = arrayList.indexOf(p861Var.b);
            xtb0 xtb0VarA = aub0.a(iIndexOf >= 0 ? iIndexOf : 0, x340Var, 2);
            hno1.e(((i3 >> 3) & 14) | 48, apo.r(-1715567743, new a861(xtb0VarA, jyo1.n(xtb0VarA, cnc0Var, (h3h1) null, x340Var, 4), (byte) 1), x340Var), x340Var);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, p861Var, qim0Var2, i, (byte) 13);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return (ljm0) obj;
            case 1:
                return (rey0) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (rey0) obj;
            case 4:
                return (js20) this.f;
            case 5:
                return (js20) obj;
            case 6:
                return (rey0) obj;
            case 7:
                return (rey0) obj;
            case 8:
                return (rey0) obj;
            case 9:
                return (ljm0) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (js20) obj;
            case 12:
                return (ljm0) obj;
            case 13:
                return (ljm0) obj;
            default:
                return (js20) obj;
        }
    }

    public smp0(bqk0 bqk0Var, hg7 hg7Var) {
        this.a = (byte) 8;
        this.c = bqk0Var;
        this.d = hg7Var;
        this.f = n3o1.q(this).a(new z821(this, (byte) 14), v451.b);
        this.e = new rey0(new u451(this, (byte) 0));
        j2i j2iVar = yej.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(Function0 function0, Function0 function1) {
        this.a = (byte) 3;
        this.c = function0;
        this.d = function1;
        this.e = k1o1.p();
        this.f = n3o1.q(this).a(new x3o0(this, (byte) 21), f2s0.S0);
        j2i j2iVar = new j2i(-457949972, new t9r0(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.a = (byte) 7;
        this.c = ynb0Var;
        this.d = ynb0Var2;
        this.e = new rey0(new lw11(this, (byte) 20));
        this.f = n3o1.q(this).a(new z821(this, (byte) 10), vs31.c);
        j2i j2iVar = new j2i(2029601438, new hg31(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(n3v n3vVar, lut0 lut0Var, ywp ywpVar, yna0 yna0Var) {
        this.a = (byte) 4;
        this.c = n3vVar;
        this.d = lut0Var;
        this.e = yna0Var;
        this.f = x3p1.n(new n5u0(this, (byte) 1), hxt0.Y, new t1t0(this, (byte) 12), (o8n) null, (iu30) null, 24);
        this.b = new rzj(new t0r0(0, ywpVar, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), (byte) 6);
    }

    public smp0(yqg yqgVar, ypg0 ypg0Var) {
        this.a = (byte) 6;
        this.c = yqgVar;
        this.d = ypg0Var;
        this.e = k1o1.p();
        this.f = new eih1();
        j2i j2iVar = new j2i(2014946924, new zyy0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(agc0 agc0Var, drp0 drp0Var) {
        this.a = (byte) 14;
        this.c = drp0Var;
        sru sruVar = new sru(h1v.a, (String) null, (String) null, (String) null, 14);
        this.d = sruVar;
        this.e = x3p1.m(new huz(sruVar, (byte) 10), new qyh1(this, (byte) 0), lbg1.b1, (o8n) null, new qyh1(this, (byte) 1), 8);
        this.f = n3o1.q(this).a(new zbb1(this, (byte) 9), ruh1.e);
        j2i j2iVar = gpj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(usq usqVar, oud oudVar) {
        this.a = (byte) 12;
        this.c = usqVar;
        this.d = oudVar;
        this.e = h7w.B(d6d1.g, null, null, new nsb1(this, (byte) 8), 6);
        this.f = new eih1();
        j2i j2iVar = new j2i(-1080813938, new vsb1(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(vu60 vu60Var, pjp pjpVar, lbl0 lbl0Var) {
        this.a = (byte) 2;
        this.c = pjpVar;
        this.d = lbl0Var;
        this.e = x3p1.m(new xr0(d5p1.h(vu60Var.e), (byte) 27), egs0.g, w0q0.W0, (o8n) null, (iu30) null, 24);
        this.f = new eih1();
        j2i j2iVar = new j2i(2013396956, new t9r0(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(q8n q8nVar, bo71 bo71Var, m771 m771Var) {
        this.a = (byte) 0;
        this.c = bo71Var;
        this.d = m771Var;
        mmp0 mmp0Var = mmp0.c;
        j2i j2iVar = new j2i(-1551354734, new sw1(this, (byte) 26), true);
        xas xasVar = new xas();
        xasVar.a(mmp0.d, ofo0.V0);
        this.e = new ljm0(xasVar, mmp0Var, q8nVar, j2iVar);
        this.f = n3o1.q(this).a(n3o0.e1, rmp0.b);
        j2i j2iVar2 = p4j.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar2, (byte) 0);
    }

    public smp0(hyl0 hyl0Var, cfd cfdVar) {
        this.a = (byte) 10;
        this.c = hyl0Var;
        this.d = cfdVar;
        this.e = k1o1.p();
        this.f = n3o1.q(this).a(new cq61(this, (byte) 3), vy61.e);
        j2i j2iVar = new j2i(367766508, new hg31(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(wce1 wce1Var, ede1 ede1Var) {
        this.a = (byte) 13;
        this.c = wce1Var;
        this.d = ede1Var;
        this.e = h7w.B(vxd1.a1, null, null, new nsb1(this, (byte) 13), 6);
        this.f = new eih1();
        j2i j2iVar = ymj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(lzn0 lzn0Var, cxp cxpVar) {
        this.a = (byte) 1;
        this.c = lzn0Var;
        this.d = cxpVar;
        this.e = new rey0(new qsn0(this, (byte) 22));
        this.f = new eih1();
        j2i j2iVar = new j2i(1974377523, new aso0(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(d0r d0rVar, xcq xcqVar) {
        this.a = (byte) 9;
        this.c = d0rVar;
        this.d = xcqVar;
        this.e = h7w.B(s861.b, null, null, vp51.R0, 6);
        this.f = new eih1();
        j2i j2iVar = new j2i(1117827643, new hg31(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public smp0(j5h1 j5h1Var, s8w0 s8w0Var) {
        this.a = (byte) 5;
        this.c = j5h1Var;
        this.d = s8w0Var;
        this.e = z0o1.k(j5h1Var.m, vbv0.c1, new mwv0(this, (byte) 4), 4);
        this.f = n3o1.r(this).c(nzv0.e, nzv0.f);
        j2i j2iVar = new j2i(813090048, new qsu0(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }
}
