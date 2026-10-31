package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dnb1 implements pnb1 {
    public static final dnb1 a = new dnb1();
    public static final Parcelable.Creator<dnb1> CREATOR = new olb1((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dnb1);
    }

    public final int hashCode() {
        return -673985694;
    }

    public final String toString() {
        return "Redirected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
