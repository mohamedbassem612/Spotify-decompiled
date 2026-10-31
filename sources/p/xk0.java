package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class xk0 {
    public static final wk0 Companion = new wk0();
    public final String a;
    public final String b;

    public /* synthetic */ xk0(int i, String str, String str2) {
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
        if (!(obj instanceof xk0)) {
            return false;
        }
        xk0 xk0Var = (xk0) obj;
        return u890.j(this.a, xk0Var.a) && u890.j(this.b, xk0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public xk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
