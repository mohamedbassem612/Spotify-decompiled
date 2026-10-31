package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e221 extends f221 {
    public static final e221 a = new e221();
    public static final Parcelable.Creator<e221> CREATOR = new e211((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e221);
    }

    public final int hashCode() {
        return 2091651101;
    }

    public final String toString() {
        return "WarningMessage";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
