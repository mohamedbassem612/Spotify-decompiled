package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rgm1 implements vgm1 {
    public static final rgm1 a = new rgm1();
    public static final Parcelable.Creator<rgm1> CREATOR = new lfm1((byte) 17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rgm1);
    }

    public final int hashCode() {
        return -1802712085;
    }

    public final String toString() {
        return "ShowAudioPreviewChip";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
