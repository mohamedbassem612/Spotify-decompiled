package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u1l1 extends j2l1 {
    public final int a;
    public final String b;

    public u1l1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1l1)) {
            return false;
        }
        u1l1 u1l1Var = (u1l1) obj;
        return this.a == u1l1Var.a && this.b.equals(u1l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
