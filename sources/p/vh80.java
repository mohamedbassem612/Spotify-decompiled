package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vh80 implements wh80 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public vh80(int i, String str, String str2, boolean z, String str3) {
        z = (i & 128) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // p.wh80
    public final boolean a() {
        return true;
    }

    @Override // p.wh80
    public final String c() {
        return null;
    }

    @Override // p.wh80
    public final boolean d() {
        return false;
    }

    @Override // p.wh80
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh80)) {
            return false;
        }
        vh80 vh80Var = (vh80) obj;
        return this.a.equals(vh80Var.a) && this.b.equals(vh80Var.b) && this.c.equals(vh80Var.c) && this.d == vh80Var.d;
    }

    @Override // p.wh80
    public final boolean f() {
        return this.d;
    }

    @Override // p.wh80
    public final boolean g() {
        return false;
    }

    @Override // p.wh80
    public final String getContextUri() {
        return this.c;
    }

    @Override // p.wh80
    public final String getUid() {
        return this.b;
    }

    @Override // p.wh80
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, true), 31, this.c), 31, false), 961, false), 31, this.d);
    }
}
