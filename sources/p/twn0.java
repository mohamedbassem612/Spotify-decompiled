package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class twn0 implements pwn0, a761 {
    public final dg30 a;
    public final yun0 b;
    public final b4n0 c;
    public final xwn0 d;
    public final hds e;
    public final akr f;
    public final qwn0 g;
    public final axn0 h;
    public final fvn0 i;
    public final syn0 j;
    public final th30 k;

    public twn0(dg30 dg30Var, yun0 yun0Var, b4n0 b4n0Var, xwn0 xwn0Var, hds hdsVar, akr akrVar, qwn0 qwn0Var, axn0 axn0Var, fvn0 fvn0Var, syn0 syn0Var) {
        this.a = dg30Var;
        this.b = yun0Var;
        this.c = b4n0Var;
        this.d = xwn0Var;
        this.e = hdsVar;
        this.f = akrVar;
        this.g = qwn0Var;
        this.h = axn0Var;
        this.i = fvn0Var;
        this.j = syn0Var;
        this.k = dg30Var.e0();
    }

    public static void q(twn0 twn0Var, boolean z, Function0 function0, int i) {
        boolean z2 = (i & 1) == 0;
        if ((i & 2) != 0) {
            z = false;
        }
        twn0Var.d.c(new xt7(z, twn0Var, (byte) 7), function0, z2);
    }

    public static void r(twn0 twn0Var, nu9 nu9Var, ee5 ee5Var, boolean z, e6w0 e6w0Var, int i) {
        if ((i & 1) != 0) {
            ee5Var = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            e6w0Var = null;
        }
        if (twn0Var.c.c() && (e6w0Var instanceof c6w0)) {
            hd5 hd5Var = ((c6w0) e6w0Var).d;
            nu9Var.o(hd5Var.a(), hd5Var.b(), 0, 0);
        } else if (ee5Var != null && ee5Var.a) {
            nu9Var.o(ee5Var.d, 0, 0, 0);
        } else if (z) {
            nu9Var.o(2130772008, 0, 0, 0);
        }
    }

    @Override // p.pwn0
    public final void a() {
        q(this, false, new swn0(this, (byte) 0), 2);
    }

    public final void c(nu9 nu9Var, zf30 zf30Var, e6w0 e6w0Var, String str) {
        if (zf30Var.q0()) {
            return;
        }
        nu9Var.k(e6w0Var instanceof d6w0 ? 2131428960 : 2131428950, zf30Var, str, 1);
    }

    public final void d() {
        if (!this.d.b()) {
            eg.m("Immediate clear requires an active navigation operation");
            return;
        }
        yun0 yun0Var = this.b;
        yun0Var.i().clear();
        yun0Var.l().clear();
    }

    @Override // p.pwn0
    public final void e(String str, String str2, String str3, ee5 ee5Var, zf30 zf30Var, e6w0 e6w0Var, boolean z) {
        q(this, e6w0Var == null || e6w0Var.equals(a6w0.a), new lp60(e6w0Var, this, zf30Var, str, str2, str3, z, ee5Var), 1);
    }

    @Override // p.pwn0
    public final void f() {
        q(this, false, new swn0(this, (byte) 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    public final void g() {
        boolean z;
        xg30 xg30VarA;
        xg30 xg30VarA2;
        yun0 yun0Var = this.b;
        xun0 xun0VarH = yun0Var.h();
        e6w0 e6w0Var = null;
        this.g.b.m((xun0VarH == null || (xg30VarA2 = xun0VarH.a()) == null) ? null : xg30VarA2.a);
        yun0Var.k();
        this.e.a();
        axn0 axn0Var = this.h;
        BehaviorSubject behaviorSubject = axn0Var.b;
        yun0 yun0Var2 = axn0Var.a;
        if (yun0Var2.l().isEmpty()) {
            xun0 xun0VarH2 = yun0Var2.h();
            if (xun0VarH2 != null && (xg30VarA = xun0VarH2.a()) != null) {
                e6w0Var = xg30VarA.d;
            }
            if (e6w0Var instanceof d6w0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        behaviorSubject.onNext(Boolean.valueOf(z));
    }

    @Override // p.pwn0
    public final void h(zf30 zf30Var, String str, String str2, String str3, boolean z, e6w0 e6w0Var) {
        q(this, false, new wg6(this, zf30Var, str, str2, str3, z, e6w0Var), 3);
    }

    @Override // p.pwn0
    public final void i(String str, zf30 zf30Var, String str2, String str3, String str4, boolean z, e6w0 e6w0Var) {
        q(this, false, new lp60(str, this, zf30Var, str2, str3, str4, z, e6w0Var), 3);
    }

    public final void j() {
        q(this, false, new swn0(this, (byte) 1), 2);
    }

    public final void k() {
        twn0 twn0Var;
        xg30 xg30VarA;
        xg30 xg30VarA2;
        xg30 xg30VarA3;
        xg30 xg30VarA4;
        th30 th30Var = this.k;
        boolean zU = th30Var.U();
        yun0 yun0Var = this.b;
        boolean z = (yun0Var.i().isEmpty() && yun0Var.l().isEmpty() && yun0Var.h() == null) ? false : true;
        xun0 xun0VarH = yun0Var.h();
        boolean z2 = ((xun0VarH == null || (xg30VarA4 = xun0VarH.a()) == null) ? null : xg30VarA4.d) instanceof b6w0;
        akr akrVar = this.f;
        boolean zC = z2 ? akrVar.c() : true;
        if (!zU && z && zC) {
            xun0 xun0VarH2 = yun0Var.h();
            e6w0 e6w0Var = (xun0VarH2 == null || (xg30VarA3 = xun0VarH2.a()) == null) ? null : xg30VarA3.d;
            xun0 xun0VarH3 = yun0Var.h();
            pnr0 pnr0VarD = this.i.d(xun0VarH3 != null ? xun0VarH3.b() : null);
            n0g0 n0g0Var = fsm0.R0;
            nu9 nu9Var = new nu9(th30Var);
            xun0 xun0VarH4 = yun0Var.h();
            if (((xun0VarH4 == null || (xg30VarA2 = xun0VarH4.a()) == null) ? null : xg30VarA2.d) instanceof b6w0) {
                twn0Var = this;
            } else {
                xun0 xun0VarH5 = yun0Var.h();
                twn0Var = this;
                r(twn0Var, nu9Var, null, false, (xun0VarH5 == null || (xg30VarA = xun0VarH5.a()) == null) ? null : xg30VarA.d, 3);
            }
            yun0Var.j(nu9Var, false, akrVar, th30Var);
            xun0 xun0VarH6 = yun0Var.h();
            vun0 vun0Var = xun0VarH6 instanceof vun0 ? (vun0) xun0VarH6 : null;
            if (vun0Var != null) {
                zf30 zf30Var = vun0Var.a;
                xg30 xg30Var = vun0Var.b;
                e6w0 e6w0Var2 = xg30Var.d;
                boolean z3 = e6w0Var2 instanceof b6w0;
                String str = xg30Var.c;
                if (z3) {
                    akrVar.h(zf30Var, str, new n0g0(twn0Var, (byte) 19), new n0g0(twn0Var, (byte) 20));
                } else {
                    twn0Var.c(nu9Var, zf30Var, e6w0Var2, str);
                    n0g0Var = new n0g0(twn0Var, (byte) 21);
                }
            }
            nu9Var.h();
            n0g0Var.invoke();
            twn0Var.s(e6w0Var, pnr0VarD);
        }
    }

    public final void l(zf30 zf30Var, String str, String str2, String str3, boolean z, ee5 ee5Var, e6w0 e6w0Var, Function0 function0) {
        Function0 function1;
        th30 th30Var = this.k;
        if (th30Var.L) {
            return;
        }
        t();
        Function0 kx70Var = new kx70(this, zf30Var, str, str2, str3, e6w0Var, ee5Var, (byte) 2);
        nu9 nu9Var = new nu9(th30Var);
        yun0 yun0Var = this.b;
        if (z) {
            m(nu9Var, htn0.e);
            n(nu9Var, htn0.g);
            yun0Var.i().clear();
            yun0Var.l().clear();
        }
        boolean z2 = e6w0Var instanceof b6w0;
        akr akrVar = this.f;
        if (z2) {
            Function0 function2 = fsm0.T0;
            s2n0 s2n0Var = new s2n0(kx70Var, function0, (byte) 16);
            yun0Var.f(nu9Var, e6w0Var, th30Var, akrVar);
            akrVar.h(zf30Var, str3, new n0g0(this, (byte) 18), s2n0Var);
            function1 = function2;
        } else {
            r(this, nu9Var, ee5Var, false, e6w0Var, 2);
            o(nu9Var, zf30Var, e6w0Var);
            yun0Var.f(nu9Var, e6w0Var, th30Var, akrVar);
            c(nu9Var, zf30Var, e6w0Var, str3);
            function1 = kx70Var;
        }
        nu9Var.h();
        function1.invoke();
    }

    public final void m(nu9 nu9Var, iu30 iu30Var) {
        xun0 xun0VarH = this.b.h();
        if (xun0VarH != null) {
            if (xun0VarH.a().d instanceof b6w0) {
                n0g0 n0g0Var = new n0g0(this.f, (byte) 22);
                iu30Var.invoke(xun0VarH);
                n0g0Var.invoke();
                u(null);
                return;
            }
            zf30 zf30VarB = xun0VarH.b();
            if (zf30VarB == null || !zf30VarB.q0()) {
                return;
            }
            avn0 avn0Var = new avn0(nu9Var, xun0VarH, (byte) 2);
            iu30Var.invoke(xun0VarH);
            avn0Var.invoke();
            u(null);
        }
    }

    public final void n(nu9 nu9Var, iu30 iu30Var) {
        yun0 yun0Var = this.b;
        xun0 xun0VarM = yun0Var.m();
        if (xun0VarM != null) {
            if (xun0VarM.a().d instanceof b6w0) {
                n0g0 n0g0Var = new n0g0(this.f, (byte) 23);
                iu30Var.invoke(xun0VarM);
                n0g0Var.invoke();
                yun0Var.o(null);
                return;
            }
            zf30 zf30VarB = xun0VarM.b();
            if (zf30VarB == null || !zf30VarB.q0()) {
                return;
            }
            avn0 avn0Var = new avn0(nu9Var, xun0VarM, (byte) 3);
            iu30Var.invoke(xun0VarM);
            avn0Var.invoke();
            yun0Var.o(null);
        }
    }

    public final void o(nu9 nu9Var, zf30 zf30Var, e6w0 e6w0Var) {
        if (this.d.a() != 2) {
            return;
        }
        int i = e6w0Var instanceof d6w0 ? 2131428960 : 2131428950;
        yun0 yun0Var = this.b;
        xun0 xun0VarH = yun0Var.h();
        zf30 zf30VarB = xun0VarH != null ? xun0VarH.b() : null;
        xun0 xun0VarM = yun0Var.m();
        zf30 zf30VarB2 = xun0VarM != null ? xun0VarM.b() : null;
        List listU = this.k.c.u();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            zf30 zf30Var2 = (zf30) obj;
            if (zf30Var2.q0() && zf30Var2.Y0 == i && zf30Var2 != zf30Var && zf30Var2 != zf30VarB && zf30Var2 != zf30VarB2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nu9Var.m((zf30) it.next());
        }
    }

    public final void p(zf30 zf30Var, String str, String str2, String str3, boolean z, e6w0 e6w0Var) {
        String str4;
        nu9 nu9Var = new nu9(this.k);
        r(this, nu9Var, null, z, null, 5);
        m(nu9Var, htn0.e);
        c(nu9Var, zf30Var, e6w0Var, null);
        nu9Var.h();
        if (str != null) {
            str4 = str;
        } else {
            ug30 ug30Var = zf30Var instanceof ug30 ? (ug30) zf30Var : null;
            if (ug30Var != null) {
                str = ug30Var.A(this.a);
                str4 = str;
            } else {
                str4 = null;
            }
        }
        u(new vun0(zf30Var, new xg30(str4, str2, str3, e6w0Var, null)));
        this.b.k();
        this.e.a();
        this.i.a(zf30Var, e6w0Var instanceof d6w0 ? 5 : 1, false);
    }

    public final void s(e6w0 e6w0Var, pnr0 pnr0Var) {
        zf30 zf30Var;
        boolean z = e6w0Var instanceof d6w0;
        fvn0 fvn0Var = this.i;
        if (z) {
            fvn0Var.f(pnr0Var);
        }
        xun0 xun0VarH = this.b.h();
        vun0 vun0Var = xun0VarH instanceof vun0 ? (vun0) xun0VarH : null;
        if (vun0Var == null || (zf30Var = vun0Var.a) == null) {
            return;
        }
        int i = vun0Var.b.d instanceof d6w0 ? 5 : 1;
        if (z && i == 1) {
            fvn0Var.a(zf30Var, i, true);
        } else {
            fvn0Var.a(zf30Var, i, false);
        }
    }

    public final void t() {
        yun0 yun0Var = this.b;
        if (yun0Var.i().size() >= 30) {
            yun0Var.i().removeLast();
        }
        if (yun0Var.l().size() >= 30) {
            yun0Var.l().removeLast();
        }
    }

    public final void u(vun0 vun0Var) {
        xg30 xg30VarA;
        yun0 yun0Var = this.b;
        yun0Var.b(vun0Var);
        xun0 xun0VarH = yun0Var.h();
        this.g.b.m((xun0VarH == null || (xg30VarA = xun0VarH.a()) == null) ? null : xg30VarA.a);
    }
}
