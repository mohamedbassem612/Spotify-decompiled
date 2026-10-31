package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t0j0 implements w0j0 {
    public final String a;
    public final String b;

    public t0j0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0j0)) {
            return false;
        }
        t0j0 t0j0Var = (t0j0) obj;
        return u890.j(this.a, t0j0Var.a) && u890.j(this.b, t0j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
