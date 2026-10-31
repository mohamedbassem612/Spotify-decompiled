package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class src implements vrc {
    public static final src a = new src();
    public static final Parcelable.Creator<src> CREATOR = new yyb((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof src);
    }

    public final int hashCode() {
        return 1081716253;
    }

    public final String toString() {
        return "LoadFailed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
