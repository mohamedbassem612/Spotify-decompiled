package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cj1 extends ej1 {
    public final w4i1 a;
    public final int b;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public cj1(int i, w4i1 w4i1Var) {
        this.a = w4i1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj1)) {
            return false;
        }
        cj1 cj1Var = (cj1) obj;
        return u890.j(this.a, cj1Var.a) && this.b == cj1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
