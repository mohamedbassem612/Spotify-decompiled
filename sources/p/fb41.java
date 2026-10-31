package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fb41 extends pb41 {
    public final boolean a;
    public final String b;
    public final String c;

    public fb41(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb41)) {
            return false;
        }
        fb41 fb41Var = (fb41) obj;
        return this.a == fb41Var.a && this.b.equals(fb41Var.b) && this.c.equals(fb41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
