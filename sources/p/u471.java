package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u471 extends o571 {
    public static final u471 d = new u471(5, "instagram-direct");
    public static final Parcelable.Creator<u471> CREATOR = new o471((byte) 5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u471);
    }

    public final int hashCode() {
        return -2006088093;
    }

    public final String toString() {
        return "InstagramDirectMessaging";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
