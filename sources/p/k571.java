package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k571 extends o571 {
    public static final k571 d = new k571(null, "spotify-on-platform-users-nearby");
    public static final Parcelable.Creator<k571> CREATOR = new o471((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k571);
    }

    public final int hashCode() {
        return 43955469;
    }

    public final String toString() {
        return "UsersNearby";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
