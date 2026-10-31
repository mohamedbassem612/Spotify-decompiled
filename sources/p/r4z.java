package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r4z {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final d1z i;
    public final boolean j;

    public r4z(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, d1z d1zVar, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
        this.i = d1zVar;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4z)) {
            return false;
        }
        r4z r4zVar = (r4z) obj;
        return this.a == r4zVar.a && u890.j(this.b, r4zVar.b) && this.c.equals(r4zVar.c) && this.d.equals(r4zVar.d) && this.e.equals(r4zVar.e) && this.f.equals(r4zVar.f) && u890.j(this.g, r4zVar.g) && this.h == r4zVar.h && this.i == r4zVar.i && this.j == r4zVar.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ab80.k(this.h, (iD + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31);
    }
}
