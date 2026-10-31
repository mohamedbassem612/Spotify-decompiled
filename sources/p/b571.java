package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b571 extends o571 {
    public static final b571 d = new b571(null, "spotify-on-platform-search");
    public static final Parcelable.Creator<b571> CREATOR = new o471((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b571);
    }

    public final int hashCode() {
        return 543016834;
    }

    public final String toString() {
        return "Search";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
