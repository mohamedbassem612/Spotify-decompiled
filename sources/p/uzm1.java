package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uzm1 {
    public final String a;
    public final String b;
    public final String c;

    public uzm1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzm1)) {
            return false;
        }
        uzm1 uzm1Var = (uzm1) obj;
        return this.a.equals(uzm1Var.a) && this.b.equals(uzm1Var.b) && this.c.equals(uzm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
