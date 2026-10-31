package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kr7 implements nr7 {
    public static final kr7 a = new kr7();
    public static final Parcelable.Creator<kr7> CREATOR = new f67((byte) 23);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kr7);
    }

    public final int hashCode() {
        return 74579431;
    }

    public final String toString() {
        return "Error";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
