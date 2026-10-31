package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q321 {
    public final String a;
    public final String b;

    public q321(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q321)) {
            return false;
        }
        q321 q321Var = (q321) obj;
        return this.a.equals(q321Var.a) && this.b.equals(q321Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
