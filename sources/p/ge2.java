package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ge2 extends ne2 {
    public static final Parcelable.Creator<ge2> CREATOR = new ev1((byte) 24);
    public final boolean a;

    public ge2(boolean z) {
        this.a = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge2) && this.a == ((ge2) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
