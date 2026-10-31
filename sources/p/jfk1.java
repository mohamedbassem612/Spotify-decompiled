package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jfk1 implements mfk1 {
    public static final jfk1 a = new jfk1();
    public static final Parcelable.Creator<jfk1> CREATOR = new nhj1((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jfk1);
    }

    public final int hashCode() {
        return -1306868593;
    }

    public final String toString() {
        return "Dismiss";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
