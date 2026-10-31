package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lo10 implements mo10 {
    public static final lo10 a = new lo10();
    public static final Parcelable.Creator<lo10> CREATOR = new qn00((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lo10);
    }

    public final int hashCode() {
        return 483275649;
    }

    public final String toString() {
        return "Friend";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
