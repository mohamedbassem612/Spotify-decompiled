package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u18 implements w18 {
    public final String a;
    public final String b;
    public final String c;

    public u18(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u18)) {
            return false;
        }
        u18 u18Var = (u18) obj;
        return this.a.equals(u18Var.a) && this.b.equals(u18Var.b) && this.c.equals(u18Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
