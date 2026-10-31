package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n1g1 implements p1g1 {
    public static final n1g1 a = new n1g1();
    public static final Parcelable.Creator<n1g1> CREATOR = new r8f1((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n1g1);
    }

    public final int hashCode() {
        return -1886179319;
    }

    public final String toString() {
        return "VideoMapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
