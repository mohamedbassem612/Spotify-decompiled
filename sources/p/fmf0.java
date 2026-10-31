package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fmf0 extends gmf0 {
    public static final fmf0 a = new fmf0();
    public static final Parcelable.Creator<fmf0> CREATOR = new j7f0((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fmf0);
    }

    public final int hashCode() {
        return -1490264069;
    }

    public final String toString() {
        return "NotAvailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
