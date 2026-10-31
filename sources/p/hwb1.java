package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hwb1 implements iwb1 {
    public static final hwb1 a = new hwb1();
    public static final Parcelable.Creator<hwb1> CREATOR = new yub1((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hwb1);
    }

    public final int hashCode() {
        return 2082755207;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
