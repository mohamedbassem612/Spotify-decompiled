package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w9h1 {
    public final String a;
    public final int b;

    public w9h1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9h1)) {
            return false;
        }
        w9h1 w9h1Var = (w9h1) obj;
        return u890.j(this.a, w9h1Var.a) && this.b == w9h1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
