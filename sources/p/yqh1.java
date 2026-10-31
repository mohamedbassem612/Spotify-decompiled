package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yqh1 {
    public final uqo a;
    public final String b;
    public final lax c;

    public yqh1(uqo uqoVar, String str, lax laxVar) {
        this.a = uqoVar;
        this.b = str;
        this.c = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqh1)) {
            return false;
        }
        yqh1 yqh1Var = (yqh1) obj;
        return this.a.equals(yqh1Var.a) && u890.j(this.b, yqh1Var.b) && this.c.equals(yqh1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
