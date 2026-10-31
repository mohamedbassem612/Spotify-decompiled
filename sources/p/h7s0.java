package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h7s0 implements j7s0 {
    public final String a;
    public final String b;
    public final String c;

    public h7s0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7s0)) {
            return false;
        }
        h7s0 h7s0Var = (h7s0) obj;
        return this.a.equals(h7s0Var.a) && this.b.equals(h7s0Var.b) && this.c.equals(h7s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
