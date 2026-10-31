package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t69 implements w69 {
    public static final t69 a = new t69();
    public static final Parcelable.Creator<t69> CREATOR = new so8((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t69);
    }

    public final int hashCode() {
        return 1014205335;
    }

    public final String toString() {
        return "Linear";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
