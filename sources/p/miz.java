package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class miz implements piz {
    public static final miz a = new miz();
    public static final Parcelable.Creator<miz> CREATOR = new dez((byte) 16);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof miz);
    }

    public final int hashCode() {
        return -827378572;
    }

    public final String toString() {
        return "TooYoung";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
