package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l4j0 implements q4j0 {
    public static final l4j0 a = new l4j0();
    public static final Parcelable.Creator<l4j0> CREATOR = new rqi0((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l4j0);
    }

    public final int hashCode() {
        return 1184834313;
    }

    public final String toString() {
        return "BottomSheet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
