package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class to10 implements vo10 {
    public static final to10 a = new to10();
    public static final Parcelable.Creator<to10> CREATOR = new no10((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof to10);
    }

    public final int hashCode() {
        return 97493093;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
