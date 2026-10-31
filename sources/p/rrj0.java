package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rrj0 {
    public final int a;
    public final String b;

    public rrj0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrj0)) {
            return false;
        }
        rrj0 rrj0Var = (rrj0) obj;
        return this.a == rrj0Var.a && u890.j(this.b, rrj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
