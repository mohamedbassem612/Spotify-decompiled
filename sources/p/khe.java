package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class khe {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public khe(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khe)) {
            return false;
        }
        khe kheVar = (khe) obj;
        return this.a.equals(kheVar.a) && this.b.equals(kheVar.b) && this.c.equals(kheVar.c) && this.d.equals(kheVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
