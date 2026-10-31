package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rxc1 implements Parcelable {
    public static final Parcelable.Creator<rxc1> CREATOR = new pxc1((byte) 1);
    public final qxc1 a;
    public final boolean b;

    public rxc1(qxc1 qxc1Var, boolean z) {
        this.a = qxc1Var;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxc1)) {
            return false;
        }
        rxc1 rxc1Var = (rxc1) obj;
        return u890.j(this.a, rxc1Var.a) && this.b == rxc1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
