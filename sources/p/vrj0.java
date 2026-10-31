package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vrj0 {
    public final String a;
    public final String b;
    public final Object c;
    public final String d;

    public vrj0(String str, String str2, Object obj, String str3) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrj0)) {
            return false;
        }
        vrj0 vrj0Var = (vrj0) obj;
        return u890.j(this.a, vrj0Var.a) && this.b.equals(vrj0Var.b) && this.c.equals(vrj0Var.c) && this.d.equals(vrj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
