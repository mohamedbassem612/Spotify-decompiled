package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gf9 implements pf9 {
    public final String a;
    public final int b;

    public gf9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf9)) {
            return false;
        }
        gf9 gf9Var = (gf9) obj;
        return this.a.equals(gf9Var.a) && this.b == gf9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
