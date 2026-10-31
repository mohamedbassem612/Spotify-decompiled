package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a220 implements b220 {
    public static final a220 a = new a220();
    public static final Parcelable.Creator<a220> CREATOR = new no10((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a220);
    }

    public final int hashCode() {
        return -714935200;
    }

    public final String toString() {
        return "Unsupported";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
