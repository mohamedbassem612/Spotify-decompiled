package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aee implements bee {
    public static final aee a = new aee();
    public static final Parcelable.Creator<aee> CREATOR = new xud((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aee);
    }

    public final int hashCode() {
        return -1299783579;
    }

    public final String toString() {
        return "Valid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
