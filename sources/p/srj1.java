package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class srj1 {
    public static final rrj1 Companion = new rrj1();
    public final String a;
    public final String b;

    public /* synthetic */ srj1(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
        if (!(obj instanceof srj1)) {
            return false;
        }
        srj1 srj1Var = (srj1) obj;
        return u890.j(this.a, srj1Var.a) && u890.j(this.b, srj1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
