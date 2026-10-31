package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rvj0 implements uvj0 {
    public final jez a;
    public final int b;

    public rvj0(jez jezVar, int i) {
        this.a = jezVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvj0)) {
            return false;
        }
        rvj0 rvj0Var = (rvj0) obj;
        return this.a == rvj0Var.a && this.b == rvj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
