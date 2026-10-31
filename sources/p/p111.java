package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p111 implements Parcelable {
    public static final Parcelable.Creator<p111> CREATOR = new sj01((byte) 29);
    public final boolean X;
    public final boolean Y;
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final urt0 t;

    public p111(String str, String str2, boolean z, List list, String str3, boolean z2, boolean z3, boolean z4, boolean z5, urt0 urt0Var, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.t = urt0Var;
        this.X = z6;
        this.Y = z7;
    }

    public static p111 a(p111 p111Var, boolean z, boolean z2, urt0 urt0Var, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? p111Var.c : z;
        boolean z6 = p111Var.f;
        boolean z7 = (i & 4) != 0 ? p111Var.g : z2;
        urt0 urt0Var2 = (i & 8) != 0 ? p111Var.t : urt0Var;
        boolean z8 = (i & 16) != 0 ? p111Var.h : z3;
        boolean z9 = p111Var.i;
        boolean z10 = p111Var.X;
        boolean z11 = (i & 128) != 0 ? p111Var.Y : z4;
        p111Var.getClass();
        if (p111Var instanceof p111) {
            return new p111(p111Var.a, p111Var.b, z5, p111Var.d, p111Var.e, z6, z7, z8, z9, urt0Var2, z10, z11);
        }
        eg.o();
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p111)) {
            return false;
        }
        p111 p111Var = (p111) obj;
        return u890.j(this.a, p111Var.a) && u890.j(this.b, p111Var.b) && this.c == p111Var.c && u890.j(this.d, p111Var.d) && u890.j(this.e, p111Var.e) && this.f == p111Var.f && this.g == p111Var.g && this.h == p111Var.h && this.i == p111Var.i && u890.j(this.t, p111Var.t) && this.X == p111Var.X && this.Y == p111Var.Y;
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.Y) + xcg1.g((this.t.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeStringList(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
