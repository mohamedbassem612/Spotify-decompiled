package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class umb1 implements pnb1 {
    public static final umb1 a = new umb1();
    public static final Parcelable.Creator<umb1> CREATOR = new olb1((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof umb1);
    }

    public final int hashCode() {
        return 1603744425;
    }

    public final String toString() {
        return "NoOp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
