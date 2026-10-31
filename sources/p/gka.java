package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gka {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public gka(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof gka)) {
            return false;
        }
        gka gkaVar = (gka) obj;
        return this.a.equals(gkaVar.a) && this.b.equals(gkaVar.b) && this.c.equals(gkaVar.c) && this.d.equals(gkaVar.d) && this.e.equals(gkaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
