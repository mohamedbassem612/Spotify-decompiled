package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cl extends kl {
    public static final cl b = new cl(true);
    public static final Parcelable.Creator<cl> CREATOR = new ad((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cl);
    }

    public final int hashCode() {
        return 555886225;
    }

    public final String toString() {
        return "Legal";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
