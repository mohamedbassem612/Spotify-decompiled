package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class spq0 implements Serializable {
    public static spq0 a(Object obj) {
        return obj == null ? j5.a : new i5w0(obj);
    }

    public static i5w0 d(Object obj) {
        obj.getClass();
        return new i5w0(obj);
    }

    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public Object e(Object obj) {
        dm5.s(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public Object f(otc otcVar) {
        Object obj = otcVar.get();
        dm5.s(obj, "use Optional.orNull() instead of a Supplier that returns null");
        return obj;
    }

    public spq0 g(spq0 spq0Var) {
        spq0Var.getClass();
        return spq0Var;
    }

    public Object h() {
        return null;
    }

    public int hashCode() {
        return 2040732332;
    }

    public spq0 i(su30 su30Var) {
        su30Var.getClass();
        return j5.a;
    }
}
