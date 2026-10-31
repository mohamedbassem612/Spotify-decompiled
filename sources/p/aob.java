package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aob {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public aob(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof aob)) {
            return false;
        }
        aob aobVar = (aob) obj;
        return u890.j(this.a, aobVar.a) && this.b.equals(aobVar.b) && this.c.equals(aobVar.c) && this.d.equals(aobVar.d) && this.e.equals(aobVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
