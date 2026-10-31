package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mqs0 extends aa implements v380 {
    public static final mqs0 d;
    public final Object a;
    public final Object b;
    public final eps0 c;

    static {
        vf61 vf61Var = vf61.R0;
        eps0 eps0Var = eps0.d;
        zso1.C();
        d = new mqs0(vf61Var, vf61Var, eps0.d);
    }

    public mqs0(Object obj, Object obj2, eps0 eps0Var) {
        this.a = obj;
        this.b = obj2;
        this.c = eps0Var;
    }

    public final int b() {
        return this.c.c();
    }

    public final mqs0 c(Object obj) {
        eps0 eps0Var = this.c;
        if (eps0Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new mqs0(obj, obj, eps0Var.g(obj, new ylc0()));
        }
        Object obj2 = this.b;
        Object obj3 = eps0Var.get(obj2);
        obj3.getClass();
        return new mqs0(this.a, obj, eps0Var.g(obj2, new ylc0(((ylc0) obj3).a, obj)).g(obj, new ylc0(obj2)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    public final mqs0 d(Object obj) {
        eps0 eps0VarG = this.c;
        ylc0 ylc0Var = (ylc0) eps0VarG.get(obj);
        if (ylc0Var == null) {
            return this;
        }
        Object obj2 = ylc0Var.a;
        Object obj3 = ylc0Var.b;
        kug1 kug1Var = eps0VarG.b;
        kug1 kug1VarV = kug1Var.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (kug1Var != kug1VarV) {
            if (kug1VarV == null) {
                eps0 eps0Var = eps0.d;
                zso1.C();
                eps0VarG = eps0.d;
            } else {
                eps0VarG = new eps0(kug1VarV, eps0VarG.c - 1);
            }
        }
        vf61 vf61Var = vf61.R0;
        if (obj2 != vf61Var) {
            Object obj4 = eps0VarG.get(obj2);
            obj4.getClass();
            eps0VarG = eps0VarG.g(obj2, new ylc0(((ylc0) obj4).a, obj3));
        }
        if (obj3 != vf61Var) {
            Object obj5 = eps0VarG.get(obj3);
            obj5.getClass();
            eps0VarG = eps0VarG.g(obj3, new ylc0(obj2, ((ylc0) obj5).b));
        }
        Object obj6 = obj2 != vf61Var ? this.a : obj3;
        if (obj3 != vf61Var) {
            obj2 = this.b;
        }
        return new mqs0(obj6, obj2, eps0VarG);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new kqs0(this.a, this.c, (byte) 1);
    }
}
