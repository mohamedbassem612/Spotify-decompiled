package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vi71 extends wi71 {
    public static final vi71 a = new vi71();
    public static final Parcelable.Creator<vi71> CREATOR = new ff71((byte) 12);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vi71);
    }

    public final int hashCode() {
        return -1138523421;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
