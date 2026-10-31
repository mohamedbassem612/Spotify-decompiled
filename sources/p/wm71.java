package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wm71 extends xm71 {
    public static final wm71 b = new wm71("screenshot");
    public static final Parcelable.Creator<wm71> CREATOR = new ff71((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wm71);
    }

    public final int hashCode() {
        return -1802501298;
    }

    public final String toString() {
        return "Screenshot";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
