package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class jq2 {
    public static final iq2 Companion = new iq2();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ jq2(String str, String str2, int i, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq2)) {
            return false;
        }
        jq2 jq2Var = (jq2) obj;
        return u890.j(this.a, jq2Var.a) && u890.j(this.b, jq2Var.b) && u890.j(this.c, jq2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
