package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ips0 extends z8 implements Map, sla0 {
    public eps0 a;
    public ypa b = new ypa((byte) 17, false);
    public kug1 c;
    public Object d;
    public int e;
    public int f;

    public ips0(eps0 eps0Var) {
        this.a = eps0Var;
        this.c = eps0Var.b;
        this.f = eps0Var.c;
    }

    public final Set a() {
        return new mps0(this, (byte) 0);
    }

    public final Set b() {
        return new mps0(this, (byte) 1);
    }

    public final int c() {
        return this.f;
    }

    @Override // java.util.Map
    public final void clear() {
        this.c = kug1.e;
        g(0);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Collection d() {
        return new zkg0(this, (byte) 2);
    }

    public eps0 e() {
        kug1 kug1Var = this.c;
        eps0 eps0Var = this.a;
        if (kug1Var != eps0Var.b) {
            this.b = new ypa((byte) 17, false);
            eps0Var = new eps0(this.c, c());
        }
        this.a = eps0Var;
        return eps0Var;
    }

    public /* bridge */ eps0 f() {
        return e();
    }

    public final void g(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final void putAll(Map map) {
        eps0 eps0VarE = null;
        eps0 eps0Var = map instanceof eps0 ? (eps0) map : null;
        if (eps0Var == null) {
            ips0 ips0Var = map instanceof ips0 ? (ips0) map : null;
            if (ips0Var != null) {
                eps0VarE = ips0Var.e();
            }
        } else {
            eps0VarE = eps0Var;
        }
        if (eps0VarE == null) {
            super/*java.util.AbstractMap*/.putAll(map);
            return;
        }
        x9t x9tVar = new x9t();
        x9tVar.a = 0;
        int i = this.f;
        this.c = this.c.m(eps0VarE.b, 0, x9tVar, this);
        int i2 = (eps0VarE.c + i) - x9tVar.a;
        if (i != i2) {
            g(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        kug1 kug1VarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kug1VarO == null) {
            kug1VarO = kug1.e;
        }
        this.c = kug1VarO;
        return iC != c();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        kug1 kug1VarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kug1VarN == null) {
            kug1VarN = kug1.e;
        }
        this.c = kug1VarN;
        return this.d;
    }
}
