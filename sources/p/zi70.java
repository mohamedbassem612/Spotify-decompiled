package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zi70 extends hj70 {
    public static final Parcelable.Creator<zi70> CREATOR = new ai70((byte) 22);
    public final boolean c;

    public zi70(boolean z) {
        super(12, 2);
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
        return (obj instanceof zi70) && this.c == ((zi70) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
    }
}
