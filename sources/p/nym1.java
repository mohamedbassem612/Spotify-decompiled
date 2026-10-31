package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nym1 {
    public final int a;
    public final String b;

    public nym1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nym1)) {
            return false;
        }
        nym1 nym1Var = (nym1) obj;
        return this.a == nym1Var.a && this.b.equals(nym1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
