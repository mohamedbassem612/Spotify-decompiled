package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yzd0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public yzd0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzd0)) {
            return false;
        }
        yzd0 yzd0Var = (yzd0) obj;
        return this.a.equals(yzd0Var.a) && this.b.equals(yzd0Var.b) && this.c.equals(yzd0Var.c) && this.d == yzd0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
