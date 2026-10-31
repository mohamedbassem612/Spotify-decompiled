package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class smb1 extends znb1 {
    public static final smb1 a = new smb1();
    public static final Parcelable.Creator<smb1> CREATOR = new olb1((byte) 8);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof smb1);
    }

    public final int hashCode() {
        return 673917380;
    }

    public final String toString() {
        return "MaxChildrenReached";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
