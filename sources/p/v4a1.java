package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v4a1 implements w4a1 {
    public final int a;
    public final String b;

    public v4a1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4a1)) {
            return false;
        }
        v4a1 v4a1Var = (v4a1) obj;
        return this.a == v4a1Var.a && u890.j(this.b, v4a1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
