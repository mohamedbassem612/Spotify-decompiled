package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lb71 extends bc71 {
    public static final lb71 a = new lb71();
    public static final Parcelable.Creator<lb71> CREATOR = new v871((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lb71);
    }

    public final int hashCode() {
        return 1866466225;
    }

    public final String toString() {
        return "InternalLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
