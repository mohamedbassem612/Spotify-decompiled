package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class szi0 extends tzi0 {
    public static final szi0 a = new szi0();
    public static final Parcelable.Creator<szi0> CREATOR = new rqi0((byte) 5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof szi0);
    }

    public final int hashCode() {
        return 714046099;
    }

    public final String toString() {
        return "Initial";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
