package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class el31 {
    public final String a;
    public final dzo1 b;

    public el31(String str, dzo1 dzo1Var) {
        this.a = str;
        this.b = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el31)) {
            return false;
        }
        el31 el31Var = (el31) obj;
        return u890.j(this.a, el31Var.a) && this.b.equals(el31Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
