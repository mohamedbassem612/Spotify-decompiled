package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bm7 {
    public final String a;
    public final String b;
    public final String c;

    public bm7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm7)) {
            return false;
        }
        bm7 bm7Var = (bm7) obj;
        return this.a.equals(bm7Var.a) && this.b.equals(bm7Var.b) && this.c.equals(bm7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
