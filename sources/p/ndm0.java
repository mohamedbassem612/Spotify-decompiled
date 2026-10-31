package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ndm0 implements pdm0 {
    public static final ndm0 a = new ndm0();
    public static final Parcelable.Creator<ndm0> CREATOR = new w9k0((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ndm0);
    }

    public final int hashCode() {
        return 1958535600;
    }

    public final String toString() {
        return "None";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
