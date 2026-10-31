package p;

import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y1f implements q3f {
    public final Map a;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public y1f(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1f) && u890.j(this.a, ((y1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
