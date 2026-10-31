package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class srf0 implements Parcelable {
    public static final Parcelable.Creator<srf0> CREATOR = new ipf0((byte) 11);
    public final nrf0 a;
    public final rrf0 b;
    public final bff0 c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public srf0(nrf0 nrf0Var, rrf0 rrf0Var, bff0 bff0Var, int i, boolean z, boolean z2, float f) {
        this.a = nrf0Var;
        this.b = rrf0Var;
        this.c = bff0Var;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = f;
    }

    public static srf0 a(srf0 srf0Var, grf0 grf0Var) {
        rrf0 rrf0Var = srf0Var.b;
        bff0 bff0Var = srf0Var.c;
        int i = srf0Var.d;
        boolean z = srf0Var.e;
        boolean z2 = srf0Var.f;
        float f = srf0Var.g;
        srf0Var.getClass();
        return new srf0(grf0Var, rrf0Var, bff0Var, i, z, z2, f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srf0)) {
            return false;
        }
        srf0 srf0Var = (srf0) obj;
        return u890.j(this.a, srf0Var.a) && u890.j(this.b, srf0Var.b) && u890.j(this.c, srf0Var.c) && this.d == srf0Var.d && this.e == srf0Var.e && this.f == srf0Var.f && Float.compare(this.g, srf0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + xcg1.g(xcg1.g(ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(pze0.s(this.d));
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeFloat(this.g);
    }
}
