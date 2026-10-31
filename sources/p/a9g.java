package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a9g implements d9g {
    public static final a9g a = new a9g();
    public static final Parcelable.Creator<a9g> CREATOR = new i8g((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a9g);
    }

    public final int hashCode() {
        return -522767998;
    }

    public final String toString() {
        return "Dismiss";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
