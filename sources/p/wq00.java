package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wq00 implements yq00 {
    public static final wq00 a = new wq00();
    public static final Parcelable.Creator<wq00> CREATOR = new qn00((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wq00);
    }

    public final int hashCode() {
        return 182417657;
    }

    public final String toString() {
        return "Free";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
