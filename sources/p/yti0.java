package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yti0 {
    public final String a;
    public final String b;
    public final String c;

    public yti0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yti0)) {
            return false;
        }
        yti0 yti0Var = (yti0) obj;
        return this.a.equals(yti0Var.a) && this.b.equals(yti0Var.b) && this.c.equals(yti0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
