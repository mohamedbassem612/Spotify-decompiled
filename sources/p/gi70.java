package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gi70 extends ji70 {
    public static final gi70 c = new gi70(23, 1);
    public static final Parcelable.Creator<gi70> CREATOR = new ai70((byte) 5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gi70);
    }

    public final int hashCode() {
        return -257873671;
    }

    public final String toString() {
        return "AskToUpgradeGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
