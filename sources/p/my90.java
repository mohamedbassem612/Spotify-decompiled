package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class my90 implements ny90 {
    public final String a;
    public final String b;
    public final String c;

    public my90(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my90)) {
            return false;
        }
        my90 my90Var = (my90) obj;
        return u890.j(this.a, my90Var.a) && u890.j(this.b, my90Var.b) && u890.j(this.c, my90Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
