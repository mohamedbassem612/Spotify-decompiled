package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gye implements nye {
    public final String a;
    public final List b;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public gye(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gye)) {
            return false;
        }
        gye gyeVar = (gye) obj;
        return u890.j(this.a, gyeVar.a) && u890.j(this.b, gyeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
