package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h820 extends j820 {
    public static final h820 a = new h820();
    public static final Parcelable.Creator<h820> CREATOR = new u220((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h820);
    }

    public final int hashCode() {
        return -1707410074;
    }

    public final String toString() {
        return "Custom";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
