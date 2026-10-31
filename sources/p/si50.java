package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class si50 {
    public final String a;
    public final String b;
    public final w4i1 c;
    public final c380 d;
    public final int e;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public si50(String str, String str2, w4i1 w4i1Var, c380 c380Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = w4i1Var;
        this.d = c380Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si50)) {
            return false;
        }
        si50 si50Var = (si50) obj;
        return u890.j(this.a, si50Var.a) && u890.j(this.b, si50Var.b) && u890.j(this.c, si50Var.c) && u890.j(this.d, si50Var.d) && this.e == si50Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.e) + kk0.f(this.d, ydh.d(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 961, 31), 31);
    }
}
