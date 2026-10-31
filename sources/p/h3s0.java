package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h3s0 implements k3s0 {
    public final String a;
    public final String b;
    public final boolean c;

    public h3s0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3s0)) {
            return false;
        }
        h3s0 h3s0Var = (h3s0) obj;
        return this.a.equals(h3s0Var.a) && this.b.equals(h3s0Var.b) && this.c == h3s0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
