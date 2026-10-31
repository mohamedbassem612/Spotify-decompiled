package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class niz implements piz {
    public static final niz a = new niz();
    public static final Parcelable.Creator<niz> CREATOR = new dez((byte) 17);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof niz);
    }

    public final int hashCode() {
        return 1971540482;
    }

    public final String toString() {
        return "UnreleasedMarket";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
