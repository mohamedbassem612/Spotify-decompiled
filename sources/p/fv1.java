package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fv1 implements gv1 {
    public static final fv1 a = new fv1();
    public static final Parcelable.Creator<fv1> CREATOR = new ev1((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fv1);
    }

    public final int hashCode() {
        return 1821776978;
    }

    public final String toString() {
        return "Unchanged";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
