package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ewm implements gwm {
    public static final ewm a = new ewm();
    public static final Parcelable.Creator<ewm> CREATOR = new rtm((byte) 6);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ewm);
    }

    public final int hashCode() {
        return -1749918946;
    }

    public final String toString() {
        return "OptedOut";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
