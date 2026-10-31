package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p931 implements Parcelable {
    public static final p931 a = new p931();
    public static final Parcelable.Creator<p931> CREATOR = new s231((byte) 5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p931);
    }

    public final int hashCode() {
        return -1565672260;
    }

    public final String toString() {
        return "MuteAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
