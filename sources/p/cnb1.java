package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cnb1 extends znb1 {
    public static final Parcelable.Creator<cnb1> CREATOR = new olb1((byte) 14);
    public final int a;

    public cnb1(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnb1) && this.a == ((cnb1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
