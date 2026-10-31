package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kx31 extends nx31 {
    public static final kx31 a = new kx31();
    public static final Parcelable.Creator<kx31> CREATOR = new xw31((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kx31);
    }

    public final int hashCode() {
        return 220791220;
    }

    public final String toString() {
        return "ContextNotSupported";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
