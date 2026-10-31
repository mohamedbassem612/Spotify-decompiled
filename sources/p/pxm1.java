package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pxm1 implements Parcelable {
    public static final pxm1 a = new pxm1();
    public static final Parcelable.Creator<pxm1> CREATOR = new ynm1((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pxm1);
    }

    public final int hashCode() {
        return -1995883392;
    }

    public final String toString() {
        return "EditCompleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
