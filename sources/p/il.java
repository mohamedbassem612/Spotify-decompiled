package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class il extends kl {
    public static final il b = new il(true);
    public static final Parcelable.Creator<il> CREATOR = new ad((byte) 17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof il);
    }

    public final int hashCode() {
        return 1310684225;
    }

    public final String toString() {
        return "UserInfo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
