package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h500 implements x600 {
    public final String a;
    public final Throwable b;

    public h500(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h500)) {
            return false;
        }
        h500 h500Var = (h500) obj;
        return u890.j(this.a, h500Var.a) && this.b.equals(h500Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
