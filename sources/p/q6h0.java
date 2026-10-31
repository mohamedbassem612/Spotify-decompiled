package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q6h0 implements s6h0 {
    public static final q6h0 a = new q6h0();
    public static final Parcelable.Creator<q6h0> CREATOR = new hug0((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q6h0);
    }

    public final int hashCode() {
        return -1451225619;
    }

    public final String toString() {
        return "ResumeInFlight";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
