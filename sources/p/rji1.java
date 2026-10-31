package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class rji1 {
    public static final qji1 Companion = new qji1();
    public final boolean a;
    public final String b;

    public /* synthetic */ rji1(String str, int i, boolean z) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, pji1.a.getDescriptor());
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rji1)) {
            return false;
        }
        rji1 rji1Var = (rji1) obj;
        return this.a == rji1Var.a && u890.j(this.b, rji1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
