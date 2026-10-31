package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class po10 implements qo10 {
    public static final po10 a = new po10();
    public static final Parcelable.Creator<po10> CREATOR = new no10((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof po10);
    }

    public final int hashCode() {
        return 385367295;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
