package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x7i1 implements Parcelable {
    public static final Parcelable.Creator<x7i1> CREATOR = new gwg1((byte) 27);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final exc0 g;
    public final rc50 h;
    public final boolean i;
    public final boolean t;

    public /* synthetic */ x7i1(boolean z, exc0 exc0Var, rc50 rc50Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        rc50 rc50Var2;
        boolean z7 = (i & 2) != 0 ? false : z;
        exc0 exc0Var2 = (i & 64) != 0 ? new exc0(false, false, false) : exc0Var;
        if ((i & 128) != 0) {
            z6x z6xVar = z6x.a;
            rc50Var2 = new rc50(z6xVar, z6xVar);
        } else {
            rc50Var2 = rc50Var;
        }
        this(false, z7, false, false, false, false, exc0Var2, rc50Var2, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? false : z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7i1)) {
            return false;
        }
        x7i1 x7i1Var = (x7i1) obj;
        return this.a == x7i1Var.a && this.b == x7i1Var.b && this.c == x7i1Var.c && this.d == x7i1Var.d && this.e == x7i1Var.e && this.f == x7i1Var.f && u890.j(this.g, x7i1Var.g) && u890.j(this.h, x7i1Var.h) && this.i == x7i1Var.i && this.t == x7i1Var.t && this.X == x7i1Var.X && this.Y == x7i1Var.Y && this.Z == x7i1Var.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.h.hashCode() + ((this.g.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.t), 31, this.X), 31, this.Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        this.h.writeToParcel(parcel, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public x7i1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, exc0 exc0Var, rc50 rc50Var, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = exc0Var;
        this.h = rc50Var;
        this.i = z7;
        this.t = z8;
        this.X = z9;
        this.Y = z10;
        this.Z = z11;
    }
}
