package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sw10 extends uw10 {
    public final boolean a;
    public final String b;

    public sw10(String str, int i) {
        boolean z = (i & 1) == 0;
        str = (i & 2) != 0 ? null : str;
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw10)) {
            return false;
        }
        sw10 sw10Var = (sw10) obj;
        return this.a == sw10Var.a && u890.j(this.b, sw10Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
