package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uub1 implements vub1 {
    public static final uub1 a = new uub1();
    public static final Parcelable.Creator<uub1> CREATOR = new olb1((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uub1);
    }

    public final int hashCode() {
        return -1922509737;
    }

    public final String toString() {
        return "ShareList";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
