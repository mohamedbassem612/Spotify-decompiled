package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bb2 implements eb2 {
    public static final bb2 a = new bb2();
    public static final Parcelable.Creator<bb2> CREATOR = new ev1((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bb2);
    }

    public final int hashCode() {
        return 314623728;
    }

    public final String toString() {
        return "ParentalConsent";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
