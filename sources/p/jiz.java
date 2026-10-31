package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jiz implements piz {
    public static final jiz a = new jiz();
    public static final Parcelable.Creator<jiz> CREATOR = new dez((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jiz);
    }

    public final int hashCode() {
        return 89872044;
    }

    public final String toString() {
        return "OptedOut";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
