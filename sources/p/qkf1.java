package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qkf1 implements tkf1 {
    public static final qkf1 a = new qkf1();
    public static final Parcelable.Creator<qkf1> CREATOR = new r8f1((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qkf1);
    }

    public final int hashCode() {
        return 1574085654;
    }

    public final String toString() {
        return "Mtv";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
