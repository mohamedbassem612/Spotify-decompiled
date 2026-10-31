package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gs10 implements hs10 {
    public static final gs10 a = new gs10();
    public static final Parcelable.Creator<gs10> CREATOR = new no10((byte) 17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gs10);
    }

    public final int hashCode() {
        return 1510559815;
    }

    public final String toString() {
        return "ThumbsUp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
