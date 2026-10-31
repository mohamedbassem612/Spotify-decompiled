package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ujo0 {
    public final String a;
    public final String b;
    public final String c;

    public ujo0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujo0)) {
            return false;
        }
        ujo0 ujo0Var = (ujo0) obj;
        return this.a.equals(ujo0Var.a) && this.b.equals(ujo0Var.b) && this.c.equals(ujo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
