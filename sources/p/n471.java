package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n471 extends o571 {
    public static final n471 d = new n471(null, "spotify-on-platform-create-group");
    public static final Parcelable.Creator<n471> CREATOR = new hs61((byte) 29);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n471);
    }

    public final int hashCode() {
        return 181623113;
    }

    public final String toString() {
        return "CreateGroup";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
