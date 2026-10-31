package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n9k0 implements o9k0 {
    public static final n9k0 a = new n9k0();
    public static final Parcelable.Creator<n9k0> CREATOR = new ohj0((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n9k0);
    }

    public final int hashCode() {
        return -1840181351;
    }

    public final String toString() {
        return "OncePerSession";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
