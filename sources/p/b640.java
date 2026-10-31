package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b640 {
    public final String a;
    public final String b;
    public final String c;

    public b640(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b640)) {
            return false;
        }
        b640 b640Var = (b640) obj;
        return u890.j(this.a, b640Var.a) && u890.j(this.b, b640Var.b) && this.c.equals(b640Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
