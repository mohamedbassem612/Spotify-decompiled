package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xhj0 extends yhj0 {
    public static final xhj0 a = new xhj0();
    public static final Parcelable.Creator<xhj0> CREATOR = new ohj0((byte) 6);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xhj0);
    }

    public final int hashCode() {
        return 2071375774;
    }

    public final String toString() {
        return "Initial";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
