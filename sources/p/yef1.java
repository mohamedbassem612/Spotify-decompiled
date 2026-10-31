package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yef1 {
    public final String a;
    public final String b;
    public final String c;

    public yef1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yef1)) {
            return false;
        }
        yef1 yef1Var = (yef1) obj;
        return this.a.equals(yef1Var.a) && this.b.equals(yef1Var.b) && this.c.equals(yef1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
