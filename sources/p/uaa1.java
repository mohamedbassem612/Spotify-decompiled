package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uaa1 {
    public final String a;
    public final int b;

    public uaa1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa1)) {
            return false;
        }
        uaa1 uaa1Var = (uaa1) obj;
        return u890.j(this.a, uaa1Var.a) && this.b == uaa1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
