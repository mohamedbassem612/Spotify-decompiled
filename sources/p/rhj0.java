package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rhj0 extends shj0 {
    public static final rhj0 a = new rhj0();
    public static final Parcelable.Creator<rhj0> CREATOR = new ohj0((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rhj0);
    }

    public final int hashCode() {
        return 370802496;
    }

    public final String toString() {
        return "PendingLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
