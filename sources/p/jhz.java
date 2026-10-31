package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jhz {
    public final String a;
    public final int b;
    public final byte c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public jhz(int i, String str, int i2, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhz)) {
            return false;
        }
        jhz jhzVar = (jhz) obj;
        return u890.j(this.a, jhzVar.a) && this.b == jhzVar.b && this.c == jhzVar.c && this.d.equals(jhzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
