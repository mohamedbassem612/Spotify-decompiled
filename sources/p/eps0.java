package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class eps0 extends m7 implements Map, ola0 {
    public static final eps0 d = new eps0(kug1.e, 0);
    public final kug1 b;
    public final int c;

    public eps0(kug1 kug1Var, int i) {
        this.b = kug1Var;
        this.c = i;
    }

    public final Set a() {
        return new sps0(this);
    }

    public final Set b() {
        return new vps0(this);
    }

    public final int c() {
        return this.c;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Collection d() {
        return new l7(this, (byte) 1);
    }

    public ips0 e() {
        return new ips0(this);
    }

    public /* bridge */ ips0 f() {
        return e();
    }

    public final eps0 g(Object obj, ylc0 ylc0Var) {
        svh0 svh0VarU = this.b.u(obj, obj != null ? obj.hashCode() : 0, 0, ylc0Var);
        if (svh0VarU == null) {
            return this;
        }
        return new eps0(svh0VarU.k(), svh0VarU.n() + this.c);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.b.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
