package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y471 extends o571 {
    public static final y471 d = new y471(20, "linkedin");
    public static final Parcelable.Creator<y471> CREATOR = new o471((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y471);
    }

    public final int hashCode() {
        return -1840783240;
    }

    public final String toString() {
        return "LinkedIn";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
