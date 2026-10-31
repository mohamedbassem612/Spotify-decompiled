package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dju {
    public final List a;
    public final String b;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public dju(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dju)) {
            return false;
        }
        dju djuVar = (dju) obj;
        return this.a.equals(djuVar.a) && u890.j(this.b, djuVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
