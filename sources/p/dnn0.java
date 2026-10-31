package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dnn0 {
    public final apn0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public dnn0(apn0 apn0Var, boolean z, Object obj, boolean z2, boolean z3) {
        if (!apn0Var.a && z) {
            hhg1.f(apn0Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            bhn0.k("Argument with type ", apn0Var.b(), " has null value but is not nullable.");
            throw null;
        }
        this.a = apn0Var;
        this.b = z;
        this.e = obj;
        this.c = z2 || z3;
        this.d = z3;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !dnn0.class.equals(obj.getClass())) {
            return false;
        }
        dnn0 dnn0Var = (dnn0) obj;
        if (this.b != dnn0Var.b || this.c != dnn0Var.c || !this.a.equals(dnn0Var.a)) {
            return false;
        }
        Object obj2 = dnn0Var.e;
        Object obj3 = this.e;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(dnn0.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        return sb.toString();
    }
}
