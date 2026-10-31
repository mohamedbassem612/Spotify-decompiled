package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z471 extends o571 {
    public static final z471 d = new z471(17, "native-share-menu");
    public static final Parcelable.Creator<z471> CREATOR = new o471((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z471);
    }

    public final int hashCode() {
        return -1478931537;
    }

    public final String toString() {
        return "More";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
