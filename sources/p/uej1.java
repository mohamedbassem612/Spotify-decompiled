package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uej1 extends vej1 {
    public final String a;
    public final String b;

    public uej1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uej1)) {
            return false;
        }
        uej1 uej1Var = (uej1) obj;
        return u890.j(this.a, uej1Var.a) && this.b.equals(uej1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
