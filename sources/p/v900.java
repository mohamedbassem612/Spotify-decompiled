package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v900 {
    public final String a;
    public final String b;
    public final String c;

    public v900(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v900)) {
            return false;
        }
        v900 v900Var = (v900) obj;
        return this.a.equals(v900Var.a) && this.b.equals(v900Var.b) && this.c.equals(v900Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
