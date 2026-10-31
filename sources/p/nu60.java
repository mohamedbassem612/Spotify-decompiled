package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nu60 extends ru60 {
    public final String a;
    public final j16 b;
    public final vr60 c;

    public nu60(String str, j16 j16Var, vr60 vr60Var) {
        this.a = str;
        this.b = j16Var;
        this.c = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu60)) {
            return false;
        }
        nu60 nu60Var = (nu60) obj;
        return u890.j(this.a, nu60Var.a) && this.b == nu60Var.b && this.c.equals(nu60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
