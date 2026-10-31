package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ysd implements zsd {
    public static final ysd a = new ysd();
    public static final Parcelable.Creator<ysd> CREATOR = new yyb((byte) 28);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ysd);
    }

    public final int hashCode() {
        return -835943978;
    }

    public final String toString() {
        return "Unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
