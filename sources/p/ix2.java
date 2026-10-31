package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ix2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public ix2(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix2)) {
            return false;
        }
        ix2 ix2Var = (ix2) obj;
        return this.a.equals(ix2Var.a) && this.b.equals(ix2Var.b) && this.c == ix2Var.c && this.d.equals(ix2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
