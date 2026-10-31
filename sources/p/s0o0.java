package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s0o0 implements y0o0 {
    public static final s0o0 a = new s0o0();
    public static final Parcelable.Creator<s0o0> CREATOR = new dan0((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s0o0);
    }

    public final int hashCode() {
        return -730406751;
    }

    public final String toString() {
        return "AppLaunch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
