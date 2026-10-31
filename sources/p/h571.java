package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h571 extends o571 {
    public static final h571 d = new h571(19, "threads");
    public static final Parcelable.Creator<h571> CREATOR = new o471((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h571);
    }

    public final int hashCode() {
        return 642354447;
    }

    public final String toString() {
        return "Threads";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
