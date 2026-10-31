package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q471 extends o571 {
    public static final q471 d = new q471(8, "facebook-feed");
    public static final Parcelable.Creator<q471> CREATOR = new o471((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q471);
    }

    public final int hashCode() {
        return -219072546;
    }

    public final String toString() {
        return "FacebookFeed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
