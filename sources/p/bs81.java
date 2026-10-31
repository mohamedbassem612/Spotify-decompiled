package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bs81 implements cs81 {
    public final String a;
    public final int b;

    public bs81(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs81)) {
            return false;
        }
        bs81 bs81Var = (bs81) obj;
        return u890.j(this.a, bs81Var.a) && this.b == bs81Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
