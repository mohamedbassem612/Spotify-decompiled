package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s0a0 {
    public final String a;
    public final String b;

    public s0a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0a0)) {
            return false;
        }
        s0a0 s0a0Var = (s0a0) obj;
        return u890.j(this.a, s0a0Var.a) && u890.j(this.b, s0a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
