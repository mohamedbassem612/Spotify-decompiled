package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q9h0 implements cah0 {
    public final String a;
    public final String b;

    public q9h0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9h0)) {
            return false;
        }
        q9h0 q9h0Var = (q9h0) obj;
        return this.a.equals(q9h0Var.a) && this.b.equals(q9h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
