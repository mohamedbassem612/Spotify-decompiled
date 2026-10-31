package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w9r {
    public final String a;
    public final String b;
    public final String c;

    public w9r(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9r)) {
            return false;
        }
        w9r w9rVar = (w9r) obj;
        return u890.j(this.a, w9rVar.a) && this.b.equals(w9rVar.b) && this.c.equals(w9rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
