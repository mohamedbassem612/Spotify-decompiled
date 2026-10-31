package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g571 extends o571 {
    public static final g571 d = new g571(1, "snapchat-lens");
    public static final Parcelable.Creator<g571> CREATOR = new o471((byte) 17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g571);
    }

    public final int hashCode() {
        return 89204424;
    }

    public final String toString() {
        return "SnapchatLenses";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
