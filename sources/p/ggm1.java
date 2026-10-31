package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ggm1 implements vgm1 {
    public static final ggm1 a = new ggm1();
    public static final Parcelable.Creator<ggm1> CREATOR = new lfm1((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ggm1);
    }

    public final int hashCode() {
        return 1258021573;
    }

    public final String toString() {
        return "FlareReady";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
