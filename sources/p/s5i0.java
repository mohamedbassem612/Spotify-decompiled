package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s5i0 implements t5i0 {
    public static final s5i0 a = new s5i0();
    public static final Parcelable.Creator<s5i0> CREATOR = new cyh0((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s5i0);
    }

    public final int hashCode() {
        return 573260745;
    }

    public final String toString() {
        return "Unavailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
