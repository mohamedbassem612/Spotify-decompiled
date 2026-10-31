package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rcj1 implements Parcelable {
    public static final Parcelable.Creator<rcj1> CREATOR = new xbi1((byte) 24);
    public final String N0;
    public final String X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String t;

    public rcj1(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = str9;
        this.X = str10;
        this.Y = str11;
        this.Z = str12;
        this.N0 = str13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcj1)) {
            return false;
        }
        rcj1 rcj1Var = (rcj1) obj;
        return u890.j(this.a, rcj1Var.a) && u890.j(this.b, rcj1Var.b) && u890.j(this.c, rcj1Var.c) && u890.j(this.d, rcj1Var.d) && u890.j(this.e, rcj1Var.e) && u890.j(this.f, rcj1Var.f) && u890.j(this.g, rcj1Var.g) && u890.j(this.h, rcj1Var.h) && u890.j(this.i, rcj1Var.i) && u890.j(this.t, rcj1Var.t) && u890.j(this.X, rcj1Var.X) && u890.j(this.Y, rcj1Var.Y) && u890.j(this.Z, rcj1Var.Z) && u890.j(this.N0, rcj1Var.N0);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(f4i1.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.t;
        return this.N0.hashCode() + cy30.d(cy30.d(cy30.d((iD + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.X), 31, this.Y), 31, this.Z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.N0);
    }
}
