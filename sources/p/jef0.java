package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jef0 {
    public final String a;
    public final String b;
    public final String c;

    public jef0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jef0)) {
            return false;
        }
        jef0 jef0Var = (jef0) obj;
        return this.a.equals(jef0Var.a) && this.b.equals(jef0Var.b) && u890.j(this.c, jef0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
