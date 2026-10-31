package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v31 implements c41 {
    public static final Parcelable.Creator<v31> CREATOR = new t21((byte) 24);
    public final xwe0 a;
    public final l3f0 b;
    public final Boolean c;
    public final w01 d;
    public final boolean e;

    public /* synthetic */ v31(xwe0 xwe0Var, l3f0 l3f0Var, Boolean bool, w01 w01Var, int i) {
        this(xwe0Var, (i & 2) != 0 ? null : l3f0Var, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : w01Var, false);
    }

    public static v31 a(v31 v31Var, l3f0 l3f0Var, Boolean bool, w01 w01Var, boolean z, int i) {
        l3f0 l3f0Var2 = l3f0Var;
        xwe0 xwe0Var = v31Var.a;
        if ((i & 2) != 0) {
            l3f0Var2 = v31Var.b;
        }
        if ((i & 4) != 0) {
            bool = v31Var.c;
        }
        if ((i & 8) != 0) {
            w01Var = v31Var.d;
        }
        if ((i & 16) != 0) {
            z = v31Var.e;
        }
        boolean z2 = z;
        v31Var.getClass();
        w01 w01Var2 = w01Var;
        return new v31(xwe0Var, l3f0Var2, bool, w01Var2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v31)) {
            return false;
        }
        v31 v31Var = (v31) obj;
        return u890.j(this.a, v31Var.a) && u890.j(this.b, v31Var.b) && u890.j(this.c, v31Var.c) && u890.j(this.d, v31Var.d) && this.e == v31Var.e;
    }

    public final int hashCode() {
        xwe0 xwe0Var = this.a;
        int iHashCode = (xwe0Var == null ? 0 : xwe0Var.hashCode()) * 31;
        l3f0 l3f0Var = this.b;
        int iHashCode2 = (iHashCode + (l3f0Var == null ? 0 : l3f0Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        w01 w01Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (w01Var != null ? w01Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        w01 w01Var = this.d;
        if (w01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w01Var.writeToParcel(parcel, i);
        }
    }

    public v31(xwe0 xwe0Var, l3f0 l3f0Var, Boolean bool, w01 w01Var, boolean z) {
        this.a = xwe0Var;
        this.b = l3f0Var;
        this.c = bool;
        this.d = w01Var;
        this.e = z;
    }
}
