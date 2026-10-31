package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iy31 implements ly31 {
    public static final iy31 a = new iy31();
    public static final Parcelable.Creator<iy31> CREATOR = new xw31((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iy31);
    }

    public final int hashCode() {
        return 770261708;
    }

    public final String toString() {
        return "MaxSelected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
