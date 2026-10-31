package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zc60 implements gd60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public zc60(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc60)) {
            return false;
        }
        zc60 zc60Var = (zc60) obj;
        return this.a.equals(zc60Var.a) && this.b.equals(zc60Var.b) && this.c.equals(zc60Var.c) && this.d.equals(zc60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
