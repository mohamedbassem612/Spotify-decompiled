package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xqk1 extends zqk1 {
    public static final xqk1 a = new xqk1();
    public static final Parcelable.Creator<xqk1> CREATOR = new ylk1((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xqk1);
    }

    public final int hashCode() {
        return -533419900;
    }

    public final String toString() {
        return "Custom";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
