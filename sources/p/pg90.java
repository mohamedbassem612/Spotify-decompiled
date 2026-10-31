package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pg90 implements sg90 {
    public static final pg90 a = new pg90();
    public static final Parcelable.Creator<pg90> CREATOR = new xl80((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pg90);
    }

    public final int hashCode() {
        return 258243310;
    }

    public final String toString() {
        return "Remove";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
