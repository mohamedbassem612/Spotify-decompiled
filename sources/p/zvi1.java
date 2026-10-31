package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zvi1 implements oim {
    public static final Parcelable.Creator<zvi1> CREATOR = new xbi1((byte) 14);
    public final lik1 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final bjm h;

    public zvi1(lik1 lik1Var, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = lik1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = new bjm(4, str, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvi1)) {
            return false;
        }
        zvi1 zvi1Var = (zvi1) obj;
        return u890.j(this.a, zvi1Var.a) && u890.j(this.b, zvi1Var.b) && u890.j(this.c, zvi1Var.c) && u890.j(this.d, zvi1Var.d) && this.e == zvi1Var.e && this.f == zvi1Var.f && this.g == zvi1Var.g;
    }

    public final bjm getTarget() {
        return this.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
