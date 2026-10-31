package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ahy extends mhy {
    public static final ahy a = new ahy();
    public static final Parcelable.Creator<ahy> CREATOR = new utx((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ahy);
    }

    public final int hashCode() {
        return -468412227;
    }

    public final String toString() {
        return "DSABanner";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
