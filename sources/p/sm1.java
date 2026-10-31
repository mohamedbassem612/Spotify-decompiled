package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sm1 {
    public final String a;
    public final int b;

    public sm1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm1)) {
            return false;
        }
        sm1 sm1Var = (sm1) obj;
        return u890.j(this.a, sm1Var.a) && this.b == sm1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
