package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j741 extends k741 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j741(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j741)) {
            return false;
        }
        j741 j741Var = (j741) obj;
        return this.a.equals(j741Var.a) && this.b.equals(j741Var.b) && this.c.equals(j741Var.c) && this.d.equals(j741Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
