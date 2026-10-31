package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hl extends kl {
    public static final hl b = new hl(false);
    public static final Parcelable.Creator<hl> CREATOR = new ad((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hl);
    }

    public final int hashCode() {
        return -2134676747;
    }

    public final String toString() {
        return "TransitionSubmit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
