package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wd10 implements xd10 {
    public static final wd10 a = new wd10();
    public static final Parcelable.Creator<wd10> CREATOR = new qn00((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wd10);
    }

    public final int hashCode() {
        return -1693667252;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
