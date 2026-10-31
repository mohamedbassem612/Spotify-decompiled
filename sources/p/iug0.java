package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iug0 implements Parcelable {
    public static final Parcelable.Creator<iug0> CREATOR = new hug0((byte) 0);
    public final tmq0 N0;
    public final String O0;
    public final twg0 P0;
    public final String Q0;
    public final int R0;
    public final String S0;
    public final boolean T0;
    public final String X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String t;

    public iug0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, tmq0 tmq0Var, String str14, twg0 twg0Var, String str15, int i, String str16, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.t = str10;
        this.X = str11;
        this.Y = str12;
        this.Z = str13;
        this.N0 = tmq0Var;
        this.O0 = str14;
        this.P0 = twg0Var;
        this.Q0 = str15;
        this.R0 = i;
        this.S0 = str16;
        this.T0 = z;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iug0)) {
            return false;
        }
        iug0 iug0Var = (iug0) obj;
        return u890.j(this.a, iug0Var.a) && u890.j(this.b, iug0Var.b) && u890.j(this.c, iug0Var.c) && u890.j(this.d, iug0Var.d) && u890.j(this.e, iug0Var.e) && u890.j(this.f, iug0Var.f) && u890.j(this.g, iug0Var.g) && u890.j(this.h, iug0Var.h) && u890.j(this.i, iug0Var.i) && u890.j(this.t, iug0Var.t) && u890.j(this.X, iug0Var.X) && u890.j(this.Y, iug0Var.Y) && u890.j(this.Z, iug0Var.Z) && u890.j(this.N0, iug0Var.N0) && u890.j(this.O0, iug0Var.O0) && this.P0 == iug0Var.P0 && u890.j(this.Q0, iug0Var.Q0) && this.R0 == iug0Var.R0 && u890.j(this.S0, iug0Var.S0) && this.T0 == iug0Var.T0;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.t;
        int iHashCode = (this.N0.hashCode() + cy30.d(cy30.d(cy30.d((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.X), 31, this.Y), 31, this.Z)) * 31;
        String str3 = this.O0;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        twg0 twg0Var = this.P0;
        int iHashCode3 = (iHashCode2 + (twg0Var == null ? 0 : twg0Var.hashCode())) * 31;
        String str4 = this.Q0;
        return Boolean.hashCode(this.T0) + cy30.d(ab80.k(this.R0, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.S0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        this.N0.writeToParcel(parcel, i);
        parcel.writeString(this.O0);
        twg0 twg0Var = this.P0;
        if (twg0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            twg0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.Q0);
        int i2 = this.R0;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "NO_HOLDOUT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "HOLDOUT";
        }
        parcel.writeString(str);
        parcel.writeString(this.S0);
        parcel.writeInt(this.T0 ? 1 : 0);
    }
}
