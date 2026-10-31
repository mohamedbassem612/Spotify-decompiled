package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class emx0 implements Parcelable {
    public static final emx0 a = new emx0();
    public static final Parcelable.Creator<emx0> CREATOR = new wvw0((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof emx0);
    }

    public final int hashCode() {
        return 1738367305;
    }

    public final String toString() {
        return "PromoDisclosurePageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
