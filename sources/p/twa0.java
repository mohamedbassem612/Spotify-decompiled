package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class twa0 implements Parcelable {
    public static final Parcelable.Creator<twa0> CREATOR = new jca0((byte) 6);
    public static final twa0 N0 = new twa0(null, null, null, new dxr0(), null, null, false, false, 0, null, null, txa0.a, tpw0.c);
    public final u1f0 X;
    public final yxa0 Y;
    public final tpw0 Z;
    public final String a;
    public final String b;
    public final String c;
    public final dxr0 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final String t;

    public twa0(String str, String str2, String str3, dxr0 dxr0Var, String str4, String str5, boolean z, boolean z2, int i, String str6, u1f0 u1f0Var, yxa0 yxa0Var, tpw0 tpw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dxr0Var;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = i;
        this.t = str6;
        this.X = u1f0Var;
        this.Y = yxa0Var;
        this.Z = tpw0Var;
    }

    public static twa0 a(twa0 twa0Var, String str, String str2, String str3, dxr0 dxr0Var, String str4, String str5, boolean z, boolean z2, int i, String str6, yxa0 yxa0Var, tpw0 tpw0Var, int i2) {
        if ((i2 & 1) != 0) {
            str = twa0Var.a;
        }
        String str7 = str;
        String str8 = (i2 & 2) != 0 ? twa0Var.b : str2;
        String str9 = (i2 & 4) != 0 ? twa0Var.c : str3;
        dxr0 dxr0Var2 = (i2 & 8) != 0 ? twa0Var.d : dxr0Var;
        String str10 = (i2 & 16) != 0 ? twa0Var.e : str4;
        String str11 = (i2 & 32) != 0 ? twa0Var.f : str5;
        boolean z3 = (i2 & 64) != 0 ? twa0Var.g : z;
        boolean z4 = (i2 & 128) != 0 ? twa0Var.h : z2;
        int i3 = (i2 & 256) != 0 ? twa0Var.i : i;
        String str12 = (i2 & 512) != 0 ? twa0Var.t : str6;
        u1f0 u1f0Var = twa0Var.X;
        yxa0 yxa0Var2 = (i2 & 2048) != 0 ? twa0Var.Y : yxa0Var;
        tpw0 tpw0Var2 = (i2 & 4096) != 0 ? twa0Var.Z : tpw0Var;
        twa0Var.getClass();
        return new twa0(str7, str8, str9, dxr0Var2, str10, str11, z3, z4, i3, str12, u1f0Var, yxa0Var2, tpw0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twa0)) {
            return false;
        }
        twa0 twa0Var = (twa0) obj;
        return u890.j(this.a, twa0Var.a) && u890.j(this.b, twa0Var.b) && u890.j(this.c, twa0Var.c) && u890.j(this.d, twa0Var.d) && u890.j(this.e, twa0Var.e) && u890.j(this.f, twa0Var.f) && this.g == twa0Var.g && this.h == twa0Var.h && this.i == twa0Var.i && u890.j(this.t, twa0Var.t) && u890.j(this.X, twa0Var.X) && u890.j(this.Y, twa0Var.Y) && this.Z == twa0Var.Z;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iF = kaa0.f(this.i, xcg1.g(xcg1.g((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g), 31, this.h), 31);
        String str6 = this.t;
        int iHashCode5 = (iF + (str6 == null ? 0 : str6.hashCode())) * 31;
        u1f0 u1f0Var = this.X;
        return this.Z.hashCode() + ((this.Y.hashCode() + ((iHashCode5 + (u1f0Var != null ? u1f0Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeString(this.t);
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeParcelable(this.Z, i);
    }
}
