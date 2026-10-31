package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8t0 extends x8t0 {
    public static final u8t0 a = new u8t0();
    public static final Parcelable.Creator<u8t0> CREATOR = new r7t0((byte) 5);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u8t0);
    }

    public final int hashCode() {
        return -1406167397;
    }

    public final String toString() {
        return "PlanManager";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
