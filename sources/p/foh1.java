package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class foh1 {
    public static final eoh1 Companion = new eoh1();
    public final Boolean a;
    public final String b;

    public /* synthetic */ foh1(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
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
        if (!(obj instanceof foh1)) {
            return false;
        }
        foh1 foh1Var = (foh1) obj;
        return u890.j(this.a, foh1Var.a) && u890.j(this.b, foh1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
