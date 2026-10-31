package p;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yvq0 implements pwn0, ywn0, rsn0 {
    public final dg30 a;
    public final twn0 b;
    public final ccs c;
    public final yun0 d;
    public final awq0 e;
    public final czn0 f;
    public final jhs0 g;
    public final fvn0 h;
    public final syn0 i;
    public final th30 j;

    public yvq0(dg30 dg30Var, twn0 twn0Var, ccs ccsVar, yun0 yun0Var, awq0 awq0Var, czn0 czn0Var, jhs0 jhs0Var, fvn0 fvn0Var, syn0 syn0Var) {
        this.a = dg30Var;
        this.b = twn0Var;
        this.c = ccsVar;
        this.d = yun0Var;
        this.e = awq0Var;
        this.f = czn0Var;
        this.g = jhs0Var;
        this.h = fvn0Var;
        this.i = syn0Var;
        this.j = dg30Var.e0();
    }

    public final void a() {
        xwn0.d(this.b.d, true, new pdp0(this, (byte) 28));
    }

    public final void b(b3i1 b3i1Var) {
        k(new wvq0(b3i1Var, (byte) 0));
    }

    public final void c() {
        zf30 zf30Var;
        yun0 yun0Var = this.d;
        fvn0 fvn0Var = this.h;
        uyn0 uyn0Var = uyn0.a;
        syn0 syn0Var = this.i;
        son0 son0VarA = syn0Var.a(uyn0Var);
        try {
            xun0 xun0VarH = yun0Var.h();
            pnr0 pnr0VarD = fvn0Var.d(xun0VarH != null ? xun0VarH.b() : null);
            lwq0.b(this.e.a().e);
            yun0Var.b(yun0Var.m());
            yun0Var.o((xun0) null);
            fvn0Var.f(pnr0VarD);
            xun0 xun0VarH2 = yun0Var.h();
            vun0 vun0Var = xun0VarH2 instanceof vun0 ? (vun0) xun0VarH2 : null;
            if (vun0Var != null && (zf30Var = vun0Var.a) != null) {
                fvn0Var.a(zf30Var, 1, false);
            }
        } finally {
            syn0Var.e(son0VarA);
        }
    }

    public final void d(blc0 blc0Var) {
        k(new cnp0(blc0Var, (byte) 29));
    }

    public final void e(String str, String str2, String str3, ee5 ee5Var, zf30 zf30Var, e6w0 e6w0Var, boolean z) {
        xg30 xg30Var = new xg30(n(str, zf30Var), str2, str3, e6w0Var, ee5Var);
        if (e6w0Var instanceof c6w0) {
            Class<?> cls = zf30Var.getClass();
            Bundle bundle = zf30Var.f;
            if (bundle == null) {
                bundle = new Bundle();
            }
            m(new pwq0(cls, bundle, xg30Var));
            return;
        }
        if (e6w0Var instanceof b6w0) {
            Class<?> cls2 = zf30Var.getClass();
            Bundle bundle2 = zf30Var.f;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m(new owq0(cls2, bundle2, xg30Var));
            return;
        }
        yyn0 yyn0Var = yyn0.a;
        syn0 syn0Var = this.i;
        son0 son0VarA = syn0Var.a(yyn0Var);
        try {
            l(str, str2, str3, ee5Var, zf30Var, e6w0Var, z);
        } finally {
            syn0Var.e(son0VarA);
        }
    }

    public final void f() {
        zf30 zf30Var;
        yun0 yun0Var = this.d;
        fvn0 fvn0Var = this.h;
        awq0 awq0Var = this.e;
        if (!awq0Var.b() || ((Collection) awq0Var.a().c.getValue()).isEmpty()) {
            this.b.f();
            return;
        }
        xyn0 xyn0Var = xyn0.a;
        syn0 syn0Var = this.i;
        son0 son0VarA = syn0Var.a(xyn0Var);
        try {
            czn0 czn0Var = this.f;
            xxn0 xxn0VarC = yun0Var.c();
            List list = (List) awq0Var.a().c.getValue();
            xvq0 xvq0Var = xvq0.a;
            czn0Var.getClass();
            zig1 zig1VarA = czn0.a(xxn0VarC, list, xvq0Var);
            xun0 xun0VarH = yun0Var.h();
            pnr0 pnr0VarD = fvn0Var.d(xun0VarH != null ? xun0VarH.b() : null);
            if (zig1VarA.a == 4) {
                yun0Var.b(yun0Var.m());
                yun0Var.o((xun0) null);
            }
            lwq0.a(awq0Var.a().e);
            fvn0Var.f(pnr0VarD);
            xun0 xun0VarH2 = yun0Var.h();
            vun0 vun0Var = xun0VarH2 instanceof vun0 ? (vun0) xun0VarH2 : null;
            if (vun0Var != null && (zf30Var = vun0Var.a) != null) {
                fvn0Var.a(zf30Var, 1, false);
            }
        } finally {
            syn0Var.e(son0VarA);
        }
    }

    public final boolean g() {
        return j() || this.d.h() != null;
    }

    public final void h(zf30 zf30Var, String str, String str2, String str3, boolean z, e6w0 e6w0Var) {
        xg30 xg30Var = new xg30(n(str, zf30Var), str2, str3, e6w0Var, (ee5) null);
        boolean z2 = e6w0Var instanceof c6w0;
        awq0 awq0Var = this.e;
        azn0 azn0Var = azn0.a;
        syn0 syn0Var = this.i;
        if (z2) {
            Class<?> cls = zf30Var.getClass();
            Bundle bundle = zf30Var.f;
            if (bundle == null) {
                bundle = new Bundle();
            }
            pwq0 pwq0Var = new pwq0(cls, bundle, xg30Var);
            son0 son0VarA = syn0Var.a(azn0Var);
            try {
                lwq0.c(awq0Var.a().e, pwq0Var);
                return;
            } finally {
                syn0Var.e(son0VarA);
            }
        }
        if (!(e6w0Var instanceof b6w0)) {
            this.b.h(zf30Var, n(str, zf30Var), str2, str3, z, e6w0Var);
            return;
        }
        Class<?> cls2 = zf30Var.getClass();
        Bundle bundle2 = zf30Var.f;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        owq0 owq0Var = new owq0(cls2, bundle2, xg30Var);
        son0 son0VarA2 = syn0Var.a(azn0Var);
        try {
            lwq0.c(awq0Var.a().e, owq0Var);
        } finally {
            syn0Var.e(son0VarA2);
        }
    }

    public final void i(String str, zf30 zf30Var, String str2, String str3, String str4, boolean z, e6w0 e6w0Var) {
        this.b.i(str, zf30Var, str2, str3, str4, z, e6w0Var);
    }

    public final boolean j() {
        awq0 awq0Var = this.e;
        boolean zB = awq0Var.b();
        ccs ccsVar = this.c;
        if (zB) {
            return !((Collection) awq0Var.a().c.getValue()).isEmpty() || ccsVar.j();
        }
        return ccsVar.j();
    }

    public final void k(iu30 iu30Var) {
        mwq0 mwq0VarA = this.e.a();
        mdt mdtVar = mwq0VarA.c;
        boolean zIsEmpty = ((Collection) mdtVar.getValue()).isEmpty();
        lwq0 lwq0Var = mwq0VarA.e;
        wck0 wck0Var = new wck0(iu30Var, (byte) 23);
        p9m p9mVar = smg1.a;
        mwq0 mwq0Var = lwq0Var.a;
        mwq0Var.d = p9mVar;
        bw91 bw91Var = mwq0Var.b;
        bw91Var.size();
        r7h.a0(bw91Var, new wvq0(wck0Var, (byte) 2));
        bw91Var.size();
        if (zIsEmpty || !((c380) mdtVar.getValue()).isEmpty()) {
            return;
        }
        yun0 yun0Var = this.d;
        yun0Var.b(yun0Var.m());
        yun0Var.o((xun0) null);
    }

    public final void l(String str, String str2, String str3, ee5 ee5Var, zf30 zf30Var, e6w0 e6w0Var, boolean z) {
        View view;
        knn0 knn0VarO;
        knn0 knn0Var;
        xg30 xg30VarA;
        xg30 xg30VarA2;
        twn0 twn0Var = this.b;
        twn0Var.t();
        kx70 kx70Var = new kx70(this, zf30Var, str, str2, str3, e6w0Var, ee5Var, (byte) 17);
        th30 th30Var = this.j;
        nu9 nu9Var = new nu9(th30Var);
        if (z) {
            yun0 yun0Var = this.d;
            xun0 xun0VarH = yun0Var.h();
            if (!(((xun0VarH == null || (xg30VarA2 = xun0VarH.a()) == null) ? null : xg30VarA2.d) instanceof d6w0)) {
                twn0Var.m(nu9Var, htn0.d);
            }
            xun0 xun0VarM = yun0Var.m();
            if (!(((xun0VarM == null || (xg30VarA = xun0VarM.a()) == null) ? null : xg30VarA.d) instanceof d6w0)) {
                twn0Var.n(nu9Var, htn0.f);
            }
            yun0Var.b((xun0) null);
            yun0Var.o((xun0) null);
            yun0Var.i().clear();
            yun0Var.l().clear();
            awq0 awq0Var = this.e;
            if (awq0Var.b()) {
                lwq0.b(awq0Var.a().e);
            }
        }
        twn0.r(twn0Var, nu9Var, ee5Var, false, e6w0Var, 2);
        twn0Var.o(nu9Var, zf30Var, e6w0Var);
        twn0Var.b.f(nu9Var, e6w0Var, twn0Var.k, twn0Var.f);
        twn0Var.c(nu9Var, zf30Var, e6w0Var, str3);
        nu9Var.f();
        th30Var.D();
        kx70Var.invoke();
        fvn0 fvn0Var = this.h;
        if (!fvn0Var.c.d() || (view = zf30Var.j1) == null || (knn0VarO = jon1.o(view)) == null) {
            return;
        }
        if (!(zf30Var instanceof gq80)) {
            fvn0Var.b(zf30Var, knn0VarO, fvn0Var.e(knn0VarO));
            return;
        }
        onr0 onr0VarE = fvn0Var.e(knn0VarO);
        IdentityHashMap identityHashMap = fvn0Var.e;
        IdentityHashMap identityHashMap2 = fvn0Var.d;
        if (onr0VarE != null && (knn0Var = (knn0) fvn0Var.f.remove(onr0VarE)) != null) {
            faa0 faa0Var = (faa0) identityHashMap2.remove(knn0Var);
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            identityHashMap.remove(knn0Var);
        }
        faa0 faa0Var2 = (faa0) identityHashMap2.remove(knn0VarO);
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
        }
        identityHashMap.remove(knn0VarO);
    }

    public final void m(qwq0 qwq0Var) {
        awq0 awq0Var = this.e;
        if (!awq0Var.b()) {
            this.g.a.add(qwq0Var);
            return;
        }
        qwq0 qwq0Var2 = (qwq0) o7h.C0((List) awq0Var.a().c.getValue());
        xg30 xg30VarE = qwq0Var2 != null ? rwq0.E(qwq0Var2) : null;
        e6w0 e6w0Var = xg30VarE != null ? xg30VarE.d : null;
        e6w0 e6w0Var2 = rwq0.E(qwq0Var).d;
        d6w0 d6w0Var = e6w0Var2 instanceof d6w0 ? (d6w0) e6w0Var2 : null;
        boolean z = false;
        if (!(e6w0Var instanceof d6w0) ? (e6w0Var instanceof a6w0) : !(!((d6w0) e6w0Var).a || d6w0Var == null || !d6w0Var.a)) {
            z = true;
        }
        zyn0 zyn0Var = zyn0.a;
        syn0 syn0Var = this.i;
        son0 son0VarA = syn0Var.a(zyn0Var);
        try {
            lwq0 lwq0Var = awq0Var.a().e;
            if (xg30VarE == null || z) {
                lwq0.d(lwq0Var, qwq0Var);
            } else {
                lwq0.b(lwq0Var);
                lwq0.d(lwq0Var, qwq0Var);
            }
        } finally {
            syn0Var.e(son0VarA);
        }
    }

    public final String n(String str, zf30 zf30Var) {
        if (str != null) {
            return str;
        }
        ug30 ug30Var = zf30Var instanceof ug30 ? (ug30) zf30Var : null;
        if (ug30Var != null) {
            return ug30Var.A(this.a);
        }
        return null;
    }
}
