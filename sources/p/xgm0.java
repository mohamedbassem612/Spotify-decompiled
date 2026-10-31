package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xgm0 implements jhm0 {
    public static final xgm0 a = new xgm0();
    public static final Parcelable.Creator<xgm0> CREATOR = new fgm0((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xgm0);
    }

    public final int hashCode() {
        return -682753767;
    }

    public final String toString() {
        return "PreloadError";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
