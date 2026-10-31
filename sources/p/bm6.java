package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bm6 implements Parcelable {
    public static final Parcelable.Creator<bm6> CREATOR = new fp5((byte) 9);
    public final p860 X;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ugo0 h;
    public final ok51 i;
    public final boolean t;

    public /* synthetic */ bm6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ok51 ok51Var, boolean z6, p860 p860Var, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0, (i & 8) != 0 ? false : z3, false, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, null, (i & 256) != 0 ? null : ok51Var, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? null : p860Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm6)) {
            return false;
        }
        bm6 bm6Var = (bm6) obj;
        return this.a == bm6Var.a && this.b == bm6Var.b && this.c == bm6Var.c && this.d == bm6Var.d && this.e == bm6Var.e && this.f == bm6Var.f && this.g == bm6Var.g && u890.j(this.h, bm6Var.h) && u890.j(this.i, bm6Var.i) && this.t == bm6Var.t && u890.j(this.X, bm6Var.X);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ugo0 ugo0Var = this.h;
        int iHashCode = (iG + (ugo0Var == null ? 0 : ugo0Var.hashCode())) * 31;
        ok51 ok51Var = this.i;
        int iG2 = xcg1.g((iHashCode + (ok51Var == null ? 0 : ok51Var.hashCode())) * 31, 31, this.t);
        p860 p860Var = this.X;
        return iG2 + (p860Var != null ? p860Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeParcelable(this.X, i);
    }

    public bm6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ugo0 ugo0Var, ok51 ok51Var, boolean z8, p860 p860Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = ugo0Var;
        this.i = ok51Var;
        this.t = z8;
        this.X = p860Var;
    }
}
