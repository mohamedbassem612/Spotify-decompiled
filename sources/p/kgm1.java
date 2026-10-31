package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kgm1 implements vgm1 {
    public static final kgm1 a = new kgm1();
    public static final Parcelable.Creator<kgm1> CREATOR = new lfm1((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kgm1);
    }

    public final int hashCode() {
        return -1199205494;
    }

    public final String toString() {
        return "NudgeButtonClicked";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
