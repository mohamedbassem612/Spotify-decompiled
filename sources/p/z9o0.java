package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z9o0 {
    public final String a;
    public final int b;

    public z9o0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9o0)) {
            return false;
        }
        z9o0 z9o0Var = (z9o0) obj;
        return this.a.equals(z9o0Var.a) && this.b == z9o0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
