package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dl extends kl {
    public static final dl b = new dl(true);
    public static final Parcelable.Creator<dl> CREATOR = new ad((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dl);
    }

    public final int hashCode() {
        return 50134355;
    }

    public final String toString() {
        return "ParentalControls";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
