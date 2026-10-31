package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ugm0 implements jhm0 {
    public static final ugm0 a = new ugm0();
    public static final Parcelable.Creator<ugm0> CREATOR = new fgm0((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ugm0);
    }

    public final int hashCode() {
        return 413391202;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
