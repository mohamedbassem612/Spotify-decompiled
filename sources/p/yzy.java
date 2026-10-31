package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yzy extends zzy {
    public static final yzy b = new yzy("parentalConsent");
    public static final Parcelable.Creator<yzy> CREATOR = new jhy((byte) 22);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yzy);
    }

    public final int hashCode() {
        return 456004748;
    }

    public final String toString() {
        return "ParentalConsent";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
