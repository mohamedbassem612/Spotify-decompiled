package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bl extends kl {
    public static final bl b = new bl(false);
    public static final Parcelable.Creator<bl> CREATOR = new ad((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bl);
    }

    public final int hashCode() {
        return 1366720384;
    }

    public final String toString() {
        return "Education";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
