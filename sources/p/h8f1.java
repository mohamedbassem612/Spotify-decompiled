package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h8f1 implements l8f1 {
    public final int a;
    public final String b;

    public h8f1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8f1)) {
            return false;
        }
        h8f1 h8f1Var = (h8f1) obj;
        return this.a == h8f1Var.a && this.b.equals(h8f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
