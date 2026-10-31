package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class py21 {
    public final py21 a(iu30 iu30Var) {
        Object objInvoke;
        way wayVar = new way(iu30Var, (byte) 1);
        if (this instanceof ly21) {
            objInvoke = new ly21(((ly21) this).a);
        } else {
            if (!(this instanceof oy21)) {
                eg.o();
                return null;
            }
            objInvoke = wayVar.invoke(((oy21) this).a);
        }
        return (py21) objInvoke;
    }

    public final Object b(iu30 iu30Var, iu30 iu30Var2) {
        if (this instanceof ly21) {
            return iu30Var.invoke(((ly21) this).a);
        }
        if (this instanceof oy21) {
            return iu30Var2.invoke(((oy21) this).a);
        }
        eg.o();
        return null;
    }

    public final Object c() {
        if (this instanceof ly21) {
            return null;
        }
        if (this instanceof oy21) {
            return ((oy21) this).a;
        }
        eg.o();
        return null;
    }

    public final Object d() {
        if (this instanceof ly21) {
            k220.i(((ly21) this).a.b());
            return null;
        }
        if (this instanceof oy21) {
            return ((oy21) this).a;
        }
        eg.o();
        return null;
    }

    public final String toString() {
        Object objInvoke;
        xt21 xt21Var = xt21.t;
        if (this instanceof ly21) {
            objInvoke = xt21Var.invoke(((ly21) this).a);
        } else {
            if (!(this instanceof oy21)) {
                eg.o();
                return null;
            }
            objInvoke = "Success";
        }
        return (String) objInvoke;
    }
}
