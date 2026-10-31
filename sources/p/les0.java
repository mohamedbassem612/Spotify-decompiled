package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class les0 implements Parcelable {
    public static final Parcelable.Creator<les0> CREATOR = new ybs0(15);
    public final String X;
    public final String Y;
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

    public les0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
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
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof les0)) {
            return false;
        }
        les0 les0Var = (les0) obj;
        return u890.j(this.a, les0Var.a) && u890.j(this.b, les0Var.b) && u890.j(this.c, les0Var.c) && u890.j(this.d, les0Var.d) && u890.j(this.e, les0Var.e) && u890.j(this.f, les0Var.f) && u890.j(this.g, les0Var.g) && u890.j(this.h, les0Var.h) && u890.j(this.i, les0Var.i) && u890.j(this.t, les0Var.t) && u890.j(this.X, les0Var.X) && u890.j(this.Y, les0Var.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X);
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
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
    }
}
