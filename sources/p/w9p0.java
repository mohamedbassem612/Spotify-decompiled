package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9p0 implements Parcelable {
    public static final Parcelable.Creator<w9p0> CREATOR = new b4o0((byte) 27);
    public final boolean N0;
    public final boolean O0;
    public final double X;
    public final boolean Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;
    public final long h;
    public final long i;
    public final long t;

    public w9p0(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, long j, long j2, long j3, double d, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = str4;
        this.h = j;
        this.i = j2;
        this.t = j3;
        this.X = d;
        this.Y = z3;
        this.Z = z4;
        this.N0 = z5;
        this.O0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9p0)) {
            return false;
        }
        w9p0 w9p0Var = (w9p0) obj;
        return u890.j(this.a, w9p0Var.a) && u890.j(this.b, w9p0Var.b) && u890.j(this.c, w9p0Var.c) && this.d == w9p0Var.d && this.e == w9p0Var.e && this.f == w9p0Var.f && u890.j(this.g, w9p0Var.g) && this.h == w9p0Var.h && this.i == w9p0Var.i && this.t == w9p0Var.t && Double.compare(this.X, w9p0Var.X) == 0 && this.Y == w9p0Var.Y && this.Z == w9p0Var.Z && this.N0 == w9p0Var.N0 && this.O0 == w9p0Var.O0;
    }

    public final int hashCode() {
        int iK = ab80.k(this.f, xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        String str = this.g;
        return Boolean.hashCode(this.O0) + xcg1.g(xcg1.g(xcg1.g(xcg1.e(this.X, cy30.f(cy30.f(cy30.f((iK + (str == null ? 0 : str.hashCode())) * 31, this.h, 31), this.i, 31), this.t, 31), 31), 31, this.Y), 31, this.Z), 31, this.N0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        int i2 = this.f;
        if (i2 == 1) {
            str = "Track";
        } else if (i2 == 2) {
            str = "Episode";
        } else if (i2 == 3) {
            str = "Ad";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "Unknown";
        }
        parcel.writeString(str);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.t);
        parcel.writeDouble(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
    }

    public /* synthetic */ w9p0() {
        this("", "", "", false, false, 4, null, 0L, 0L, 0L, 1.0d, true, true, true, false);
    }
}
