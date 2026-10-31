package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y8m1 implements d9m1 {
    public static final y8m1 a = new y8m1();
    public static final Parcelable.Creator<y8m1> CREATOR = new w8m1(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y8m1);
    }

    public final int hashCode() {
        return 703334600;
    }

    public final String toString() {
        return "PauseAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
