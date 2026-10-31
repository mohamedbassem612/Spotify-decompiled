package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ebx0 extends nbx0 {
    public static final ebx0 a = new ebx0();
    public static final Parcelable.Creator<ebx0> CREATOR = new wvw0((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ebx0);
    }

    public final int hashCode() {
        return 1844527102;
    }

    public final String toString() {
        return "BLOCKED";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
