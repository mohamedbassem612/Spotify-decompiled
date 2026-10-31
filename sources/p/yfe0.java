package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yfe0 {
    public final String a;
    public final String b;
    public final String c;

    public yfe0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfe0)) {
            return false;
        }
        yfe0 yfe0Var = (yfe0) obj;
        return this.a.equals(yfe0Var.a) && this.b.equals(yfe0Var.b) && this.c.equals(yfe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
