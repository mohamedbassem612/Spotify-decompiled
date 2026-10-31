package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tx71 implements vx71 {
    public final List a;
    public final String b;
    public final long c;
    public final int d;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public tx71(int i, long j, String str, List list) {
        this.a = list;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx71)) {
            return false;
        }
        tx71 tx71Var = (tx71) obj;
        return this.a.equals(tx71Var.a) && u890.j(this.b, tx71Var.b) && this.c == tx71Var.c && this.d == tx71Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.d) + cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }
}
