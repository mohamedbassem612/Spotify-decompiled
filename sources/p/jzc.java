package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jzc implements kzc {
    public static final jzc a = new jzc();
    public static final Parcelable.Creator<jzc> CREATOR = new yyb((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jzc);
    }

    public final int hashCode() {
        return -679445043;
    }

    public final String toString() {
        return "Uninitialized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
