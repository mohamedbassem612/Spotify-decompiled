package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jrt0 implements urt0 {
    public static final jrt0 a = new jrt0();
    public static final Parcelable.Creator<jrt0> CREATOR = new brt0((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jrt0);
    }

    public final int hashCode() {
        return 869345376;
    }

    public final String toString() {
        return "Paused";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
