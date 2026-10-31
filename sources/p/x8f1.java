package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x8f1 {
    public final String a;
    public final String b;
    public final int c;

    public x8f1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8f1)) {
            return false;
        }
        x8f1 x8f1Var = (x8f1) obj;
        return this.a.equals(x8f1Var.a) && u890.j(this.b, x8f1Var.b) && this.c == x8f1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
