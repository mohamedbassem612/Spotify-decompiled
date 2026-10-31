package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l4e {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public l4e(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4e)) {
            return false;
        }
        l4e l4eVar = (l4e) obj;
        return this.a.equals(l4eVar.a) && this.b.equals(l4eVar.b) && this.c == l4eVar.c && this.d == l4eVar.d && this.e.equals(l4eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
