package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ugo0 implements Parcelable {
    public static final Parcelable.Creator<ugo0> CREATOR = new b4o0((byte) 10);
    public final boolean a;
    public final String b;
    public final String c;
    public final vgo0 d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final mgo0 i;

    public /* synthetic */ ugo0(boolean z, String str, String str2, boolean z2, boolean z3, String str3, mgo0 mgo0Var, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, "", new vgo0("", -1, -1), (i & 16) != 0 ? null : str2, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "home-promotion" : str3, (i & 256) != 0 ? null : mgo0Var);
    }

    public final String a() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugo0)) {
            return false;
        }
        ugo0 ugo0Var = (ugo0) obj;
        return this.a == ugo0Var.a && u890.j(this.b, ugo0Var.b) && u890.j(this.c, ugo0Var.c) && u890.j(this.d, ugo0Var.d) && u890.j(this.e, ugo0Var.e) && this.f == ugo0Var.f && this.g == ugo0Var.g && u890.j(this.h, ugo0Var.h) && u890.j(this.i, ugo0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int iD = cy30.d(xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        mgo0 mgo0Var = this.i;
        return iD + (mgo0Var != null ? mgo0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        mgo0 mgo0Var = this.i;
        if (mgo0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mgo0Var.writeToParcel(parcel, i);
        }
    }

    public ugo0(boolean z, String str, String str2, vgo0 vgo0Var, String str3, boolean z2, boolean z3, String str4, mgo0 mgo0Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = vgo0Var;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = str4;
        this.i = mgo0Var;
    }
}
