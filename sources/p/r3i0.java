package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r3i0 implements t3i0 {
    public static final Parcelable.Creator<r3i0> CREATOR = new cyh0((byte) 8);
    public final xve1 a;
    public final xve1 b;

    public r3i0(xve1 xve1Var, xve1 xve1Var2) {
        this.a = xve1Var;
        this.b = xve1Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3i0)) {
            return false;
        }
        r3i0 r3i0Var = (r3i0) obj;
        return u890.j(this.a, r3i0Var.a) && u890.j(this.b, r3i0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xve1 xve1Var = this.b;
        return iHashCode + (xve1Var == null ? 0 : xve1Var.hashCode());
    }

    @Override // p.t3i0
    public final xve1 m() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
