package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p4j0 implements q4j0 {
    public static final p4j0 a = new p4j0();
    public static final Parcelable.Creator<p4j0> CREATOR = new rqi0((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p4j0);
    }

    public final int hashCode() {
        return -2008461416;
    }

    public final String toString() {
        return "Tooltip";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
