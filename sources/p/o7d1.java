package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o7d1 {
    public final String a;
    public final String b;
    public final boolean c;

    public o7d1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7d1)) {
            return false;
        }
        o7d1 o7d1Var = (o7d1) obj;
        return this.a.equals(o7d1Var.a) && this.b.equals(o7d1Var.b) && this.c == o7d1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
