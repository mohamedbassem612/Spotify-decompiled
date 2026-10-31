package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q9v0 {
    public final String a;
    public final String b;

    public q9v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9v0)) {
            return false;
        }
        q9v0 q9v0Var = (q9v0) obj;
        return this.a.equals(q9v0Var.a) && this.b.equals(q9v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
