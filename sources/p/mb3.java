package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mb3 implements Parcelable {
    public static final Parcelable.Creator<mb3> CREATOR = new i93((byte) 1);
    public final boolean N0;
    public final boolean O0;
    public final ok51 P0;
    public final boolean Q0;
    public final p860 R0;
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ugo0 h;
    public final boolean i;
    public final String t;

    public /* synthetic */ mb3(boolean z, boolean z2, boolean z3, ugo0 ugo0Var, String str, boolean z4, int i, boolean z5, boolean z6, ok51 ok51Var, boolean z7, p860 p860Var, int i2) {
        this(false, (i2 & 2) != 0 ? false : z, (i2 & 4) == 0, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, false, (i2 & 64) == 0, (i2 & 128) != 0 ? null : ugo0Var, (i2 & 256) != 0, (i2 & 512) != 0 ? "" : str, false, (i2 & 2048) != 0 ? true : z4, (i2 & 4096) != 0 ? 3 : i, (i2 & 8192) != 0 ? true : z5, (i2 & 16384) != 0 ? true : z6, (32768 & i2) != 0 ? null : ok51Var, (65536 & i2) != 0 ? false : z7, (i2 & 131072) != 0 ? null : p860Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb3)) {
            return false;
        }
        mb3 mb3Var = (mb3) obj;
        return this.a == mb3Var.a && this.b == mb3Var.b && this.c == mb3Var.c && this.d == mb3Var.d && this.e == mb3Var.e && this.f == mb3Var.f && this.g == mb3Var.g && u890.j(this.h, mb3Var.h) && this.i == mb3Var.i && u890.j(this.t, mb3Var.t) && this.X == mb3Var.X && this.Y == mb3Var.Y && this.Z == mb3Var.Z && this.N0 == mb3Var.N0 && this.O0 == mb3Var.O0 && u890.j(this.P0, mb3Var.P0) && this.Q0 == mb3Var.Q0 && u890.j(this.R0, mb3Var.R0);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ugo0 ugo0Var = this.h;
        int iG2 = xcg1.g(xcg1.g(ab80.k(this.Z, xcg1.g(xcg1.g(cy30.d(xcg1.g((iG + (ugo0Var == null ? 0 : ugo0Var.hashCode())) * 31, 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31), 31, this.N0), 31, this.O0);
        ok51 ok51Var = this.P0;
        int iG3 = xcg1.g((iG2 + (ok51Var == null ? 0 : ok51Var.hashCode())) * 31, 31, this.Q0);
        p860 p860Var = this.R0;
        return iG3 + (p860Var != null ? p860Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.t);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        int i2 = this.Z;
        if (i2 == 1) {
            str = "Hide";
        } else if (i2 == 2) {
            str = "Show";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ShowWithPlayability";
        }
        parcel.writeString(str);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeParcelable(this.P0, i);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeParcelable(this.R0, i);
    }

    public mb3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ugo0 ugo0Var, boolean z8, String str, boolean z9, boolean z10, int i, boolean z11, boolean z12, ok51 ok51Var, boolean z13, p860 p860Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = ugo0Var;
        this.i = z8;
        this.t = str;
        this.X = z9;
        this.Y = z10;
        this.Z = i;
        this.N0 = z11;
        this.O0 = z12;
        this.P0 = ok51Var;
        this.Q0 = z13;
        this.R0 = p860Var;
    }
}
