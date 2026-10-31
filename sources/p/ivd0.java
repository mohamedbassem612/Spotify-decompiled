package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ivd0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ivd0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivd0)) {
            return false;
        }
        ivd0 ivd0Var = (ivd0) obj;
        return this.a.equals(ivd0Var.a) && this.b.equals(ivd0Var.b) && this.c.equals(ivd0Var.c) && this.d == ivd0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
