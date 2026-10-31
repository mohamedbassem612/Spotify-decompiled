package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ogm0 implements pgm0 {
    public static final ogm0 a = new ogm0();
    public static final Parcelable.Creator<ogm0> CREATOR = new fgm0((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ogm0);
    }

    public final int hashCode() {
        return 1541353473;
    }

    public final String toString() {
        return "View";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
