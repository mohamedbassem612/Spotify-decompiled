package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j2i implements vu30, xu30, zu30, bv30, dv30, ev30, fv30, gv30, hu30, ju30, lu30, mu30, nu30, ou30, pu30, qu30, ru30, tu30, uu30 {
    public final int a;
    public final boolean b;
    public Object c;
    public h311 d;
    public ArrayList e;

    public j2i(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (b0k) obj3, ((Number) obj4).intValue());
    }

    public final /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return f(obj, obj2, obj3, obj4, obj5, obj6, (b0k) obj7, ((Number) obj8).intValue());
    }

    public final /* bridge */ /* synthetic */ Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, (b0k) obj5, ((Number) obj6).intValue());
    }

    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(9) : apo.u(9);
        Object obj10 = this.c;
        w0h1.o(11, obj10);
        Object objL = ((ju30) obj10).l(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, x340Var, Integer.valueOf(i | iK));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f2i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i);
        }
        return objL;
    }

    public final /* bridge */ /* synthetic */ Object b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return e(obj, obj2, obj3, obj4, obj5, obj6, obj7, (b0k) obj8, ((Number) obj9).intValue());
    }

    public final /* bridge */ /* synthetic */ Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(obj, obj2, obj3, (b0k) obj4, ((Number) obj5).intValue());
    }

    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(8) : apo.u(8);
        Object obj9 = this.c;
        w0h1.o(10, obj9);
        Object objF1 = ((hu30) obj9).f1(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, x340Var, Integer.valueOf(i | iK));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i2i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i);
        }
        return objF1;
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(7) : apo.u(7);
        Object obj8 = this.c;
        w0h1.o(9, obj8);
        Object objB1 = ((gv30) obj8).b1(obj, obj2, obj3, obj4, obj5, obj6, obj7, x340Var, Integer.valueOf(i | iK));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g2i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i);
        }
        return objB1;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(6) : apo.u(6);
        Object obj7 = this.c;
        w0h1.o(8, obj7);
        Object objK = ((fv30) obj7).K(obj, obj2, obj3, obj4, obj5, obj6, x340Var, Integer.valueOf(i | iK));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h2i(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return objK;
    }

    public final /* bridge */ /* synthetic */ Object f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (b0k) obj9, ((Number) obj10).intValue());
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(5) : apo.u(5);
        Object obj6 = this.c;
        w0h1.o(7, obj6);
        Object objInvoke = ((ev30) obj6).invoke(obj, obj2, obj3, obj4, obj5, x340Var, Integer.valueOf(i | iK));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e2i(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objInvoke;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(4) : apo.u(4);
        Object obj5 = this.c;
        w0h1.o(6, obj5);
        Object objY = ((dv30) obj5).Y(obj, obj2, obj3, obj4, x340Var, Integer.valueOf(iK | i));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hfa(this, obj, obj2, obj3, obj4, i);
        }
        return objY;
    }

    public final Object i(Object obj, Object obj2, Object obj3, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(3) : apo.u(3);
        Object obj4 = this.c;
        w0h1.o(5, obj4);
        Object objC1 = ((bv30) obj4).c1(obj, obj2, obj3, x340Var, Integer.valueOf(iK | i));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zh3(this, obj, obj2, obj3, i);
        }
        return objC1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m((b0k) obj, ((Number) obj2).intValue());
    }

    public final Object j(Object obj, Object obj2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(2) : apo.u(2);
        Object obj3 = this.c;
        w0h1.o(4, obj3);
        Object objJ = ((zu30) obj3).J(obj, obj2, x340Var, Integer.valueOf(iK | i));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(this, obj, obj2, i);
        }
        return objJ;
    }

    public final Object k(Object obj, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = x340Var.g(this) ? apo.k(1) : apo.u(1);
        Object obj2 = this.c;
        w0h1.o(3, obj2);
        Object objInvoke = ((xu30) obj2).invoke(obj, x340Var, Integer.valueOf(iK | i));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(this, obj, i, (byte) 2);
        }
        return objInvoke;
    }

    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (b0k) obj10, ((Number) obj11).intValue());
    }

    public final Object m(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(this.a);
        n(x340Var);
        int iK = i | (x340Var.g(this) ? apo.k(0) : apo.u(0));
        Object obj = this.c;
        w0h1.o(2, obj);
        Object objInvoke = ((vu30) obj).invoke(x340Var, Integer.valueOf(iK));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u98(this);
        }
        return objInvoke;
    }

    public final void n(b0k b0kVar) {
        h311 h311VarD;
        if (!this.b || (h311VarD = ((x340) b0kVar).D()) == null) {
            return;
        }
        h311VarD.b |= 1;
        if (apo.s(this.d, h311VarD)) {
            this.d = h311VarD;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(h311VarD);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (apo.s((h311) arrayList.get(i), h311VarD)) {
                arrayList.set(i, h311VarD);
                return;
            }
        }
        arrayList.add(h311VarD);
    }

    public final void o(cv30 cv30Var) {
        if (u890.j(this.c, cv30Var)) {
            return;
        }
        boolean z = this.c == null;
        this.c = cv30Var;
        if (z || !this.b) {
            return;
        }
        h311 h311Var = this.d;
        if (h311Var != null) {
            h311Var.b();
            this.d = null;
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((h311) arrayList.get(i)).b();
            }
            arrayList.clear();
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return k(obj, (b0k) obj2, ((Number) obj3).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return g(obj, obj2, obj3, obj4, obj5, (b0k) obj6, ((Number) obj7).intValue());
    }
}
