package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c571 extends o571 {
    public static final c571 d = new c571(15, "signal");
    public static final Parcelable.Creator<c571> CREATOR = new o471((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c571);
    }

    public final int hashCode() {
        return 546885762;
    }

    public final String toString() {
        return "Signal";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
