package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ux61 {
    public final String a;
    public final String b;
    public final long c;
    public final w4i1 d;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public ux61(String str, String str2, long j, w4i1 w4i1Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux61)) {
            return false;
        }
        ux61 ux61Var = (ux61) obj;
        return this.a.equals(ux61Var.a) && this.b.equals(ux61Var.b) && this.c == ux61Var.c && u890.j(this.d, ux61Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
