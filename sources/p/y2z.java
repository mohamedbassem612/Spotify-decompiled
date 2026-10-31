package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y2z implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public y2z(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof y2z)) {
            return false;
        }
        y2z y2zVar = (y2z) obj;
        return this.a.equals(y2zVar.a) && this.b.equals(y2zVar.b) && this.c.equals(y2zVar.c) && this.d.equals(y2zVar.d) && this.e.equals(y2zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
