package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q370 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public q370(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof q370)) {
            return false;
        }
        q370 q370Var = (q370) obj;
        return this.a.equals(q370Var.a) && this.b.equals(q370Var.b) && this.c.equals(q370Var.c) && this.d.equals(q370Var.d) && this.e.equals(q370Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
