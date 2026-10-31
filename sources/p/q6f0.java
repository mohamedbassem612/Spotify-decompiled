package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q6f0 {
    public final String a;
    public final String b;

    public q6f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6f0)) {
            return false;
        }
        q6f0 q6f0Var = (q6f0) obj;
        return u890.j(this.a, q6f0Var.a) && u890.j(this.b, q6f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
