package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class whb0 implements xhb0 {
    public final boolean a;
    public final String b;

    public whb0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whb0)) {
            return false;
        }
        whb0 whb0Var = (whb0) obj;
        return this.a == whb0Var.a && u890.j(this.b, whb0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ whb0() {
        this(false, null);
    }
}
