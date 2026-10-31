package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n4j0 implements q4j0 {
    public static final n4j0 a = new n4j0();
    public static final Parcelable.Creator<n4j0> CREATOR = new rqi0((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n4j0);
    }

    public final int hashCode() {
        return -2145757265;
    }

    public final String toString() {
        return "Promobar";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
