package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z851 extends d951 {
    public static final Parcelable.Creator<z851> CREATOR = new uo41((byte) 23);
    public final pvp0 a;

    public z851(pvp0 pvp0Var) {
        this.a = pvp0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z851) && u890.j(this.a, ((z851) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
