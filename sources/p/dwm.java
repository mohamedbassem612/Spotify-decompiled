package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dwm implements gwm {
    public static final dwm a = new dwm();
    public static final Parcelable.Creator<dwm> CREATOR = new rtm((byte) 5);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dwm);
    }

    public final int hashCode() {
        return -256724791;
    }

    public final String toString() {
        return "Left";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
