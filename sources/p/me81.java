package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class me81 {
    public final int a;
    public final String b;

    public me81(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me81)) {
            return false;
        }
        me81 me81Var = (me81) obj;
        return this.a == me81Var.a && u890.j(this.b, me81Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
