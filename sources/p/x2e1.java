package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x2e1 extends y2e1 {
    public static final x2e1 a = new x2e1();
    public static final Parcelable.Creator<x2e1> CREATOR = new pwd1((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x2e1);
    }

    public final int hashCode() {
        return -281170989;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
