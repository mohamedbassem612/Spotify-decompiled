package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z6x0 implements Parcelable {
    public static final Parcelable.Creator<z6x0> CREATOR = new wvw0((byte) 9);
    public final int X;
    public final wbk1 Y;
    public final String Z;
    public final m3x0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public z6x0(m3x0 m3x0Var, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, String str, boolean z5, boolean z6, boolean z7, int i) {
        this.a = m3x0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = bool;
        this.g = str;
        this.h = z5;
        this.i = z6;
        this.t = z7;
        this.X = i;
        this.Y = m3x0Var.P0 ? wbk1.c : u890.j(m3x0Var.a, m3x0Var.b) ? wbk1.a : wbk1.b;
        this.Z = m3x0Var.c;
    }

    public static z6x0 a(z6x0 z6x0Var, m3x0 m3x0Var, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, String str, boolean z5, boolean z6, boolean z7, int i, int i2) {
        if ((i2 & 1) != 0) {
            m3x0Var = z6x0Var.a;
        }
        m3x0 m3x0Var2 = m3x0Var;
        if ((i2 & 2) != 0) {
            z = z6x0Var.b;
        }
        boolean z8 = z;
        if ((i2 & 4) != 0) {
            z2 = z6x0Var.c;
        }
        boolean z9 = z2;
        boolean z10 = (i2 & 8) != 0 ? z6x0Var.d : z3;
        boolean z11 = (i2 & 16) != 0 ? z6x0Var.e : z4;
        Boolean bool2 = (i2 & 32) != 0 ? z6x0Var.f : bool;
        String str2 = (i2 & 64) != 0 ? z6x0Var.g : str;
        boolean z12 = (i2 & 128) != 0 ? z6x0Var.h : z5;
        boolean z13 = (i2 & 256) != 0 ? z6x0Var.i : z6;
        boolean z14 = (i2 & 512) != 0 ? z6x0Var.t : z7;
        int i3 = (i2 & 1024) != 0 ? z6x0Var.X : i;
        z6x0Var.getClass();
        return new z6x0(m3x0Var2, z8, z9, z10, z11, bool2, str2, z12, z13, z14, i3);
    }

    public final z6x0 b() {
        int iC = l1d.C(this.X);
        return (iC == 1 || iC == 4 || iC == 5) ? a(this, null, false, false, false, false, null, null, false, false, false, 1, 1023) : this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6x0)) {
            return false;
        }
        z6x0 z6x0Var = (z6x0) obj;
        return u890.j(this.a, z6x0Var.a) && this.b == z6x0Var.b && this.c == z6x0Var.c && this.d == z6x0Var.d && this.e == z6x0Var.e && u890.j(this.f, z6x0Var.f) && u890.j(this.g, z6x0Var.g) && this.h == z6x0Var.h && this.i == z6x0Var.i && this.t == z6x0Var.t && this.X == z6x0Var.X;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Boolean bool = this.f;
        int iHashCode = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.g;
        return l1d.C(this.X) + xcg1.g(xcg1.g(xcg1.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        Boolean bool = this.f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        switch (this.X) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "LOADING";
                break;
            case 3:
                str = "NONE";
                break;
            case 4:
                str = "INCOMING";
                break;
            case 5:
                str = "ACCEPTING";
                break;
            case 6:
                str = "SENDING";
                break;
            case 7:
                str = "SENT";
                break;
            case 8:
                str = "FRIEND";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }

    public /* synthetic */ z6x0() {
        this(new m3x0(null, null, false, false, false, false, false, false, -1, 15), false, false, false, false, null, null, false, false, false, 1);
    }
}
