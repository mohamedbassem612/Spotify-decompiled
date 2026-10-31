package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qhj0 extends shj0 {
    public static final qhj0 a = new qhj0();
    public static final Parcelable.Creator<qhj0> CREATOR = new ohj0((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qhj0);
    }

    public final int hashCode() {
        return 1564007393;
    }

    public final String toString() {
        return "LoadingWithError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
