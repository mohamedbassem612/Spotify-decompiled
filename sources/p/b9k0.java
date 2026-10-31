package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b9k0 implements d9k0 {
    public static final b9k0 a = new b9k0();
    public static final Parcelable.Creator<b9k0> CREATOR = new ohj0((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b9k0);
    }

    public final int hashCode() {
        return 281449181;
    }

    public final String toString() {
        return "Always";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
