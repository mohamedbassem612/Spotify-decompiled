package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uvi0 implements vvi0 {
    public final String a;
    public final iu30 b;

    public uvi0(String str, iu30 iu30Var) {
        this.a = str;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvi0)) {
            return false;
        }
        uvi0 uvi0Var = (uvi0) obj;
        return this.a.equals(uvi0Var.a) && this.b.equals(uvi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
