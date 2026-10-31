package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class t8h0 {
    public static final s8h0 Companion = new s8h0();
    public final String a;
    public final String b;

    public /* synthetic */ t8h0(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "ANDROID" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8h0)) {
            return false;
        }
        t8h0 t8h0Var = (t8h0) obj;
        return u890.j(this.a, t8h0Var.a) && u890.j(this.b, t8h0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public t8h0(String str) {
        this.a = "ANDROID";
        this.b = str;
    }
}
