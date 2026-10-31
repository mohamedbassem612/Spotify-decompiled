package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kf0 implements lf0 {
    public static final kf0 a = new kf0();
    public static final Parcelable.Creator<kf0> CREATOR = new gp((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kf0);
    }

    public final int hashCode() {
        return 1380198998;
    }

    public final String toString() {
        return "Inactive";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
