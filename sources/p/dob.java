package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dob {
    public final zc8 a;
    public final jo70 b;

    public dob(zc8 zc8Var, jo70 jo70Var) {
        this.a = zc8Var;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dob)) {
            return false;
        }
        dob dobVar = (dob) obj;
        return this.a.equals(dobVar.a) && u890.j(this.b, dobVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        return iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode());
    }
}
