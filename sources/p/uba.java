package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class uba implements b2r0, kir0 {
    public y6r0 N0;
    public y6r0 O0;
    public final bpb1 X;
    public tba Y;
    public long Z;
    public final z6r0 a;
    public final k8h1 b;
    public final n6h1 c;
    public final yqg d;
    public final r6r0 e;
    public final Set f;
    public final tar0 g;
    public final g6h1 h;
    public final boolean i;
    public int t = 1;

    public uba(n6r0 n6r0Var, qir0 qir0Var, nar0 nar0Var, z6r0 z6r0Var, k8h1 k8h1Var, n6h1 n6h1Var, yqg yqgVar, r6r0 r6r0Var, Set set, tar0 tar0Var, g6h1 g6h1Var, boolean z, u8h1 u8h1Var) {
        this.a = z6r0Var;
        this.b = k8h1Var;
        this.c = n6h1Var;
        this.d = yqgVar;
        this.e = r6r0Var;
        this.f = set;
        this.g = tar0Var;
        this.h = g6h1Var;
        this.i = z;
        this.X = gio1.b(new e6r0(n6r0Var, qir0Var));
        this.Y = new tba(n6r0Var, qir0Var, z6r0.a(), u8h1Var);
        if (tar0Var.d) {
            tar0Var.f = nar0Var;
            if (tar0Var.c && tar0Var.q == null) {
                j0d1 j0d1VarB = guo1.B();
                fns fnsVar = igu.a;
                tar0Var.q = smo1.e(ha71.A(j0d1VarB, pyf0.a.f));
            }
        }
        tar0Var.n = new ps7(this, (byte) 6);
    }

    public static void q(uba ubaVar, y6r0 y6r0Var, n6r0 n6r0Var, qir0 qir0Var, long j, var0 var0Var, List list, u8h1 u8h1Var, int i) {
        ubaVar.X.m(null, new rir0(y6r0Var, n6r0Var, j, qir0Var, var0Var, (i & 32) != 0 ? z6x.a : list, ubaVar.i, (i & 64) != 0 ? ubaVar.Y.d : u8h1Var, 272));
    }

    public final a8r0 B(tba tbaVar) {
        y6r0 y6r0Var = tbaVar.c;
        qir0 qir0Var = tbaVar.b;
        return new a8r0(y6r0Var, qir0Var != null ? qir0Var.a : null, tbaVar.a.path(), Integer.valueOf(this.g.e));
    }

    public final void C(n6r0 n6r0Var, qir0 qir0Var, u8h1 u8h1Var) {
        y6r0 y6r0Var;
        y6r0 y6r0Var2 = this.Y.c;
        y6r0 y6r0VarA = this.N0;
        if (y6r0VarA == null) {
            this.a.getClass();
            y6r0VarA = z6r0.a();
        }
        this.Y = new tba(n6r0Var, qir0Var, y6r0VarA, u8h1Var);
        this.N0 = null;
        if (!y6r0VarA.equals(this.O0) && !y6r0Var2.equals(this.O0) && (y6r0Var = this.O0) != null) {
            this.e.g(y6r0Var);
        }
        this.O0 = y6r0Var2;
    }

    public final tv80 D(tv80 tv80Var, w7h1 w7h1Var) {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.C(w7h1Var.c.c());
        dlg1VarS.s(w7h1Var.c.b());
        r6h1 r6h1VarF = dlg1VarS.f();
        ou80 ou80Var = tv80Var.a;
        return new tv80(ou80Var, tv80Var.b, tv80Var.c, tv80Var.d, tv80Var.e, tv80Var.f, new g6h1(o7h.O0(new d8h1(ou80Var, tv80Var.b, r6h1VarF), this.h.a), null), tv80Var.h, tv80Var.i, tv80Var.t, tv80Var.X, tv80Var.Y);
    }

    public final Set E(Set set, q6h1 q6h1Var) {
        String strC;
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = q6h1Var.c.a().b;
        String strC2 = e8h1.c(u8h1Var != null ? u8h1Var.a().a() : null);
        return (strC2 == null || (strC = e8h1.c(this.Y.d.a().a())) == null || strC2.equals(strC)) ? set : f0o1.e(set, b3h1.b);
    }

    public final Observable a() {
        return yoi1.i(this.X, o6x.a);
    }

    @Override // p.lir0
    public final mir0 c() {
        return nhc.p(this);
    }

    @Override // p.l6h1
    public final j6h1 d(k6h1 k6h1Var) {
        a8r0 a8r0VarB = B(this.Y);
        l7h1 l7h1Var = k6h1Var.a;
        n6h1 n6h1Var = this.c;
        if (((Boolean) n6h1Var.a.invoke()).booleanValue()) {
            n6h1Var.b.f(l7h1Var, null);
            return y2o1.x();
        }
        n6h1Var.f.a(l7h1Var);
        u6h1 u6h1VarA = n6h1Var.e.a();
        y6r0 y6r0Var = a8r0VarB.a;
        String str = a8r0VarB.b;
        if (str == null) {
            str = "";
        }
        return n6h1Var.a(k6h1Var, u6h1.a(u6h1VarA, y6r0Var, null, str, 493));
    }

    @Override // p.i8h1
    public final r480 f(l7h1 l7h1Var, Set set) {
        a8r0 a8r0VarB = B(this.Y);
        Set setF = f0o1.f(E(f0o1.e(set, a3h1.b), l7h1Var), this.f);
        String str = a8r0VarB.b;
        k8h1 k8h1Var = this.b;
        k8h1Var.d.a(l7h1Var);
        u6h1 u6h1VarA = k8h1.a(k8h1Var.b.a(), a8r0VarB);
        String str2 = u6h1VarA.g;
        String str3 = u6h1VarA.f;
        String str4 = u6h1VarA.d;
        boolean z = k8h1Var.g;
        String str5 = u6h1VarA.a;
        y6r0 y6r0Var = a8r0VarB.a;
        String str6 = a8r0VarB.c;
        g6h1 g6h1Var = this.h;
        if (z) {
            return k8h1Var.c(l7h1Var, str5, y6r0Var, str6, str4, str == null ? "" : str, str3, str2, setF, u6h1VarA.h, u6h1VarA.i, g6h1Var);
        }
        return k8h1Var.e(l7h1Var, str5, y6r0Var, str6, str4, str == null ? "" : str, str3, str2, setF, u6h1VarA.h, u6h1VarA.i, g6h1Var);
    }

    @Override // p.i8h1
    public final r480 i(l7h1 l7h1Var) {
        a8r0 a8r0VarB = B(this.Y);
        k8h1 k8h1Var = this.b;
        k8h1Var.d.a(l7h1Var);
        u6h1 u6h1VarA = k8h1.a(k8h1Var.b.a(), a8r0VarB);
        String str = u6h1VarA.a;
        y6r0 y6r0Var = a8r0VarB.a;
        String str2 = a8r0VarB.c;
        String str3 = u6h1VarA.d;
        String str4 = a8r0VarB.b;
        if (str4 == null) {
            str4 = "";
        }
        return k8h1Var.e(l7h1Var, str, y6r0Var, str2, str3, str4, u6h1VarA.f, u6h1VarA.g, null, u6h1VarA.h, u6h1VarA.i, this.h);
    }

    @Override // p.i8h1
    public final tv80 j(w7h1 w7h1Var) {
        a8r0 a8r0VarB = B(this.Y);
        k8h1 k8h1Var = this.b;
        k8h1Var.d.a(w7h1Var);
        u6h1 u6h1VarA = k8h1.a(k8h1Var.b.a(), a8r0VarB);
        String str = u6h1VarA.a;
        y6r0 y6r0Var = a8r0VarB.a;
        String str2 = a8r0VarB.c;
        String str3 = u6h1VarA.d;
        String str4 = a8r0VarB.b;
        if (str4 == null) {
            str4 = "";
        }
        return D(k8h1Var.h(w7h1Var, str, y6r0Var, str2, str3, str4, u6h1VarA.f, u6h1VarA.g, null, null, u6h1VarA.h, u6h1VarA.i, this.h), w7h1Var);
    }

    @Override // p.l6h1
    public final String k(j6h1 j6h1Var) {
        return this.c.k(j6h1Var);
    }

    @Override // p.i8h1
    public final tv80 m(w7h1 w7h1Var, xj61 xj61Var) {
        w7h1 w7h1Var2;
        tv80 tv80VarH;
        g6h1 g6h1Var = this.h;
        boolean zIsEmpty = g6h1Var.a.isEmpty();
        a3h1 a3h1Var = a3h1.b;
        Set setE = E(!zIsEmpty ? f0o1.e(f0o1.e(xj61Var, a3h1Var), t2h1.b) : f0o1.e(xj61Var, a3h1Var), w7h1Var);
        a8r0 a8r0VarB = B(this.Y);
        String str = a8r0VarB.b;
        k8h1 k8h1Var = this.b;
        k8h1Var.d.a(w7h1Var);
        u6h1 u6h1VarA = k8h1.a(k8h1Var.b.a(), a8r0VarB);
        String str2 = u6h1VarA.g;
        String str3 = u6h1VarA.f;
        String str4 = u6h1VarA.d;
        boolean z = k8h1Var.g;
        String str5 = u6h1VarA.a;
        y6r0 y6r0Var = a8r0VarB.a;
        String str6 = a8r0VarB.c;
        if (z) {
            tv80VarH = k8h1Var.d(w7h1Var, str5, y6r0Var, str6, str4, str == null ? "" : str, str3, str2, setE, a8r0VarB.d, u6h1VarA.h, u6h1VarA.i, g6h1Var);
            w7h1Var2 = w7h1Var;
        } else {
            w7h1Var2 = w7h1Var;
            tv80VarH = k8h1Var.h(w7h1Var2, str5, y6r0Var, str6, str4, str == null ? "" : str, str3, str2, setE, a8r0VarB.d, u6h1VarA.h, u6h1VarA.i, g6h1Var);
        }
        return D(tv80VarH, w7h1Var2);
    }

    public final c4p1 o(t480 t480Var, Set set) {
        return this.e.a(t480Var, this.d.b(), f0o1.f(f0o1.e(set, a3h1.b), this.f));
    }

    public final t480 p(l7h1 l7h1Var, Set set) {
        return this.e.d(l7h1Var, B(this.Y), f0o1.f(E(f0o1.e(set, a3h1.b), l7h1Var), this.f), this.h);
    }

    public final void r() {
        tar0 tar0Var = this.g;
        uhs0 uhs0Var = tar0Var.m;
        tar0Var.m = null;
        tar0Var.l = fkj0.d1;
        if (uhs0Var != null) {
            ArrayList arrayList = tar0Var.f84p;
            List listL1 = o7h.l1(arrayList);
            arrayList.clear();
            y6r0 y6r0Var = uhs0Var.a;
            n6r0 n6r0Var = uhs0Var.b;
            qir0 qir0Var = uhs0Var.c;
            long j = uhs0Var.d;
            u8h1 u8h1Var = uhs0Var.e;
            List listX = k4p1.x(qvn0.c);
            this.X.m(null, new rir0(y6r0Var, n6r0Var, j, qir0Var, null, o7h.N0(listX, listL1), this.i, u8h1Var, 272));
        }
    }

    public final void t() {
        tar0 tar0Var = this.g;
        ArrayList arrayList = tar0Var.f84p;
        long jB = this.Z;
        if (jB == 0) {
            jB = this.d.b();
        }
        long j = jB;
        y6r0 y6r0Var = this.Y.c;
        bpb1 bpb1Var = this.X;
        Object value = bpb1Var.getValue();
        rir0 rir0Var = value instanceof rir0 ? (rir0) value : null;
        if (y6r0Var.equals(rir0Var != null ? rir0Var.a : null)) {
            return;
        }
        r();
        tba tbaVar = this.Y;
        y6r0 y6r0Var2 = tbaVar.c;
        n6r0 n6r0Var = tbaVar.a;
        qir0 qir0Var = tbaVar.b;
        u8h1 u8h1Var = tbaVar.d;
        boolean z = tar0Var.d;
        Object obj = qar0.a;
        if (z && tar0Var.c) {
            tar0Var.o = null;
            arrayList.clear();
            n6r0 n6r0Var2 = tar0Var.h;
            if (n6r0Var2 != null && !u890.j(n6r0Var2.path(), n6r0Var.path())) {
                tar0Var.f = null;
            }
            tar0Var.g = y6r0Var2;
            tar0Var.h = n6r0Var;
            tar0Var.i = u8h1Var;
            if (!y6r0Var2.equals(tar0Var.k)) {
                tar0Var.e = 0;
                tar0Var.j = false;
            }
            tar0Var.k = null;
            if (tar0Var.f == null) {
                tar0Var.l = new rar0(y6r0Var2, n6r0Var);
                tar0Var.m = new uhs0(y6r0Var2, n6r0Var, qir0Var, j, u8h1Var);
                obj = par0.a;
            } else {
                tar0Var.s.l(tar0Var.a());
            }
        }
        if (obj instanceof qar0) {
            tba tbaVar2 = this.Y;
            y6r0 y6r0Var3 = tbaVar2.c;
            n6r0 n6r0Var3 = tbaVar2.a;
            qir0 qir0Var2 = tbaVar2.b;
            var0 var0VarA = tar0Var.a();
            List listL1 = o7h.l1(arrayList);
            arrayList.clear();
            q(this, y6r0Var3, n6r0Var3, qir0Var2, j, var0VarA, listL1, null, 64);
        } else if (!(obj instanceof par0)) {
            eg.o();
            return;
        } else {
            tba tbaVar3 = this.Y;
            bpb1Var.m(null, new rir0(tbaVar3.c, tbaVar3.a, j, tbaVar3.b, null, null, this.i, tbaVar3.d, 112));
        }
        this.Z = 0L;
    }

    public final void u() {
        int i = this.t;
        if (i == 2 || i == 3) {
            return;
        }
        this.Z = this.d.b();
        if (this.t == 4 && !this.Y.c.equals(this.N0)) {
            tba tbaVar = this.Y;
            C(tbaVar.a, tbaVar.b, tbaVar.d);
        }
        this.t = 2;
    }

    public final void v(boolean z) {
        int i = this.t;
        if (i == 4 || i == 1) {
            return;
        }
        this.t = 4;
        this.a.getClass();
        this.N0 = z6r0.a();
        tba tbaVar = this.Y;
        this.X.m(null, new e6r0(tbaVar.a, tbaVar.b));
        if (z) {
            return;
        }
        tar0 tar0Var = this.g;
        nsn0 nsn0Var = tar0Var.o;
        if (nsn0Var != null) {
            tar0Var.f84p.add(new uvn0(nsn0Var));
            tar0Var.o = null;
        }
        r();
        y6r0 y6r0Var = this.Y.c;
        yqg yqgVar = tar0Var.b;
        if (tar0Var.d) {
            tar0Var.l = fkj0.d1;
            tar0Var.g = null;
            bjr0 bjr0Var = tar0Var.a;
            String str = y6r0Var.a;
            var0 var0VarA = tar0Var.a();
            bjr0Var.d.l(new ajr0(bjr0Var, str, var0VarA != null ? var0VarA.a.a : 0, yqgVar.b(), yqgVar.g().getID()));
        }
    }

    public final void w(nsn0 nsn0Var) {
        if (this.t != 3) {
            return;
        }
        tar0 tar0Var = this.g;
        ArrayList arrayList = tar0Var.f84p;
        if (tar0Var.d && tar0Var.c && tar0Var.g != null) {
            if (tar0Var.f == null) {
                arrayList.add(new pvn0(nsn0Var));
                return;
            }
            nsn0 nsn0Var2 = tar0Var.o;
            if (nsn0Var2 != null && !nsn0Var2.equals(nsn0Var)) {
                arrayList.add(new vvn0(nsn0Var2));
            } else if (u890.j(nsn0Var2, nsn0Var)) {
                return;
            }
            tar0Var.o = nsn0Var;
        }
    }

    public final void x(Bundle bundle) {
        String string = bundle.getString("PBL:PageInstanceId");
        if (string != null) {
            tba tbaVar = this.Y;
            y6r0.Companion.getClass();
            tba tbaVarA = tba.a(tbaVar, null, new y6r0(string), null, 11);
            this.Y = tbaVarA;
            this.e.e(tbaVarA.c);
        }
        Bundle bundle2 = bundle.getBundle("PBL:PagePresentationState");
        if (bundle2 != null) {
            tba tbaVar2 = this.Y;
            y6r0 y6r0Var = tbaVar2.c;
            n6r0 n6r0Var = tbaVar2.a;
            u8h1 u8h1Var = tbaVar2.d;
            tar0 tar0Var = this.g;
            if (tar0Var.d && tar0Var.c) {
                tar0Var.e = bundle2.getInt("PresentationIndex");
                nar0 nar0Var = (nar0) bundle2.getParcelable("PagePresentation");
                if (nar0Var == null) {
                    nar0Var = tar0Var.f;
                }
                tar0Var.f = nar0Var;
                tar0Var.j = true;
                tar0Var.k = y6r0Var;
                if (bundle2.getBoolean("HasResolvedVisit")) {
                    tar0Var.g = y6r0Var;
                    tar0Var.h = n6r0Var;
                    tar0Var.i = u8h1Var;
                    tar0Var.s.l(tar0Var.a());
                }
            }
        }
    }

    public void y(Bundle bundle) {
        x(bundle);
    }

    public final Bundle z() {
        this.e.f(this.Y.c);
        mmr0 mmr0VarN = oqn1.n("PBL:PageInstanceId", this.Y.c.a);
        tar0 tar0Var = this.g;
        return mno1.h(new mmr0[]{mmr0VarN, oqn1.n("PBL:PagePresentationState", mno1.h(new mmr0[]{oqn1.n("PresentationIndex", Integer.valueOf(tar0Var.e)), oqn1.n("PagePresentation", tar0Var.f), oqn1.n("HasResolvedVisit", Boolean.valueOf(tar0Var.g != null && tar0Var.m == null))}))});
    }
}
