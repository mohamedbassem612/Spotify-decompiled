package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mbx0 extends nbx0 {
    public static final mbx0 a = new mbx0();
    public static final Parcelable.Creator<mbx0> CREATOR = new wvw0((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mbx0);
    }

    public final int hashCode() {
        return 1581124188;
    }

    public final String toString() {
        return "UNKNOWN";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
