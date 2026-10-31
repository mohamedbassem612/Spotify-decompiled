package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nyp0 {
    public final String a;
    public final String b;
    public final String c;

    public nyp0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyp0)) {
            return false;
        }
        nyp0 nyp0Var = (nyp0) obj;
        return this.a.equals(nyp0Var.a) && this.b.equals(nyp0Var.b) && this.c.equals(nyp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
