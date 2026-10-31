package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cd11 {
    public final String a;
    public final String b;
    public final String c;

    public cd11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd11)) {
            return false;
        }
        cd11 cd11Var = (cd11) obj;
        return this.a.equals(cd11Var.a) && this.b.equals(cd11Var.b) && this.c.equals(cd11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
