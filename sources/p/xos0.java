package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xos0 extends eps0 implements m4k {
    public static final xos0 e = new xos0(kug1.e, 0);

    @Override // p.eps0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof xky0) {
            return super.containsKey((xky0) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof osi1) {
            return super.containsValue((osi1) obj);
        }
        return false;
    }

    @Override // p.eps0
    public final ips0 e() {
        wos0 wos0Var = new wos0(this);
        wos0Var.g = this;
        return wos0Var;
    }

    @Override // p.eps0
    public final ips0 f() {
        wos0 wos0Var = new wos0(this);
        wos0Var.g = this;
        return wos0Var;
    }

    @Override // p.eps0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof xky0) {
            return (osi1) super.get((xky0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof xky0) ? obj2 : (osi1) super.getOrDefault((xky0) obj, (osi1) obj2);
    }

    public final xos0 h(xky0 xky0Var, osi1 osi1Var) {
        svh0 svh0VarU = this.b.u(xky0Var, xky0Var.hashCode(), 0, osi1Var);
        if (svh0VarU == null) {
            return this;
        }
        return new xos0(svh0VarU.k(), svh0VarU.n() + this.c);
    }
}
