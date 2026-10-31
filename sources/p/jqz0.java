package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqz0 implements mqz0 {
    public static final jqz0 a = new jqz0();
    public static final Parcelable.Creator<jqz0> CREATOR = new j1z0((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jqz0);
    }

    public final int hashCode() {
        return -384313698;
    }

    public final String toString() {
        return "NoItems";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
