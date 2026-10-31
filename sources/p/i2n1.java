package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i2n1 implements oim {
    public static final Parcelable.Creator<i2n1> CREATOR = new ynm1((byte) 16);
    public final int a;
    public final kjo0 b;

    public i2n1(int i, kjo0 kjo0Var) {
        this.a = i;
        this.b = kjo0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2n1)) {
            return false;
        }
        i2n1 i2n1Var = (i2n1) obj;
        return this.a == i2n1Var.a && u890.j(this.b, i2n1Var.b);
    }

    public final bjm getTarget() {
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
