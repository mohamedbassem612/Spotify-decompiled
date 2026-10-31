package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zj50 implements ak50 {
    public static final zj50 a = new zj50();
    public static final Parcelable.Creator<zj50> CREATOR = new n750((byte) 28);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zj50);
    }

    public final int hashCode() {
        return 1100201045;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
