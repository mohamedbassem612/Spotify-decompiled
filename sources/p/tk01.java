package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tk01 implements xk01 {
    public static final tk01 a = new tk01();
    public static final Parcelable.Creator<tk01> CREATOR = new sj01((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tk01);
    }

    public final int hashCode() {
        return -1727738223;
    }

    public final String toString() {
        return "ScreenshotTaken";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
