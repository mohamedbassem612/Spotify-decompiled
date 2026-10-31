package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cwm implements gwm {
    public static final cwm a = new cwm();
    public static final Parcelable.Creator<cwm> CREATOR = new rtm((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cwm);
    }

    public final int hashCode() {
        return 2079221576;
    }

    public final String toString() {
        return "Active";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
