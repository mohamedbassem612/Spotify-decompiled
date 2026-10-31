package p;

import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jye implements nye {
    public final ArrayList a;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public jye(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jye) && this.a.equals(((jye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
