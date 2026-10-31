package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v2e1 extends y2e1 {
    public static final v2e1 a = new v2e1();
    public static final Parcelable.Creator<v2e1> CREATOR = new pwd1((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v2e1);
    }

    public final int hashCode() {
        return -33466785;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
