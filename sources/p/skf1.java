package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class skf1 implements tkf1 {
    public static final skf1 a = new skf1();
    public static final Parcelable.Creator<skf1> CREATOR = new r8f1((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof skf1);
    }

    public final int hashCode() {
        return -911991503;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
