package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q720 extends t720 {
    public final String a;
    public final int b;

    public q720(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q720)) {
            return false;
        }
        q720 q720Var = (q720) obj;
        return u890.j(this.a, q720Var.a) && this.b == q720Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
