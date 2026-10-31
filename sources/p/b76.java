package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b76 implements m86 {
    public final String a;
    public final String b;
    public final String c;

    public b76(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b76)) {
            return false;
        }
        b76 b76Var = (b76) obj;
        return this.a.equals(b76Var.a) && this.b.equals(b76Var.b) && u890.j(this.c, b76Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
