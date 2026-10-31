package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fa31 implements ha31 {
    public static final fa31 a = new fa31();
    public static final Parcelable.Creator<fa31> CREATOR = new s231((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fa31);
    }

    public final int hashCode() {
        return 778075921;
    }

    public final String toString() {
        return "OnReplaySelected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
