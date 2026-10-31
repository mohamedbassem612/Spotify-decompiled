package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kiz implements piz {
    public static final kiz a = new kiz();
    public static final Parcelable.Creator<kiz> CREATOR = new dez((byte) 14);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kiz);
    }

    public final int hashCode() {
        return -169399153;
    }

    public final String toString() {
        return "RestrictedFromMessaging";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
