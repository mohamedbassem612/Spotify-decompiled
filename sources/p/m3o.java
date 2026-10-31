package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3o {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public m3o(int i, String str, String str2, boolean z, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3o)) {
            return false;
        }
        m3o m3oVar = (m3o) obj;
        return this.a == m3oVar.a && u890.j(this.b, m3oVar.b) && this.c.equals(m3oVar.c) && u890.j(this.d, m3oVar.d) && this.e == m3oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
