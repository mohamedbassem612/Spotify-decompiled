package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o4j0 implements q4j0 {
    public static final o4j0 a = new o4j0();
    public static final Parcelable.Creator<o4j0> CREATOR = new rqi0((byte) 17);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o4j0);
    }

    public final int hashCode() {
        return -877503472;
    }

    public final String toString() {
        return "Snackbar";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
