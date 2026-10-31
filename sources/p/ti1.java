package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ti1 implements vi1 {
    public final String a;
    public final List b;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public ti1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti1)) {
            return false;
        }
        ti1 ti1Var = (ti1) obj;
        return u890.j(this.a, ti1Var.a) && this.b.equals(ti1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
