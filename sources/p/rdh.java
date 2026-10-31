package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class rdh {
    public static final jdh Companion = new jdh();
    public final String a;
    public final uga0 b;

    public /* synthetic */ rdh(int i, String str, uga0 uga0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uga0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdh)) {
            return false;
        }
        rdh rdhVar = (rdh) obj;
        return u890.j(this.a, rdhVar.a) && u890.j(this.b, rdhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        uga0 uga0Var = this.b;
        return iHashCode + (uga0Var != null ? uga0Var.a.hashCode() : 0);
    }
}
