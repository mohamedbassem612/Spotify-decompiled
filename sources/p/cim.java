package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cim implements iim {
    public static final cim a = new cim();
    public static final Parcelable.Creator<cim> CREATOR = new ezl((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cim);
    }

    public final int hashCode() {
        return -569300937;
    }

    public final String toString() {
        return "Report";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
