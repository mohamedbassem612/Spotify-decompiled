package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0o0 implements y0o0 {
    public static final v0o0 a = new v0o0();
    public static final Parcelable.Creator<v0o0> CREATOR = new dan0((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v0o0);
    }

    public final int hashCode() {
        return 1597982723;
    }

    public final String toString() {
        return "InviteSheet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
