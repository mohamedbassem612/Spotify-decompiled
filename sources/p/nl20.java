package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nl20 {
    public static final nl20 e = new nl20(false, null, false, 1);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final int d;

    public nl20(boolean z, String str, boolean z2, int i) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl20)) {
            return false;
        }
        nl20 nl20Var = (nl20) obj;
        return this.a == nl20Var.a && u890.j(this.b, nl20Var.b) && this.c == nl20Var.c && this.d == nl20Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return l1d.C(this.d) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
