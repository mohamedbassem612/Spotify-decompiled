package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ymc0 implements Parcelable {
    public static final Parcelable.Creator<ymc0> CREATOR = new v5c0((byte) 25);
    public final int a;
    public final rxe1 b;

    public ymc0(int i, rxe1 rxe1Var) {
        this.a = i;
        this.b = rxe1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymc0)) {
            return false;
        }
        ymc0 ymc0Var = (ymc0) obj;
        return this.a == ymc0Var.a && u890.j(this.b, ymc0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        rxe1 rxe1Var = this.b;
        return iHashCode + (rxe1Var == null ? 0 : rxe1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
