package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qwf extends swf {
    public static final qwf a = new qwf();
    public static final Parcelable.Creator<qwf> CREATOR = new zsf((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qwf);
    }

    public final int hashCode() {
        return -1365508286;
    }

    public final String toString() {
        return "Pending";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
