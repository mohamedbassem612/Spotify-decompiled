package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fyj {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;

    public fyj(int i, boolean z, String str, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyj)) {
            return false;
        }
        fyj fyjVar = (fyj) obj;
        return u890.j(this.a, fyjVar.a) && u890.j(this.b, fyjVar.b) && this.c == fyjVar.c && this.d == fyjVar.d && this.e == fyjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
