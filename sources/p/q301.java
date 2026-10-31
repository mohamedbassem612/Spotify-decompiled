package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q301 implements y301 {
    public final String a;
    public final int b;

    public q301(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q301)) {
            return false;
        }
        q301 q301Var = (q301) obj;
        return this.a.equals(q301Var.a) && this.b == q301Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
