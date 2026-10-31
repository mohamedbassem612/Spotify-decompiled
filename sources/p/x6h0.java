package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x6h0 implements Parcelable {
    public static final Parcelable.Creator<x6h0> CREATOR = new hug0((byte) 14);
    public final String N0;
    public final boolean X;
    public final String Y;
    public final String Z;
    public final s6h0 a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final String f;
    public final List g;
    public final te30 h;
    public final boolean i;
    public final boolean t;

    public x6h0(s6h0 s6h0Var, String str, boolean z, int i, String str2, String str3, ArrayList arrayList, te30 te30Var, boolean z2, boolean z3, boolean z4, String str4, String str5, String str6) {
        this.a = s6h0Var;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = arrayList;
        this.h = te30Var;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Y = str4;
        this.Z = str5;
        this.N0 = str6;
    }

    public final s6h0 a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6h0)) {
            return false;
        }
        x6h0 x6h0Var = (x6h0) obj;
        return u890.j(this.a, x6h0Var.a) && u890.j(this.b, x6h0Var.b) && this.c == x6h0Var.c && this.d == x6h0Var.d && u890.j(this.e, x6h0Var.e) && u890.j(this.f, x6h0Var.f) && u890.j(this.g, x6h0Var.g) && u890.j(this.h, x6h0Var.h) && this.i == x6h0Var.i && this.t == x6h0Var.t && this.X == x6h0Var.X && u890.j(this.Y, x6h0Var.Y) && u890.j(this.Z, x6h0Var.Z) && u890.j(this.N0, x6h0Var.N0);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        te30 te30Var = this.h;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (te30Var == null ? 0 : te30Var.a.hashCode())) * 31, 31, this.i), 31, this.t), 31, this.X);
        String str3 = this.Y;
        int iHashCode4 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.Z;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.N0;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        int i2 = this.d;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "DICTATION";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "REALTIME_VOICE";
        }
        parcel.writeString(str);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.N0);
    }
}
