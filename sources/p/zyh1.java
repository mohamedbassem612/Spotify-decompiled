package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zyh1 {
    public final xyh1 a;
    public final String b;

    public zyh1(xyh1 xyh1Var, String str) {
        this.a = xyh1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyh1)) {
            return false;
        }
        zyh1 zyh1Var = (zyh1) obj;
        return this.a.equals(zyh1Var.a) && u890.j(this.b, zyh1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
