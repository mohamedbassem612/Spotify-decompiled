package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ifo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ifo(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifo)) {
            return false;
        }
        ifo ifoVar = (ifo) obj;
        return u890.j(this.a, ifoVar.a) && u890.j(this.b, ifoVar.b) && u890.j(this.c, ifoVar.c) && u890.j(this.d, ifoVar.d) && u890.j(this.e, ifoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
