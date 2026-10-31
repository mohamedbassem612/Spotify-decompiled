package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sq31 implements uq31 {
    public static final Parcelable.Creator<sq31> CREATOR = new s231((byte) 26);
    public final k1z0 a;
    public final Long b;
    public final Long c;
    public final boolean d;

    public sq31(k1z0 k1z0Var, Long l, Long l2, boolean z) {
        this.a = k1z0Var;
        this.b = l;
        this.c = l2;
        this.d = z;
    }

    public static sq31 a(sq31 sq31Var, Long l, Long l2, int i) {
        k1z0 k1z0Var = sq31Var.a;
        if ((i & 2) != 0) {
            l = sq31Var.b;
        }
        if ((i & 4) != 0) {
            l2 = sq31Var.c;
        }
        return new sq31(k1z0Var, l, l2, (i & 8) != 0 ? sq31Var.d : true);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq31)) {
            return false;
        }
        sq31 sq31Var = (sq31) obj;
        return u890.j(this.a, sq31Var.a) && u890.j(this.b, sq31Var.b) && u890.j(this.c, sq31Var.c) && this.d == sq31Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        Long l2 = this.c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l2);
        }
        parcel.writeInt(this.d ? 1 : 0);
    }
}
