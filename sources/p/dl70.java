package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dl70 {
    public final hux a;
    public final String b;
    public final String c;

    public dl70(String str, String str2, hux huxVar) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl70)) {
            return false;
        }
        dl70 dl70Var = (dl70) obj;
        return u890.j(this.a, dl70Var.a) && u890.j(this.b, dl70Var.b) && u890.j(this.c, dl70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
