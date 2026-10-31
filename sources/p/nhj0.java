package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nhj0 extends shj0 {
    public static final nhj0 a = new nhj0();
    public static final Parcelable.Creator<nhj0> CREATOR = new rqi0((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nhj0);
    }

    public final int hashCode() {
        return -1337647582;
    }

    public final String toString() {
        return "LoadedWithError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
