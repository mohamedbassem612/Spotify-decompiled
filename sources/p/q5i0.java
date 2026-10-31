package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q5i0 implements t5i0 {
    public static final q5i0 a = new q5i0();
    public static final Parcelable.Creator<q5i0> CREATOR = new cyh0((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q5i0);
    }

    public final int hashCode() {
        return 1163717636;
    }

    public final String toString() {
        return "Completed";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
