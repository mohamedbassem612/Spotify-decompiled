package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eb81 {
    public final String a;
    public final String b;
    public final String c;

    public eb81(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb81)) {
            return false;
        }
        eb81 eb81Var = (eb81) obj;
        return this.a.equals(eb81Var.a) && u890.j(this.b, eb81Var.b) && this.c.equals(eb81Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
