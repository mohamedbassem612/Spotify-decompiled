package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q4w0 {
    public final String a;
    public final int b;

    public q4w0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4w0)) {
            return false;
        }
        q4w0 q4w0Var = (q4w0) obj;
        return this.a.equals(q4w0Var.a) && this.b == q4w0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
