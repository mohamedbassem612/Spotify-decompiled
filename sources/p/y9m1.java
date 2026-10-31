package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9m1 implements pam1 {
    public static final y9m1 a = new y9m1();
    public static final Parcelable.Creator<y9m1> CREATOR = new w8m1((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y9m1);
    }

    public final int hashCode() {
        return 1297999688;
    }

    public final String toString() {
        return "HideCenterActionButton";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
