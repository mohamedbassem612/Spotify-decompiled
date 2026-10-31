package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ru91 implements iq20 {
    public final wu91 a;
    public final e9r b;
    public final fe5 c;
    public final ts41 d = ws41.b;

    public ru91(wu91 wu91Var, e9r e9rVar, fe5 fe5Var) {
        this.a = wu91Var;
        this.b = e9rVar;
        this.c = fe5Var;
    }

    @Override // p.iq20
    public Object a(bs41 bs41Var, float f, lnm lnmVar) {
        return c(bs41Var, f, ujo1.a, (onm) lnmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(bs41 bs41Var, float f, iu30 iu30Var, onm onmVar) {
        nu91 nu91Var;
        iu30 iu30Var2;
        if (onmVar instanceof nu91) {
            nu91Var = (nu91) onmVar;
            int i = nu91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nu91Var.d = i - Integer.MIN_VALUE;
            } else {
                nu91Var = new nu91(this, onmVar);
            }
        } else {
            nu91Var = new nu91(this, onmVar);
        }
        Object objH = nu91Var.b;
        int i2 = nu91Var.d;
        if (i2 == 0) {
            hm5.M(objH);
            hu91 hu91Var = new hu91(this, f, iu30Var, bs41Var, (lnm) null);
            nu91Var.a = iu30Var;
            nu91Var.d = 1;
            objH = c921.H(this.d, hu91Var, nu91Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
            iu30Var2 = iu30Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu30Var2 = nu91Var.a;
            hm5.M(objH);
        }
        be5 be5Var = (be5) objH;
        iu30Var2.invoke(yah0.o(0.0f));
        return be5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(bs41 bs41Var, float f, iu30 iu30Var, onm onmVar) {
        pu91 pu91Var;
        if (onmVar instanceof pu91) {
            pu91Var = (pu91) onmVar;
            int i = pu91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pu91Var.c = i - Integer.MIN_VALUE;
            } else {
                pu91Var = new pu91(this, onmVar);
            }
        } else {
            pu91Var = new pu91(this, onmVar);
        }
        Object objB = pu91Var.a;
        int i2 = pu91Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            pu91Var.c = 1;
            objB = b(bs41Var, f, iu30Var, pu91Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        be5 be5Var = (be5) objB;
        return yah0.o(((Number) be5Var.a()).floatValue() != 0.0f ? ((Number) be5Var.b().c()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(bs41 bs41Var, float f, float f2, ou91 ou91Var, onm onmVar) {
        qu91 qu91Var;
        if (onmVar instanceof qu91) {
            qu91Var = (qu91) onmVar;
            int i = qu91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qu91Var.c = i - Integer.MIN_VALUE;
            } else {
                qu91Var = new qu91(this, onmVar);
            }
        } else {
            qu91Var = new qu91(this, onmVar);
        }
        qu91 qu91Var2 = qu91Var;
        Object objK = qu91Var2.a;
        int i2 = qu91Var2.c;
        if (i2 == 0) {
            hm5.M(objK);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return prn1.a(28, f, f2);
            }
            qu91Var2.c = 1;
            e9r e9rVar = this.b;
            objK = (Math.abs(t5p1.k(e9rVar, 0.0f, f2)) >= Math.abs(f) ? new l2a(e9rVar, (byte) 28) : new c681(this.c, (byte) 21)).k(bs41Var, yah0.o(f), yah0.o(f2), ou91Var, qu91Var2);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        return ((be5) objK).c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ru91) {
            ru91 ru91Var = (ru91) obj;
            if (u890.j(ru91Var.c, this.c) && u890.j(ru91Var.b, this.b) && u890.j(ru91Var.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
