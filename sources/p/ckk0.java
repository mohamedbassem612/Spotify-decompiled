package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ckk0 implements ikk0 {
    public final jez a;
    public final int b;

    public ckk0(jez jezVar, int i) {
        this.a = jezVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckk0)) {
            return false;
        }
        ckk0 ckk0Var = (ckk0) obj;
        return this.a == ckk0Var.a && this.b == ckk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
