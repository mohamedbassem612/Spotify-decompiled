package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zpl implements aql {
    public static final zpl a = new zpl();
    public static final Parcelable.Creator<zpl> CREATOR = new pol((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zpl);
    }

    public final int hashCode() {
        return 1220592197;
    }

    public final String toString() {
        return "Windowing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
