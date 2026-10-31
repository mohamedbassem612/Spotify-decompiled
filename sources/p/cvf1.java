package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cvf1 implements Parcelable {
    public static final cvf1 a = new cvf1();
    public static final Parcelable.Creator<cvf1> CREATOR = new r8f1(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cvf1);
    }

    public final int hashCode() {
        return 1396393329;
    }

    public final String toString() {
        return "ContentWindowing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
