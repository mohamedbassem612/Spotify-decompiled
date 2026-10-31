package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p070 implements q070 {
    public final String a;
    public final int b;

    public p070(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p070)) {
            return false;
        }
        p070 p070Var = (p070) obj;
        return this.a.equals(p070Var.a) && this.b == p070Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
