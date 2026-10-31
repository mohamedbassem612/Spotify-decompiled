package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bxc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public bxc(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof bxc)) {
            return false;
        }
        bxc bxcVar = (bxc) obj;
        return this.a.equals(bxcVar.a) && this.b.equals(bxcVar.b) && this.c.equals(bxcVar.c) && this.d.equals(bxcVar.d) && this.e.equals(bxcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
