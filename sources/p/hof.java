package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hof extends jof {
    public final String a;
    public final List b;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public hof(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hof)) {
            return false;
        }
        hof hofVar = (hof) obj;
        return u890.j(this.a, hofVar.a) && u890.j(this.b, hofVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
