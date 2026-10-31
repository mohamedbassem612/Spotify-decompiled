package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1l1 extends j2l1 {
    public final int a;
    public final String b;

    public v1l1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1l1)) {
            return false;
        }
        v1l1 v1l1Var = (v1l1) obj;
        return this.a == v1l1Var.a && this.b.equals(v1l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
