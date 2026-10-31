package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dat {
    public final String a;
    public final String b;
    public final String c;

    public dat(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dat)) {
            return false;
        }
        dat datVar = (dat) obj;
        return u890.j(this.a, datVar.a) && u890.j(this.b, datVar.b) && u890.j(this.c, datVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public /* synthetic */ dat() {
        this("", "", "");
    }
}
