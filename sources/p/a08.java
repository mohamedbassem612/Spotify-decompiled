package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a08 implements c08 {
    public final String a;
    public final int b;

    public a08(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a08)) {
            return false;
        }
        a08 a08Var = (a08) obj;
        return u890.j(this.a, a08Var.a) && this.b == a08Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
