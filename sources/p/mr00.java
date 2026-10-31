package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mr00 implements z0i {
    public final String a;
    public final boolean b;
    public final String c;

    public mr00(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr00)) {
            return false;
        }
        mr00 mr00Var = (mr00) obj;
        return this.a.equals(mr00Var.a) && this.b == mr00Var.b && this.c.equals(mr00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
