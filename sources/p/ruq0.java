package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ruq0 implements Parcelable {
    public static final Parcelable.Creator<ruq0> CREATOR = new p7q0((byte) 17);
    public final Integer N0;
    public final boolean O0;
    public final float P0;
    public final float Q0;
    public final double R0;
    public final double S0;
    public final int X;
    public final Float Y;
    public final Float Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int t;

    public ruq0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, Float f, Float f2, Integer num, boolean z, float f3, float f4, double d, double d2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.t = i2;
        this.X = i3;
        this.Y = f;
        this.Z = f2;
        this.N0 = num;
        this.O0 = z;
        this.P0 = f3;
        this.Q0 = f4;
        this.R0 = d;
        this.S0 = d2;
    }

    public static ruq0 a(ruq0 ruq0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, Float f, Float f2, Integer num, boolean z, float f3, float f4, double d, double d2, int i4) {
        String str9 = (i4 & 1) != 0 ? ruq0Var.a : str;
        String str10 = (i4 & 2) != 0 ? ruq0Var.b : str2;
        String str11 = (i4 & 4) != 0 ? ruq0Var.c : str3;
        String str12 = (i4 & 8) != 0 ? ruq0Var.d : str4;
        String str13 = (i4 & 16) != 0 ? ruq0Var.e : str5;
        String str14 = (i4 & 32) != 0 ? ruq0Var.f : str6;
        String str15 = (i4 & 64) != 0 ? ruq0Var.g : str7;
        String str16 = (i4 & 128) != 0 ? ruq0Var.h : str8;
        int i5 = (i4 & 256) != 0 ? ruq0Var.i : i;
        int i6 = (i4 & 512) != 0 ? ruq0Var.t : i2;
        int i7 = (i4 & 1024) != 0 ? ruq0Var.X : i3;
        Float f5 = (i4 & 2048) != 0 ? ruq0Var.Y : f;
        Float f6 = (i4 & 4096) != 0 ? ruq0Var.Z : f2;
        Integer num2 = (i4 & 8192) != 0 ? ruq0Var.N0 : num;
        String str17 = str9;
        boolean z2 = (i4 & 16384) != 0 ? ruq0Var.O0 : z;
        float f7 = (i4 & 32768) != 0 ? ruq0Var.P0 : f3;
        float f8 = (i4 & 65536) != 0 ? ruq0Var.Q0 : f4;
        boolean z3 = z2;
        double d3 = (i4 & 131072) != 0 ? ruq0Var.R0 : d;
        double d4 = (i4 & 262144) != 0 ? ruq0Var.S0 : d2;
        ruq0Var.getClass();
        return new ruq0(str17, str10, str11, str12, str13, str14, str15, str16, i5, i6, i7, f5, f6, num2, z3, f7, f8, d3, d4);
    }

    public final Integer b() {
        return this.N0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruq0)) {
            return false;
        }
        ruq0 ruq0Var = (ruq0) obj;
        return u890.j(this.a, ruq0Var.a) && u890.j(this.b, ruq0Var.b) && u890.j(this.c, ruq0Var.c) && u890.j(this.d, ruq0Var.d) && u890.j(this.e, ruq0Var.e) && u890.j(this.f, ruq0Var.f) && u890.j(this.g, ruq0Var.g) && u890.j(this.h, ruq0Var.h) && this.i == ruq0Var.i && this.t == ruq0Var.t && this.X == ruq0Var.X && u890.j(this.Y, ruq0Var.Y) && u890.j(this.Z, ruq0Var.Z) && u890.j(this.N0, ruq0Var.N0) && this.O0 == ruq0Var.O0 && Float.compare(this.P0, ruq0Var.P0) == 0 && Float.compare(this.Q0, ruq0Var.Q0) == 0 && Double.compare(this.R0, ruq0Var.R0) == 0 && Double.compare(this.S0, ruq0Var.S0) == 0;
    }

    public final int g() {
        return this.X;
    }

    public final double h() {
        return this.R0;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.X, kaa0.f(this.t, kaa0.f(this.i, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31);
        Float f = this.Y;
        int iHashCode = (iF + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.Z;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.N0;
        return Double.hashCode(this.S0) + xcg1.e(this.R0, x0d.f(x0d.f(xcg1.g((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.O0), 31, this.P0), 31, this.Q0), 31);
    }

    public final double j() {
        return this.S0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t);
        parcel.writeInt(this.X);
        Float f = this.Y;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.Z;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Integer num = this.N0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeFloat(this.P0);
        parcel.writeFloat(this.Q0);
        parcel.writeDouble(this.R0);
        parcel.writeDouble(this.S0);
    }
}
