package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wgz implements ygz {
    public static final wgz a = new wgz();
    public static final Parcelable.Creator<wgz> CREATOR = new dez((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wgz);
    }

    public final int hashCode() {
        return -475660777;
    }

    public final String toString() {
        return "FullError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
