package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jml implements mml {
    public static final jml a = new jml();
    public static final Parcelable.Creator<jml> CREATOR = new txk((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jml);
    }

    public final int hashCode() {
        return 732667847;
    }

    public final String toString() {
        return "Root";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
