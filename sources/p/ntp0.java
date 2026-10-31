package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ntp0 {
    public final jfv a;
    public final jfv b;

    public ntp0(jfv jfvVar, jfv jfvVar2) {
        this.a = jfvVar;
        this.b = jfvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntp0)) {
            return false;
        }
        ntp0 ntp0Var = (ntp0) obj;
        return u890.j(this.a, ntp0Var.a) && u890.j(this.b, ntp0Var.b);
    }

    public final int hashCode() {
        jfv jfvVar = this.a;
        int iHashCode = (jfvVar == null ? 0 : Long.hashCode(jfvVar.a)) * 31;
        jfv jfvVar2 = this.b;
        return iHashCode + (jfvVar2 != null ? Long.hashCode(jfvVar2.a) : 0);
    }
}
