package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v101 implements z101 {
    public final String a;
    public final Throwable b;

    public v101(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v101)) {
            return false;
        }
        v101 v101Var = (v101) obj;
        return u890.j(this.a, v101Var.a) && this.b.equals(v101Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
