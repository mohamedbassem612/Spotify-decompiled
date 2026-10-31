package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l8g implements s8g {
    public static final l8g a = new l8g();
    public static final Parcelable.Creator<l8g> CREATOR = new i8g((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l8g);
    }

    public final int hashCode() {
        return 211997808;
    }

    public final String toString() {
        return "SkippedToSpotifyNative";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
