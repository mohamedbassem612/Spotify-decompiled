package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d58 implements e58 {
    public final String a;
    public final String b;
    public final String c;

    public d58(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d58)) {
            return false;
        }
        d58 d58Var = (d58) obj;
        return this.a.equals(d58Var.a) && this.b.equals(d58Var.b) && this.c.equals(d58Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
