package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u761 {
    public final String a;
    public final int b;

    public u761(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u761)) {
            return false;
        }
        u761 u761Var = (u761) obj;
        return u890.j(this.a, u761Var.a) && this.b == u761Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
