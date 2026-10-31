package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gnt extends jnt {
    public static final gnt a = new gnt();
    public static final Parcelable.Creator<gnt> CREATOR = new qms((byte) 24);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gnt);
    }

    public final int hashCode() {
        return -1233102895;
    }

    public final String toString() {
        return "Enabled";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
