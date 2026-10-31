package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q0s0 {
    public final int a;
    public final String b;

    public q0s0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0s0)) {
            return false;
        }
        q0s0 q0s0Var = (q0s0) obj;
        return this.a == q0s0Var.a && u890.j(this.b, q0s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
