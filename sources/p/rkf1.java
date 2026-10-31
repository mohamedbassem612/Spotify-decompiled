package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rkf1 implements tkf1 {
    public static final rkf1 a = new rkf1();
    public static final Parcelable.Creator<rkf1> CREATOR = new r8f1((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rkf1);
    }

    public final int hashCode() {
        return 979416471;
    }

    public final String toString() {
        return "Performance";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
