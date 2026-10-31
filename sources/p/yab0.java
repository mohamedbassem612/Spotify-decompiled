package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yab0 {
    public final String a;
    public final String b;
    public final boolean c;

    public yab0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yab0)) {
            return false;
        }
        yab0 yab0Var = (yab0) obj;
        return this.a.equals(yab0Var.a) && this.b.equals(yab0Var.b) && this.c == yab0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
