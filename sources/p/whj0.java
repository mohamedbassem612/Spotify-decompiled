package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class whj0 extends yhj0 {
    public static final whj0 a = new whj0();
    public static final Parcelable.Creator<whj0> CREATOR = new ohj0((byte) 5);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof whj0);
    }

    public final int hashCode() {
        return -260510057;
    }

    public final String toString() {
        return "Enriching";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
