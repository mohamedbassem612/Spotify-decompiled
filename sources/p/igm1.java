package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class igm1 implements vgm1 {
    public static final igm1 a = new igm1();
    public static final Parcelable.Creator<igm1> CREATOR = new lfm1((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof igm1);
    }

    public final int hashCode() {
        return -577068006;
    }

    public final String toString() {
        return "HideProgressBarRequested";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
