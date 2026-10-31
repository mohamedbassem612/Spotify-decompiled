package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0o0 implements y0o0 {
    public static final w0o0 a = new w0o0();
    public static final Parcelable.Creator<w0o0> CREATOR = new dan0((byte) 23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w0o0);
    }

    public final int hashCode() {
        return 1397790828;
    }

    public final String toString() {
        return "JamJoined";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
