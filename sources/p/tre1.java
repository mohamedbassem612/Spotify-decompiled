package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tre1 implements ure1 {
    public static final tre1 a = new tre1();
    public static final Parcelable.Creator<tre1> CREATOR = new pwd1((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tre1);
    }

    public final int hashCode() {
        return -517764574;
    }

    public final String toString() {
        return "Offline";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
