package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class es10 implements hs10 {
    public static final es10 a = new es10();
    public static final Parcelable.Creator<es10> CREATOR = new no10((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof es10);
    }

    public final int hashCode() {
        return -1723285709;
    }

    public final String toString() {
        return "InStreamThumbsDown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
