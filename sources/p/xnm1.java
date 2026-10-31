package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xnm1 implements aom1 {
    public static final xnm1 a = new xnm1();
    public static final Parcelable.Creator<xnm1> CREATOR = new lfm1((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xnm1);
    }

    public final int hashCode() {
        return 1815371013;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
