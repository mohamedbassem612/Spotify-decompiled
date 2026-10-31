package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a5h implements b5h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a5h(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5h)) {
            return false;
        }
        a5h a5hVar = (a5h) obj;
        return this.a.equals(a5hVar.a) && u890.j(this.b, a5hVar.b) && u890.j(this.c, a5hVar.c) && this.d.equals(a5hVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
