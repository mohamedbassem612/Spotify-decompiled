package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t471 extends o571 {
    public static final t471 d = new t471(null, "spotify-on-platform-group");
    public static final Parcelable.Creator<t471> CREATOR = new o471((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t471);
    }

    public final int hashCode() {
        return 1392308581;
    }

    public final String toString() {
        return "Group";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
