package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r471 extends o571 {
    public static final r471 d = new r471(9, "facebook-messenger");
    public static final Parcelable.Creator<r471> CREATOR = new o471((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r471);
    }

    public final int hashCode() {
        return -1562455853;
    }

    public final String toString() {
        return "FacebookMessenger";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
