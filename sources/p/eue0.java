package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eue0 implements Parcelable {
    public static final eue0 a = new eue0();
    public static final Parcelable.Creator<eue0> CREATOR = new lbe0((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eue0);
    }

    public final int hashCode() {
        return -965803179;
    }

    public final String toString() {
        return "LoggedOutPageFlowEntry";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
