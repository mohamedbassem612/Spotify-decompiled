package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jw01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public jw01(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw01)) {
            return false;
        }
        jw01 jw01Var = (jw01) obj;
        return this.a.equals(jw01Var.a) && this.b.equals(jw01Var.b) && this.c.equals(jw01Var.c) && this.d.equals(jw01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
