package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u0o0 implements y0o0 {
    public static final u0o0 a = new u0o0();
    public static final Parcelable.Creator<u0o0> CREATOR = new dan0((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u0o0);
    }

    public final int hashCode() {
        return 992080887;
    }

    public final String toString() {
        return "DevicePicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
