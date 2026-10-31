package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class al extends kl {
    public static final al b = new al(false);
    public static final Parcelable.Creator<al> CREATOR = new ad((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof al);
    }

    public final int hashCode() {
        return 547881549;
    }

    public final String toString() {
        return "Coppa";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
