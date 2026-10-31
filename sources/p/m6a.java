package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m6a implements o6a {
    public final String a;
    public final String b;
    public final String c;
    public final e8a d;

    public m6a(String str, String str2, String str3, e8a e8aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6a)) {
            return false;
        }
        m6a m6aVar = (m6a) obj;
        return u890.j(this.a, m6aVar.a) && this.b.equals(m6aVar.b) && u890.j(this.c, m6aVar.c) && this.d == m6aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
