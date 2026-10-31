package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vwp0 extends xwp0 {
    public static final Parcelable.Creator<vwp0> CREATOR = new ump0((byte) 26);
    public final int a;
    public final int b;

    public vwp0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwp0)) {
            return false;
        }
        vwp0 vwp0Var = (vwp0) obj;
        return this.a == vwp0Var.a && this.b == vwp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (l1d.C(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "IN_QUEUE";
        } else if (i2 == 2) {
            str = "OFFLINE_MODE";
        } else if (i2 == 3) {
            str = "NO_CONNECTION";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "SYNC_NOT_ALLOWED";
        }
        parcel.writeString(str);
        parcel.writeInt(this.b);
    }
}
