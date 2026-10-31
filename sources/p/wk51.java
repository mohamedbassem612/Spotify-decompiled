package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wk51 {
    public final CharSequence a;
    public final xk51 b;
    public final String c;

    public wk51(CharSequence charSequence, xk51 xk51Var, String str) {
        this.a = charSequence;
        this.b = xk51Var;
        this.c = str;
    }

    public static wk51 a(wk51 wk51Var, String str, xk51 xk51Var, String str2, int i) {
        CharSequence charSequence = str;
        if ((i & 1) != 0) {
            charSequence = wk51Var.a;
        }
        if ((i & 2) != 0) {
            xk51Var = wk51Var.b;
        }
        if ((i & 4) != 0) {
            str2 = wk51Var.c;
        }
        wk51Var.getClass();
        return new wk51(charSequence, xk51Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk51)) {
            return false;
        }
        wk51 wk51Var = (wk51) obj;
        return u890.j(this.a, wk51Var.a) && this.b == wk51Var.b && u890.j(this.c, wk51Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ wk51(int i, CharSequence charSequence) {
        this(charSequence, xk51.a, null);
    }
}
