package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yi70 extends hj70 {
    public static final Parcelable.Creator<yi70> CREATOR = new ai70((byte) 21);
    public final boolean c;

    public yi70(boolean z) {
        super(11, 2);
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi70) && this.c == ((yi70) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
    }
}
