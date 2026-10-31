package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nlv implements Parcelable {
    public static final nlv a = new nlv();
    public static final Parcelable.Creator<nlv> CREATOR = new s5v((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nlv);
    }

    public final int hashCode() {
        return 2020616790;
    }

    public final String toString() {
        return "Christmas";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
