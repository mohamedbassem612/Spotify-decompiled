package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ko10 implements mo10 {
    public static final ko10 a = new ko10();
    public static final Parcelable.Creator<ko10> CREATOR = new qn00((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ko10);
    }

    public final int hashCode() {
        return -1829438770;
    }

    public final String toString() {
        return "Following";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
