package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c5g {
    public final String a;
    public final String b;
    public final String c;

    public c5g(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5g)) {
            return false;
        }
        c5g c5gVar = (c5g) obj;
        return this.a.equals(c5gVar.a) && this.b.equals(c5gVar.b) && u890.j(this.c, c5gVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
