package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yj50 implements ak50 {
    public static final Parcelable.Creator<yj50> CREATOR = new n750((byte) 27);
    public final c380 a;

    public yj50(c380 c380Var) {
        this.a = c380Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yj50) && u890.j(this.a, ((yj50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itL = x0d.l(this.a, parcel);
        while (itL.hasNext()) {
            ((xj50) itL.next()).writeToParcel(parcel, i);
        }
    }
}
