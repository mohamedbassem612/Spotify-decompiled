package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ik20 {
    public final int a;
    public final String b;

    public ik20(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik20)) {
            return false;
        }
        ik20 ik20Var = (ik20) obj;
        return this.a == ik20Var.a && this.b.equals(ik20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
