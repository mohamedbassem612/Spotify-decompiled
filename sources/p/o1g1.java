package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o1g1 implements p1g1 {
    public static final o1g1 a = new o1g1();
    public static final Parcelable.Creator<o1g1> CREATOR = new r8f1((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o1g1);
    }

    public final int hashCode() {
        return -531297694;
    }

    public final String toString() {
        return "VideoUnmapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
