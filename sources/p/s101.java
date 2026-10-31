package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s101 implements z101 {
    public final String a;
    public final Throwable b;

    public s101(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s101)) {
            return false;
        }
        s101 s101Var = (s101) obj;
        return u890.j(this.a, s101Var.a) && this.b.equals(s101Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
