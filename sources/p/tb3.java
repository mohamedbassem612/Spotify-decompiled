package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tb3 {
    public final String a;
    public final String b;
    public final String c;

    public tb3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb3)) {
            return false;
        }
        tb3 tb3Var = (tb3) obj;
        return this.a.equals(tb3Var.a) && this.b.equals(tb3Var.b) && this.c.equals(tb3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
