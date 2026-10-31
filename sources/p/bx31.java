package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bx31 implements jx31 {
    public static final bx31 a = new bx31();
    public static final Parcelable.Creator<bx31> CREATOR = new xw31((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bx31);
    }

    public final int hashCode() {
        return 434300334;
    }

    public final String toString() {
        return "Fallback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
