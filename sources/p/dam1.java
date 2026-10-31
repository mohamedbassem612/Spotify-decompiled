package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dam1 implements pam1 {
    public static final dam1 a = new dam1();
    public static final Parcelable.Creator<dam1> CREATOR = new w8m1((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dam1);
    }

    public final int hashCode() {
        return 1002169705;
    }

    public final String toString() {
        return "PauseAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
