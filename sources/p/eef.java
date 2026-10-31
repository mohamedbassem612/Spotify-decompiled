package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eef implements fef {
    public final List a;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public eef(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eef) && u890.j(this.a, ((eef) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
