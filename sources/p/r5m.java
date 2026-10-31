package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r5m extends e6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public r5m(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5m)) {
            return false;
        }
        r5m r5mVar = (r5m) obj;
        return this.a.equals(r5mVar.a) && this.b.equals(r5mVar.b) && this.c.equals(r5mVar.c) && this.d.equals(r5mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
