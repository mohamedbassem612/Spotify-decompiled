package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s23 implements d33 {
    public final String a;
    public final wvi0 b;

    public s23(String str, wvi0 wvi0Var) {
        this.a = str;
        this.b = wvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s23)) {
            return false;
        }
        s23 s23Var = (s23) obj;
        return this.a.equals(s23Var.a) && this.b.equals(s23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
