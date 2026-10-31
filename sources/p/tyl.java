package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tyl {
    public final String a;
    public final String b;
    public final String c;

    public tyl(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyl)) {
            return false;
        }
        tyl tylVar = (tyl) obj;
        return this.a.equals(tylVar.a) && this.b.equals(tylVar.b) && this.c.equals(tylVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
