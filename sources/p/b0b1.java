package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b0b1 {
    public final String a;
    public final String b;
    public final boolean c;

    public b0b1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0b1)) {
            return false;
        }
        b0b1 b0b1Var = (b0b1) obj;
        return this.a.equals(b0b1Var.a) && u890.j(this.b, b0b1Var.b) && this.c == b0b1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
