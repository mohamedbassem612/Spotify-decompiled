package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o2v0 extends ei90 {
    public static final Parcelable.Creator<o2v0> CREATOR = new g0v0((byte) 1);
    public final String a;
    public final String b;
    public final kfv c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final wve1 g;
    public final boolean h;
    public final String i;
    public final lle t;

    public o2v0(String str, String str2, kfv kfvVar, boolean z, boolean z2, boolean z3, wve1 wve1Var, boolean z4, String str3, lle lleVar) {
        this.a = str;
        this.b = str2;
        this.c = kfvVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = wve1Var;
        this.h = z4;
        this.i = str3;
        this.t = lleVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2v0)) {
            return false;
        }
        o2v0 o2v0Var = (o2v0) obj;
        return u890.j(this.a, o2v0Var.a) && u890.j(this.b, o2v0Var.b) && u890.j(this.c, o2v0Var.c) && this.d == o2v0Var.d && this.e == o2v0Var.e && this.f == o2v0Var.f && u890.j(this.g, o2v0Var.g) && this.h == o2v0Var.h && u890.j(this.i, o2v0Var.i) && this.t == o2v0Var.t;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.f(xcg1.g(xcg1.g(xcg1.g(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c.a, 31), 31, this.d), 31, this.e), 31, this.f), this.g.a, 31), 31, this.h);
        String str = this.i;
        return this.t.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        this.t.writeToParcel(parcel, i);
    }
}
