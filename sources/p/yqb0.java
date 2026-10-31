package p;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class yqb0 extends aqi0 {
    public static final /* synthetic */ mma0[] m = {new cey0(yqb0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new cey0(yqb0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new cey0(yqb0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    public final o860 b;
    public final yqb0 c;
    public final ooe0 d;
    public final toe0 e;
    public final qoe0 f;
    public final ffr g;
    public final qoe0 h;
    public final toe0 i;
    public final toe0 j;
    public final toe0 k;
    public final qoe0 l;

    public yqb0(o860 o860Var, lqb0 lqb0Var) {
        this.b = o860Var;
        this.c = lqb0Var;
        voe0 voe0Var = (voe0) ((uw0) o860Var.b).d;
        byte b = 0;
        this.d = new ooe0(voe0Var, new uqb0(this, b));
        byte b2 = 1;
        this.e = new toe0(voe0Var, new uqb0(this, b2));
        this.f = voe0Var.a(new wqb0(this, b));
        this.g = voe0Var.b(new wqb0(this, b2));
        byte b3 = 2;
        this.h = voe0Var.a(new wqb0(this, b3));
        this.i = new toe0(voe0Var, new uqb0(this, b3));
        byte b4 = 3;
        this.j = new toe0(voe0Var, new uqb0(this, b4));
        this.k = new toe0(voe0Var, new uqb0(this, (byte) 4));
        this.l = voe0Var.a(new wqb0(this, b4));
    }

    public static na30 t(o860 o860Var, qv30 qv30Var, List list) {
        mmr0 mmr0Var;
        ajn0 ajn0Var;
        ajn0 ajn0VarE;
        st60 st60Var = (st60) o860Var.e;
        ajm0 ajm0Var = (ajm0) ((uw0) o860Var.b).X;
        ba80 ba80VarU1 = o7h.u1(list);
        ArrayList arrayList = new ArrayList(q7h.U(ba80VarU1, 10));
        ca80 it = ba80VarU1.iterator();
        boolean z = false;
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                return new na30(o7h.l1(arrayList), z);
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            int i = aa80Var.a;
            bc11 bc11Var = (bc11) aa80Var.b;
            eqb0 eqb0VarN = flo1.n(o860Var, bc11Var);
            o8a0 o8a0VarU = bs51.u(2, false, (drb0) null, 7);
            boolean z2 = bc11Var.d;
            zb11 zb11Var = bc11Var.a;
            if (z2) {
                gb11 gb11Var = zb11Var instanceof gb11 ? (gb11) zb11Var : null;
                if (gb11Var == null) {
                    ncn0.e(bc11Var, "Vararg parameter should be an array: ");
                    return null;
                }
                gmh1 gmh1VarJ = st60Var.J(gb11Var, o8a0VarU, true);
                mmr0Var = new mmr0(gmh1VarJ, ajm0Var.e.g(gmh1VarJ));
            } else {
                mmr0Var = new mmr0(st60Var.L(zb11Var, o8a0VarU), (Object) null);
            }
            a8b0 a8b0Var = (a8b0) mmr0Var.a;
            a8b0 a8b0Var2 = (a8b0) mmr0Var.b;
            if (u890.j(qv30Var.getName().b(), "equals") && list.size() == 1 && ajm0Var.e.p().equals(a8b0Var)) {
                ajn0VarE = ajn0.e("other");
            } else {
                String str = bc11Var.c;
                ajn0 ajn0VarD = str != null ? ajn0.d(str) : null;
                if (ajn0VarD == null) {
                    z = true;
                }
                if (ajn0VarD == null) {
                    ajn0VarE = ajn0.e("p" + i);
                } else {
                    ajn0Var = ajn0VarD;
                }
                arrayList.add(new tsi1(qv30Var, null, i, eqb0VarN, ajn0Var, a8b0Var, false, false, false, a8b0Var2, wdx0.b(bc11Var)));
            }
            ajn0Var = ajn0VarE;
            arrayList.add(new tsi1(qv30Var, null, i, eqb0VarN, ajn0Var, a8b0Var, false, false, false, a8b0Var2, wdx0.b(bc11Var)));
        }
    }

    @Override // p.aqi0, p.zpi0
    public Collection a(ajn0 ajn0Var, int i) {
        return !f().contains(ajn0Var) ? z6x.a : (Collection) this.l.invoke(ajn0Var);
    }

    @Override // p.aqi0, p.zpi0
    public final Set b() {
        mma0 mma0Var = m[0];
        return (Set) this.i.invoke();
    }

    @Override // p.aqi0, p.zpi0
    public Collection c(ajn0 ajn0Var, int i) {
        return !b().contains(ajn0Var) ? z6x.a : (Collection) this.h.invoke(ajn0Var);
    }

    @Override // p.aqi0, p.zpi0
    public Collection d(wgt wgtVar, iu30 iu30Var) {
        return (Collection) this.d.invoke();
    }

    @Override // p.aqi0, p.zpi0
    public final Set e() {
        mma0 mma0Var = m[2];
        return (Set) this.k.invoke();
    }

    @Override // p.aqi0, p.zpi0
    public final Set f() {
        mma0 mma0Var = m[1];
        return (Set) this.j.invoke();
    }

    public Set h(wgt wgtVar, iu30 iu30Var) {
        return w7x.a;
    }

    public Set i(wgt wgtVar, iu30 iu30Var) {
        return w7x.a;
    }

    public u9r k() {
        return t9r.a;
    }

    public Set n() {
        return w7x.a;
    }

    public rob0 o() {
        return null;
    }

    public abstract n9r p();

    public boolean q(c8a0 c8a0Var) {
        return true;
    }

    public xqb0 r(ArrayList arrayList, a8b0 a8b0Var, List list) {
        return new xqb0(a8b0Var, list, arrayList, z6x.a);
    }

    public final c8a0 s(vb11 vb11Var) {
        o860 o860Var = this.b;
        int i = 1;
        c8a0 c8a0VarL1 = c8a0.L1(p(), flo1.n(o860Var, vb11Var), vb11Var.c(), wdx0.b(vb11Var), ((u9r) this.e.invoke()).c(vb11Var.c()) != null && ((ArrayList) vb11Var.h()).isEmpty());
        o860 o860VarN = ryn1.n(o860Var, c8a0VarL1, vb11Var, 0, (znb0) o860Var.d);
        ArrayList typeParameters = vb11Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(q7h.U(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            y0h1 y0h1VarB = ((b1h1) o860VarN.c).b((ac11) it.next());
            y0h1VarB.getClass();
            arrayList.add(y0h1VarB);
        }
        na30 na30VarT = t(o860VarN, c8a0VarL1, vb11Var.h());
        xqb0 xqb0VarR = r(arrayList, ((st60) o860VarN.e).L(vb11Var.g(), bs51.u(2, ((Method) vb11Var.b()).getDeclaringClass().isAnnotation(), (drb0) null, 6)), na30VarT.a);
        List list = xqb0VarR.d;
        rob0 rob0VarO = o();
        ArrayList arrayList2 = xqb0VarR.c;
        List list2 = xqb0VarR.b;
        a8b0 a8b0Var = xqb0VarR.a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) vb11Var.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) vb11Var.b()).getModifiers());
        if (zIsAbstract) {
            i = 4;
        } else if (!zIsFinal) {
            i = 3;
        }
        c8a0VarL1.K1(null, rob0VarO, z6x.a, arrayList2, list2, a8b0Var, i, kuo1.k(vb11Var.e()), b7x.a);
        c8a0VarL1.P0 = Modifier.isNative(vb11Var.a.getModifiers());
        c8a0VarL1.M1(false, na30VarT.b);
        if (list.isEmpty()) {
            return c8a0VarL1;
        }
        hhg1.h("Should not be called");
        return null;
    }

    public String toString() {
        return "Lazy scope for " + p();
    }

    public void j(ArrayList arrayList, ajn0 ajn0Var) {
    }

    public void l(LinkedHashSet linkedHashSet, ajn0 ajn0Var) {
    }

    public void m(ArrayList arrayList, ajn0 ajn0Var) {
    }
}
