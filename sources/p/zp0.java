package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zp0 implements Parcelable {
    public static final Parcelable.Creator<zp0> CREATOR = new gp((byte) 23);
    public final Long X;
    public final Double Y;
    public final String Z;
    public final hs10 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String t;

    public zp0(hs10 hs10Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Double d, String str10) {
        this.a = hs10Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = str9;
        this.X = l;
        this.Y = d;
        this.Z = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp0)) {
            return false;
        }
        zp0 zp0Var = (zp0) obj;
        return u890.j(this.a, zp0Var.a) && u890.j(this.b, zp0Var.b) && u890.j(this.c, zp0Var.c) && u890.j(this.d, zp0Var.d) && u890.j(this.e, zp0Var.e) && u890.j(this.f, zp0Var.f) && u890.j(this.g, zp0Var.g) && u890.j(this.h, zp0Var.h) && u890.j(this.i, zp0Var.i) && u890.j(this.t, zp0Var.t) && u890.j(this.X, zp0Var.X) && u890.j(this.Y, zp0Var.Y) && u890.j(this.Z, zp0Var.Z);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t);
        Long l = this.X;
        int iHashCode2 = (iD + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.Y;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.Z;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        Long l = this.X;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        Double d = this.Y;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.Z);
    }
}
