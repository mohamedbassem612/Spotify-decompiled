package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mx20 extends nx20 {
    public static final mx20 d = new mx20(blc0.FMA_UPSELL_TRACK_SELECT_SEARCH);
    public static final Parcelable.Creator<mx20> CREATOR = new ix20((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mx20);
    }

    public final int hashCode() {
        return -1595859576;
    }

    public final String toString() {
        return "TrackSelectSearch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
