package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p21 extends s21 {
    public static final Parcelable.Creator<p21> CREATOR = new gp((byte) 26);
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final String i;

    public /* synthetic */ p21(int i, int i2, long j, String str, String str2, String str3, boolean z, boolean z2) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0, (i2 & 32) == 0, z2, (i2 & 128) != 0 ? 0L : j, (i2 & 256) != 0 ? null : str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p21)) {
            return false;
        }
        p21 p21Var = (p21) obj;
        return u890.j(this.a, p21Var.a) && this.b == p21Var.b && u890.j(this.c, p21Var.c) && this.d == p21Var.d && this.e == p21Var.e && this.f == p21Var.f && this.g == p21Var.g && this.h == p21Var.h && u890.j(this.i, p21Var.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iF2 = cy30.f(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31);
        String str2 = this.i;
        return iF2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
    }

    public p21(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, long j, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = str3;
    }
}
