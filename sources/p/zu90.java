package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zu90 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    public zu90(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu90)) {
            return false;
        }
        zu90 zu90Var = (zu90) obj;
        return u890.j(this.a, zu90Var.a) && this.b == zu90Var.b && u890.j(this.c, zu90Var.c) && u890.j(this.d, zu90Var.d) && this.e.equals(zu90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d);
    }
}
