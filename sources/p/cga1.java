package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cga1 implements dga1 {
    public final String a;
    public final String b;
    public final boolean c;

    public cga1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cga1)) {
            return false;
        }
        cga1 cga1Var = (cga1) obj;
        return this.a.equals(cga1Var.a) && this.b.equals(cga1Var.b) && this.c == cga1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
