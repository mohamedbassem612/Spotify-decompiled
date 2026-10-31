package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rk2 implements Parcelable {
    public static final Parcelable.Creator<rk2> CREATOR = new ue2((byte) 17);
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final boolean t;

    public rk2(int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, String str3, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = str3;
        this.t = z;
    }

    public final qk2 a() {
        qk2 qk2Var = new qk2();
        qk2Var.a = this.a;
        qk2Var.b = this.b;
        qk2Var.c = this.c;
        qk2Var.d = this.d;
        qk2Var.e = this.e;
        qk2Var.f = this.f;
        qk2Var.g = this.g;
        qk2Var.h = this.h;
        qk2Var.i = this.i;
        qk2Var.j = this.t;
        return qk2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk2)) {
            return false;
        }
        rk2 rk2Var = (rk2) obj;
        return this.a == rk2Var.a && u890.j(this.b, rk2Var.b) && u890.j(this.c, rk2Var.c) && this.d == rk2Var.d && this.e == rk2Var.e && this.f == rk2Var.f && this.g == rk2Var.g && this.h == rk2Var.h && u890.j(this.i, rk2Var.i) && this.t == rk2Var.t;
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.i;
        return Boolean.hashCode(this.t) + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "INITIAL";
        } else if (i2 == 2) {
            str = "LOADED";
        } else if (i2 == 3) {
            str = "FAILED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "RETRYING";
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
