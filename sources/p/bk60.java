package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bk60 implements Parcelable {
    public static final Parcelable.Creator<bk60> CREATOR = new ij60((byte) 9);
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public final int T0;
    public final boolean U0;
    public final boolean V0;
    public final boolean W0;
    public final boolean X;
    public final boolean X0;
    public final boolean Y;
    public final int Y0;
    public final boolean Z;
    public final String Z0;
    public final String a;
    public final yj60 a1;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final ck60 e;
    public final boolean f;
    public final int g;
    public final k4m h;
    public final boolean i;
    public final boolean t;

    public bk60(String str, CharSequence charSequence, String str2, String str3, ck60 ck60Var, boolean z, int i, k4m k4mVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i2, boolean z13, boolean z14, boolean z15, boolean z16, int i3, String str4, yj60 yj60Var) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = str3;
        this.e = ck60Var;
        this.f = z;
        this.g = i;
        this.h = k4mVar;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Y = z5;
        this.Z = z6;
        this.N0 = z7;
        this.O0 = z8;
        this.P0 = z9;
        this.Q0 = z10;
        this.R0 = z11;
        this.S0 = z12;
        this.T0 = i2;
        this.U0 = z13;
        this.V0 = z14;
        this.W0 = z15;
        this.X0 = z16;
        this.Y0 = i3;
        this.Z0 = str4;
        this.a1 = yj60Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk60)) {
            return false;
        }
        bk60 bk60Var = (bk60) obj;
        return u890.j(this.a, bk60Var.a) && u890.j(this.b, bk60Var.b) && u890.j(this.c, bk60Var.c) && u890.j(this.d, bk60Var.d) && this.e == bk60Var.e && this.f == bk60Var.f && this.g == bk60Var.g && this.h == bk60Var.h && this.i == bk60Var.i && this.t == bk60Var.t && this.X == bk60Var.X && this.Y == bk60Var.Y && this.Z == bk60Var.Z && this.N0 == bk60Var.N0 && this.O0 == bk60Var.O0 && this.P0 == bk60Var.P0 && this.Q0 == bk60Var.Q0 && this.R0 == bk60Var.R0 && this.S0 == bk60Var.S0 && this.T0 == bk60Var.T0 && this.U0 == bk60Var.U0 && this.V0 == bk60Var.V0 && this.W0 == bk60Var.W0 && this.X0 == bk60Var.X0 && this.Y0 == bk60Var.Y0 && u890.j(this.Z0, bk60Var.Z0) && u890.j(this.a1, bk60Var.a1);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD = cy30.d(ab80.k(this.Y0, xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.T0, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(p3d1.g(this.h, ab80.k(this.g, xcg1.g((this.e.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f), 31), 31), 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31, this.Z), 31, this.N0), 31, this.O0), 31, this.P0), 31, this.Q0), 31, this.R0), 31, this.S0), 31), 31, this.U0), 31, this.V0), 31, this.W0), 31, this.X0), 31), 31, this.Z0);
        yj60 yj60Var = this.a1;
        return iD + (yj60Var != null ? yj60Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(fd21.o(this.g));
        parcel.writeString(this.h.name());
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeInt(this.R0 ? 1 : 0);
        parcel.writeInt(this.S0 ? 1 : 0);
        int i2 = this.T0;
        if (i2 == 1) {
            str = "WIDE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "NONE";
        }
        parcel.writeString(str);
        parcel.writeInt(this.U0 ? 1 : 0);
        parcel.writeInt(this.V0 ? 1 : 0);
        parcel.writeInt(this.W0 ? 1 : 0);
        parcel.writeInt(this.X0 ? 1 : 0);
        int i3 = this.Y0;
        if (i3 == 1) {
            str2 = "Original";
        } else if (i3 == 2) {
            str2 = "RestrictedWithTrackCover";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "RestrictedWithPlaceholder";
        }
        parcel.writeString(str2);
        parcel.writeString(this.Z0);
        yj60 yj60Var = this.a1;
        if (yj60Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yj60Var.writeToParcel(parcel, i);
        }
    }
}
