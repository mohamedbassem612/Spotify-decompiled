package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lbc1 implements Parcelable {
    public static final Parcelable.Creator<lbc1> CREATOR = new y7c1(3);
    public final eb71 X;
    public final u4c1 a;
    public final int b;
    public final int c;
    public final kas0 d;
    public final jix0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public lbc1(u4c1 u4c1Var, int i, int i2, kas0 kas0Var, jix0 jix0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, eb71 eb71Var) {
        this.a = u4c1Var;
        this.b = i;
        this.c = i2;
        this.d = kas0Var;
        this.e = jix0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.t = z5;
        this.X = eb71Var;
    }

    public static lbc1 a(lbc1 lbc1Var, u4c1 u4c1Var, int i, int i2, kas0 kas0Var, jix0 jix0Var, boolean z, boolean z2, boolean z3, boolean z4, eb71 eb71Var, int i3) {
        if ((i3 & 1) != 0) {
            u4c1Var = lbc1Var.a;
        }
        u4c1 u4c1Var2 = u4c1Var;
        if ((i3 & 2) != 0) {
            i = lbc1Var.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = lbc1Var.c;
        }
        int i5 = i2;
        kas0 kas0Var2 = (i3 & 8) != 0 ? lbc1Var.d : kas0Var;
        jix0 jix0Var2 = (i3 & 16) != 0 ? lbc1Var.e : jix0Var;
        boolean z5 = (i3 & 32) != 0 ? lbc1Var.f : z;
        boolean z6 = (i3 & 64) != 0 ? lbc1Var.g : z2;
        boolean z7 = (i3 & 128) != 0 ? lbc1Var.h : z3;
        boolean z8 = (i3 & 256) != 0 ? lbc1Var.i : true;
        boolean z9 = (i3 & 512) != 0 ? lbc1Var.t : z4;
        eb71 eb71Var2 = (i3 & 1024) != 0 ? lbc1Var.X : eb71Var;
        lbc1Var.getClass();
        return new lbc1(u4c1Var2, i4, i5, kas0Var2, jix0Var2, z5, z6, z7, z8, z9, eb71Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbc1)) {
            return false;
        }
        lbc1 lbc1Var = (lbc1) obj;
        return u890.j(this.a, lbc1Var.a) && this.b == lbc1Var.b && this.c == lbc1Var.c && this.d == lbc1Var.d && this.e == lbc1Var.e && this.f == lbc1Var.f && this.g == lbc1Var.g && this.h == lbc1Var.h && this.i == lbc1Var.i && this.t == lbc1Var.t && this.X == lbc1Var.X;
    }

    public final int hashCode() {
        return this.X.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
        parcel.writeString(this.e.name());
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X.name());
    }
}
