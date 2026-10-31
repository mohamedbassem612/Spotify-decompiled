package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pwf extends swf {
    public static final pwf a = new pwf();
    public static final Parcelable.Creator<pwf> CREATOR = new zsf((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pwf);
    }

    public final int hashCode() {
        return -1769494731;
    }

    public final String toString() {
        return "Failure";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
