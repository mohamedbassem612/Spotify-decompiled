package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class idj1 extends jdj1 {
    public static final idj1 a = new idj1();
    public static final Parcelable.Creator<idj1> CREATOR = new xbi1((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof idj1);
    }

    public final int hashCode() {
        return -1369592260;
    }

    public final String toString() {
        return "FIT";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
