package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o8q0 implements p8q0 {
    public final String a;
    public final String b;
    public final String c;

    public o8q0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8q0)) {
            return false;
        }
        o8q0 o8q0Var = (o8q0) obj;
        return this.a.equals(o8q0Var.a) && this.b.equals(o8q0Var.b) && this.c.equals(o8q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
