package p;

import android.content.Context;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yup0 implements xpw, cvl1, avl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public yup0(owf1 owf1Var, nn4 nn4Var) {
        this.a = (byte) 13;
        this.c = owf1Var;
        this.d = nn4Var;
        vwj1 vwj1Var = (vwj1) owf1Var.b;
        any anyVarN = f5p1.n(vwj1Var.a);
        o6x o6xVar = o6x.a;
        Observable observableI = yoi1.i(anyVarN, o6xVar);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        Flowable flowableH = Flowable.h(observableI.toFlowable(backpressureStrategy).J(djx0.W0), yoi1.i(vwj1Var.b, o6xVar).toFlowable(backpressureStrategy).J(w1x0.b1), e2x0.X0);
        flowableH.getClass();
        this.e = d4o1.g(flowableH.t(Functions.a), new fwj1(this, (byte) 0), new muh1((Object) this, (byte) 24), new fwj1(this, (byte) 1), 8);
        j2i j2iVar = sqj.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(k3j1.a1, new zbb1(this, (byte) 13));
    }

    public static String f(uv41 uv41Var) {
        return cfm0.i("spotify:internal:parental-control:manage-blocked-content:search:", uv41Var.a, nik1.S5).a;
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (ia00) obj2;
            case 1:
                return (ia00) obj2;
            case 2:
                return (ia00) obj2;
            case 3:
                return (ia00) obj2;
            case 4:
                return (ia00) obj2;
            case 5:
                return (eih1) obj;
            case 6:
                return (ia00) obj2;
            case 7:
                return (ia00) obj2;
            case 8:
                return (hy00) obj;
            case 9:
                return (ia00) obj2;
            case 10:
                return (eih1) obj2;
            case 11:
                return (ia00) obj2;
            case 12:
                return (ia00) obj2;
            default:
                return (ia00) obj2;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return (avp0) obj2;
            case 1:
                return (psw) obj2;
            case 2:
                return (psw) obj2;
            case 3:
                return (psw) obj2;
            case 4:
                j2i j2iVar = o9j.a;
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 5:
                return (psw) obj;
            case 6:
                return (psw) obj2;
            case 7:
                return (psw) obj2;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj2;
            case 10:
                return (psw) obj2;
            case 11:
                return (psw) obj2;
            case 12:
                return (psw) obj2;
            default:
                return (psw) obj2;
        }
    }

    public void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-857509528);
        int i2 = i | (b0kVar3.i(qim0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(b0kVar3).a.a.c();
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            cwl1.b(anm1.N("pip_setting_element_os_warning_info_box", dug.f(qim0Var, jC, er31.b(16.0f))), (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1219614751, new oa5(function0, (byte) 18), b0kVar3), b0kVar2, 0, 48, 2030);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(this, qim0Var, function0, i, (byte) 8);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return (poy0) obj;
            case 1:
                return (js20) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (js20) obj;
            case 4:
                return (k8d1) this.f;
            case 5:
                return (js20) obj;
            case 6:
                return (js20) obj;
            case 7:
                return (rey0) obj;
            case 8:
                return (rey0) obj;
            case 9:
                return (rey0) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (rey0) obj;
            case 12:
                return (js20) obj;
            default:
                return (poy0) obj;
        }
    }

    public yup0(xvv0 xvv0Var, pyh1 pyh1Var, rol0 rol0Var) {
        this.a = (byte) 4;
        this.c = xvv0Var;
        this.d = pyh1Var;
        this.e = rol0Var;
        this.f = k1o1.u(new yyg(this, (lnm) null, (byte) 3));
        this.b = n3o1.q(this).a(new ixt0(this, (byte) 9), gou0.d1);
    }

    public yup0(lzn0 lzn0Var, m3n m3nVar) {
        this.a = (byte) 9;
        this.c = lzn0Var;
        this.d = m3nVar;
        this.e = new rey0(new k681(this, (byte) 0));
        this.b = n3o1.q(this).a(vy61.d1, vy61.e1);
        j2i j2iVar = qhj.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(l6s l6sVar, vu60 vu60Var) {
        this.a = (byte) 2;
        this.c = l6sVar;
        this.d = vu60Var;
        this.e = x3p1.n(new lms0(this, (byte) 0), egs0.Y, w0q0.b1, (o8n) null, new lms0(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(f2s0.i, f2s0.t);
        j2i j2iVar = c7j.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(btf1 btf1Var, wml wmlVar) {
        this.a = (byte) 5;
        bhh1 bhh1Var = igu.b;
        this.c = btf1Var;
        this.d = wmlVar;
        this.e = x3p1.n(new fbz0(this, (byte) 16), gkz0.Y0, atz0.d, bhh1Var, (iu30) null, 16);
        j2i j2iVar = ibj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.f = new eih1();
    }

    public yup0(los losVar, ck20 ck20Var) {
        this.a = (byte) 11;
        this.c = losVar;
        this.d = ck20Var;
        this.e = k1o1.p();
        this.b = n3o1.q(this).a(i6d1.P0, i6d1.Q0);
        j2i j2iVar = new j2i(-34472146, new vsb1(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(irp irpVar, q4h0 q4h0Var) {
        this.a = (byte) 10;
        this.c = irpVar;
        this.d = q4h0Var;
        this.e = new rey0(new bxb1(this, (byte) 13));
        this.b = new eih1();
        j2i j2iVar = new j2i(-1708371904, new vsb1(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(String str, lzn0 lzn0Var, ktv ktvVar) {
        this.a = (byte) 8;
        this.c = lzn0Var;
        this.d = ktv.d(str);
        this.e = new rey0(new u451(this, (byte) 16));
        j2i j2iVar = pgj.b;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.f = n3o1.r(this).c(vp51.b1, new cq61(this, (byte) 1));
    }

    public yup0(ivp0 ivp0Var, cn3 cn3Var, pdp0 pdp0Var, kly0 kly0Var) {
        this.a = (byte) 0;
        this.c = ivp0Var;
        this.d = cn3Var;
        this.e = d4o1.f(new cnp0(this, (byte) 8), mmp0.d1, new nso0(this, (byte) 10), (iu30) null, 24);
        this.b = n3o1.q(this).a(h40.b1, rmp0.t);
        this.f = new avp0(kly0Var, pdp0Var);
    }

    public yup0(Context context, i9i1 i9i1Var) {
        this.a = (byte) 1;
        this.c = context;
        this.d = i9i1Var;
        this.e = x3p1.n(wvr0.Z0, wvr0.a1, e2s0.a, (o8n) null, new wvq0(this, (byte) 24), 8);
        this.b = n3o1.q(this).a(jgq0.e1, f2s0.b);
        j2i j2iVar = new j2i(1311763915, new t9r0(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(lzn0 lzn0Var, h8l0 h8l0Var) {
        this.a = (byte) 7;
        this.c = lzn0Var;
        this.d = h8l0Var;
        this.e = new rey0(new lw11(this, (byte) 26));
        this.b = n3o1.q(this).a(new z821(this, (byte) 12), new aaq0(this, (byte) 20));
        j2i j2iVar = qej.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(yqg yqgVar, r091 r091Var) {
        this.a = (byte) 12;
        this.c = yqgVar;
        this.d = r091Var;
        this.e = z0o1.k(r091Var.g, ggf1.Y, new ibf1(this, (byte) 13), 4);
        this.b = n3o1.q(this).a(vrf1.f, vrf1.g);
        j2i j2iVar = new j2i(2081408826, new y2f1(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(xpw xpwVar, zob1 zob1Var) {
        this.a = (byte) 6;
        this.c = zob1Var;
        this.d = xpwVar;
        this.e = z0o1.j(new ak01(this, (byte) 19), h211.O0, (iu30) null, 12);
        this.b = n3o1.q(this).a(ok11.e, ok11.f);
        j2i j2iVar = new j2i(1957399378, new gl11(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public yup0(gvs0 gvs0Var, ynb0 ynb0Var) {
        this.a = (byte) 3;
        this.c = gvs0Var;
        this.d = ynb0Var;
        this.e = x3p1.n(new k3t0(this, (byte) 0), egs0.Y0, cps0.X0, (o8n) null, new k3t0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(958993552, new t9r0(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(f2s0.Y0, f2s0.Z0);
    }
}
