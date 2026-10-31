package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u31 implements c41 {
    public static final Parcelable.Creator<u31> CREATOR = new t21((byte) 23);
    public final l3f0 a;
    public final boolean b;
    public final w01 c;
    public final n5o d;
    public final boolean e;

    public u31(l3f0 l3f0Var, boolean z, w01 w01Var, n5o n5oVar, boolean z2) {
        this.a = l3f0Var;
        this.b = z;
        this.c = w01Var;
        this.d = n5oVar;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u31)) {
            return false;
        }
        u31 u31Var = (u31) obj;
        return u890.j(this.a, u31Var.a) && this.b == u31Var.b && u890.j(this.c, u31Var.c) && u890.j(this.d, u31Var.d) && this.e == u31Var.e;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        w01 w01Var = this.c;
        int iHashCode = (iG + (w01Var == null ? 0 : w01Var.hashCode())) * 31;
        n5o n5oVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (n5oVar != null ? n5oVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        w01 w01Var = this.c;
        if (w01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w01Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
