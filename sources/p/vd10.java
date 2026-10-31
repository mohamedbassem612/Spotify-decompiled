package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vd10 implements xd10 {
    public static final vd10 a = new vd10();
    public static final Parcelable.Creator<vd10> CREATOR = new qn00((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vd10);
    }

    public final int hashCode() {
        return -331738699;
    }

    public final String toString() {
        return "Dot";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
