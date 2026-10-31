package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uio0 {
    public final String a;
    public final ayh b;

    public uio0(String str, ayh ayhVar) {
        this.a = str;
        this.b = ayhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uio0) {
            uio0 uio0Var = (uio0) obj;
            return u890.j(this.a, uio0Var.a) && this.b == uio0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
