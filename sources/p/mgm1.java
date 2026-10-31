package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mgm1 implements vgm1 {
    public static final mgm1 a = new mgm1();
    public static final Parcelable.Creator<mgm1> CREATOR = new lfm1((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mgm1);
    }

    public final int hashCode() {
        return 198573803;
    }

    public final String toString() {
        return "PauseSharedAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
