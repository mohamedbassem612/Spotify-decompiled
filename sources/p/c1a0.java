package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c1a0 implements d1a0 {
    public final int a;
    public final String b;

    public c1a0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1a0)) {
            return false;
        }
        c1a0 c1a0Var = (c1a0) obj;
        return this.a == c1a0Var.a && u890.j(this.b, c1a0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
