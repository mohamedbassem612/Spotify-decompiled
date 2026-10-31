package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ylb1 extends znb1 {
    public static final ylb1 a = new ylb1();
    public static final Parcelable.Creator<ylb1> CREATOR = new olb1((byte) 3);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ylb1);
    }

    public final int hashCode() {
        return 1051379455;
    }

    public final String toString() {
        return "Initialized";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
