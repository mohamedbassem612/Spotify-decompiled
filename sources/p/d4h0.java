package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d4h0 implements e4h0 {
    public final String a;
    public final boolean b;

    public d4h0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4h0)) {
            return false;
        }
        d4h0 d4h0Var = (d4h0) obj;
        return this.a.equals(d4h0Var.a) && this.b == d4h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
