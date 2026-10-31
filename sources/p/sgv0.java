package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sgv0 implements Parcelable {
    public static final sgv0 a = new sgv0();
    public static final Parcelable.Creator<sgv0> CREATOR = new g0v0((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sgv0);
    }

    public final int hashCode() {
        return 1470971362;
    }

    public final String toString() {
        return "PostDownloadBottomSheetPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
