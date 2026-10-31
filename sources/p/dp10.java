package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dp10 implements ep10 {
    public static final dp10 a = new dp10();
    public static final Parcelable.Creator<dp10> CREATOR = new no10((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dp10);
    }

    public final int hashCode() {
        return -616861599;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
