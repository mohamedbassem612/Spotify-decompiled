package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m7c {
    public final String a;
    public final String b;
    public final String c;

    public m7c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7c)) {
            return false;
        }
        m7c m7cVar = (m7c) obj;
        return u890.j(this.a, m7cVar.a) && u890.j(this.b, m7cVar.b) && u890.j(this.c, m7cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
