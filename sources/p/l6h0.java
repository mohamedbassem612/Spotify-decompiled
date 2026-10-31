package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l6h0 implements s6h0 {
    public static final l6h0 a = new l6h0();
    public static final Parcelable.Creator<l6h0> CREATOR = new hug0((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l6h0);
    }

    public final int hashCode() {
        return 818920157;
    }

    public final String toString() {
        return "NPVMartiniChat";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
