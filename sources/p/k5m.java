package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k5m extends e6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public k5m(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof k5m)) {
            return false;
        }
        k5m k5mVar = (k5m) obj;
        return this.a.equals(k5mVar.a) && this.b.equals(k5mVar.b) && this.c.equals(k5mVar.c) && this.d.equals(k5mVar.d) && this.e.equals(k5mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
