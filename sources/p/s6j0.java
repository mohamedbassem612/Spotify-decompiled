package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s6j0 {
    public final String a;
    public final String b;

    public s6j0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6j0)) {
            return false;
        }
        s6j0 s6j0Var = (s6j0) obj;
        return this.a.equals(s6j0Var.a) && this.b.equals(s6j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
