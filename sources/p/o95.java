package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o95 {
    public final tzg1 a;
    public final Object b;
    public final ie5 c;
    public final hrr0 d;
    public final hrr0 e;
    public final qfn0 f;
    public final n8b1 g;
    public final oe5 h;
    public final oe5 i;
    public oe5 j;
    public oe5 k;

    public o95(Object obj, tzg1 tzg1Var, Object obj2) {
        this.a = tzg1Var;
        this.b = obj2;
        ie5 ie5Var = new ie5(tzg1Var, obj, null, 60);
        this.c = ie5Var;
        this.d = xto.t(Boolean.FALSE);
        this.e = xto.t(obj);
        this.f = new qfn0();
        this.g = new n8b1(obj2, 3);
        oe5 oe5Var = ie5Var.c;
        boolean z = oe5Var instanceof ke5;
        oe5 oe5Var2 = z ? c97.e : oe5Var instanceof le5 ? c97.f : oe5Var instanceof me5 ? c97.g : c97.h;
        this.h = oe5Var2;
        oe5 oe5Var3 = z ? c97.a : oe5Var instanceof le5 ? c97.b : oe5Var instanceof me5 ? c97.c : c97.d;
        this.i = oe5Var3;
        this.j = oe5Var2;
        this.k = oe5Var3;
    }

    public static Object b(o95 o95Var, Object obj, fe5 fe5Var, Float f, iu30 iu30Var, lnm lnmVar, int i) {
        if ((i & 2) != 0) {
            fe5Var = o95Var.g;
        }
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = o95Var.a.b.invoke(o95Var.c.c);
        }
        Object obj2 = objInvoke;
        if ((i & 8) != 0) {
            iu30Var = null;
        }
        iu30 iu30Var2 = iu30Var;
        return qfn0.a(o95Var.f, new l95(o95Var, obj2, ern1.k(fe5Var, o95Var.a, o95Var.e(), obj, obj2), o95Var.c.d, iu30Var2, null), lnmVar);
    }

    public final Object a(Float f, e9r e9rVar, iu30 iu30Var, a8d1 a8d1Var) {
        Object objE = e();
        tzg1 tzg1Var = this.a;
        return qfn0.a(this.f, new l95(this, f, new mv2(e9rVar, tzg1Var, objE, (oe5) tzg1Var.a.invoke(f)), this.c.d, iu30Var, null), a8d1Var);
    }

    public final Object c(Object obj) {
        if (!u890.j(this.j, this.h) || !u890.j(this.k, this.i)) {
            tzg1 tzg1Var = this.a;
            oe5 oe5Var = (oe5) tzg1Var.a.invoke(obj);
            int iB = oe5Var.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (oe5Var.a(i) < this.j.a(i) || oe5Var.a(i) > this.k.a(i)) {
                    oe5Var.e(yoi1.o(oe5Var.a(i), this.j.a(i), this.k.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return tzg1Var.b.invoke(oe5Var);
            }
        }
        return obj;
    }

    public final void d() {
        ie5 ie5Var = this.c;
        ie5Var.c.d();
        ie5Var.d = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object e() {
        return this.c.b.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object g(Object obj, lnm lnmVar) {
        Object objA = qfn0.a(this.f, new xx3(this, obj, (lnm) null, (byte) 1), lnmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public final Object h(onm onmVar) {
        Object objA = qfn0.a(this.f, new m95(this, null, (byte) 0), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public final void i(Float f, Float f2) {
        tzg1 tzg1Var = this.a;
        oe5 oe5Var = (oe5) tzg1Var.a.invoke(f);
        if (oe5Var == null) {
            oe5Var = this.h;
        }
        oe5 oe5Var2 = (oe5) tzg1Var.a.invoke(f2);
        if (oe5Var2 == null) {
            oe5Var2 = this.i;
        }
        int iB = oe5Var.b();
        for (int i = 0; i < iB; i++) {
            if (oe5Var.a(i) > oe5Var2.a(i)) {
                dmv0.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + oe5Var + " is greater than upper bound " + oe5Var2 + " on index " + i);
            }
        }
        this.j = oe5Var;
        this.k = oe5Var2;
        if (f()) {
            return;
        }
        Object objC = c(e());
        if (u890.j(objC, e())) {
            return;
        }
        this.c.b.setValue(objC);
    }

    public /* synthetic */ o95(Object obj, tzg1 tzg1Var, Object obj2, int i) {
        this(obj, tzg1Var, (i & 4) != 0 ? null : obj2);
    }
}
