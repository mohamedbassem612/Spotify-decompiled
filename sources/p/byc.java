package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class byc {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public byc(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byc)) {
            return false;
        }
        byc bycVar = (byc) obj;
        return this.a == bycVar.a && this.b.equals(bycVar.b) && this.c.equals(bycVar.c) && this.d.equals(bycVar.d) && this.e.equals(bycVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
