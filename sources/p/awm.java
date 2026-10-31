package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class awm implements bwm {
    public static final awm a = new awm();
    public static final Parcelable.Creator<awm> CREATOR = new rtm((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof awm);
    }

    public final int hashCode() {
        return -176072872;
    }

    public final String toString() {
        return "Member";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
