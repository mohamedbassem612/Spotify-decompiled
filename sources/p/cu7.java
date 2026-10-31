package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cu7 extends ei90 {
    public static final Parcelable.Creator<cu7> CREATOR = new bu7((byte) 0);
    public final boolean X;
    public final du7 Y;
    public final String a;
    public final boolean b;
    public final kfv c;
    public final String d;
    public final wve1 e;
    public final boolean f;
    public final kw91 g;
    public final boolean h;
    public final String i;
    public final Long t;

    public cu7(String str, boolean z, kfv kfvVar, String str2, wve1 wve1Var, boolean z2, kw91 kw91Var, boolean z3, String str3, Long l, boolean z4, du7 du7Var) {
        this.a = str;
        this.b = z;
        this.c = kfvVar;
        this.d = str2;
        this.e = wve1Var;
        this.f = z2;
        this.g = kw91Var;
        this.h = z3;
        this.i = str3;
        this.t = l;
        this.X = z4;
        this.Y = du7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu7)) {
            return false;
        }
        cu7 cu7Var = (cu7) obj;
        return u890.j(this.a, cu7Var.a) && this.b == cu7Var.b && u890.j(this.c, cu7Var.c) && u890.j(this.d, cu7Var.d) && u890.j(this.e, cu7Var.e) && this.f == cu7Var.f && u890.j(this.g, cu7Var.g) && this.h == cu7Var.h && u890.j(this.i, cu7Var.i) && u890.j(this.t, cu7Var.t) && this.X == cu7Var.X && this.Y == cu7Var.Y;
    }

    public final int hashCode() {
        int iG = xcg1.g(f4i1.b(xcg1.g(cy30.f(cy30.d(cy30.f(xcg1.g(this.a.hashCode() * 31, 31, this.b), this.c.a, 31), 31, this.d), this.e.a, 31), 31, this.f), 31, this.g.a), 31, this.h);
        String str = this.i;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.t;
        return this.Y.hashCode() + xcg1.g((iHashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        Long l = this.t;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeInt(this.X ? 1 : 0);
        this.Y.writeToParcel(parcel, i);
    }
}
