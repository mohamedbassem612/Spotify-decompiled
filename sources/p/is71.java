package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class is71 {
    public final String a;
    public final List b;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public is71(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is71)) {
            return false;
        }
        is71 is71Var = (is71) obj;
        return u890.j(this.a, is71Var.a) && u890.j(this.b, is71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
