package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e8j0 implements f8j0 {
    public static final e8j0 a = new e8j0();
    public static final Parcelable.Creator<e8j0> CREATOR = new rqi0((byte) 24);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e8j0);
    }

    public final int hashCode() {
        return 491084245;
    }

    public final String toString() {
        return "FeatureDisabled";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
