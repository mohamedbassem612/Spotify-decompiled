package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ort0 implements urt0 {
    public static final ort0 a = new ort0();
    public static final Parcelable.Creator<ort0> CREATOR = new brt0((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ort0);
    }

    public final int hashCode() {
        return 1476536124;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
