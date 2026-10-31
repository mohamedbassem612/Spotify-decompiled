package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k8g implements s8g {
    public static final k8g a = new k8g();
    public static final Parcelable.Creator<k8g> CREATOR = new i8g((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k8g);
    }

    public final int hashCode() {
        return -1413712135;
    }

    public final String toString() {
        return "SkippedToSpotify";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
