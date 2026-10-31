package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z5p0 implements Parcelable {
    public static final Parcelable.Creator<z5p0> CREATOR = new b4o0((byte) 26);
    public final hfu0 a;
    public final Long b;
    public final hfu0 c;
    public final boolean d;

    public z5p0(hfu0 hfu0Var, Long l, hfu0 hfu0Var2, boolean z) {
        this.a = hfu0Var;
        this.b = l;
        this.c = hfu0Var2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5p0)) {
            return false;
        }
        z5p0 z5p0Var = (z5p0) obj;
        return u890.j(this.a, z5p0Var.a) && u890.j(this.b, z5p0Var.b) && u890.j(this.c, z5p0Var.c) && this.d == z5p0Var.d;
    }

    public final int hashCode() {
        hfu0 hfu0Var = this.a;
        int iHashCode = (hfu0Var == null ? 0 : hfu0Var.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        hfu0 hfu0Var2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (hfu0Var2 != null ? hfu0Var2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hfu0 hfu0Var = this.a;
        if (hfu0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hfu0Var.writeToParcel(parcel, i);
        }
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        hfu0 hfu0Var2 = this.c;
        if (hfu0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hfu0Var2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
    }
}
