package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fwm implements gwm {
    public static final fwm a = new fwm();
    public static final Parcelable.Creator<fwm> CREATOR = new rtm((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fwm);
    }

    public final int hashCode() {
        return 510568853;
    }

    public final String toString() {
        return "Pending";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
