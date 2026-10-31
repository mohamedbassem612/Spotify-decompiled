package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class df91 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public df91(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df91)) {
            return false;
        }
        df91 df91Var = (df91) obj;
        return u890.j(this.c, df91Var.c) && this.d.equals(df91Var.d) && this.e.equals(df91Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return "slotTriggerFailed";
    }

    public final String q() {
        return this.c;
    }

    public final String s() {
        return this.f;
    }
}
