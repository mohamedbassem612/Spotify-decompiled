package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zro0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public zro0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof zro0)) {
            return false;
        }
        zro0 zro0Var = (zro0) obj;
        return this.a.equals(zro0Var.a) && this.b.equals(zro0Var.b) && this.c.equals(zro0Var.c) && this.d.equals(zro0Var.d) && this.e.equals(zro0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
