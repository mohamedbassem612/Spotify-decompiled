package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g7e {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public g7e(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7e)) {
            return false;
        }
        g7e g7eVar = (g7e) obj;
        return u890.j(this.a, g7eVar.a) && u890.j(this.b, g7eVar.b) && this.c == g7eVar.c && this.d == g7eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
