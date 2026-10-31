package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jy31 implements ly31 {
    public static final jy31 a = new jy31();
    public static final Parcelable.Creator<jy31> CREATOR = new xw31((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jy31);
    }

    public final int hashCode() {
        return 1695045496;
    }

    public final String toString() {
        return "NoSelection";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
