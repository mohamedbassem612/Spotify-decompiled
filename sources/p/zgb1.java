package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zgb1 extends bhb1 {
    public static final Parcelable.Creator<zgb1> CREATOR = new nja1(24);
    public final cuu0 N0;
    public final boolean O0;
    public final List X;
    public final int Y;
    public final boolean Z;
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final wkt e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final llw0 t;

    public /* synthetic */ zgb1(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, wkt wktVar, String str, String str2, String str3, int i2, llw0 llw0Var, ArrayList arrayList, int i3, boolean z, cuu0 cuu0Var, boolean z2, int i4) {
        this(i, z771Var, ez61Var, wa71Var, (i4 & 16) != 0 ? null : wktVar, str, str2, str3, i2, llw0Var, arrayList, i3, (i4 & 4096) != 0 ? false : z, cuu0Var, z2);
    }

    public static zgb1 l(zgb1 zgb1Var, int i, wkt wktVar, String str, String str2, String str3, int i2, llw0 llw0Var, ArrayList arrayList, int i3, boolean z, cuu0 cuu0Var, int i4) {
        return new zgb1((i4 & 1) != 0 ? zgb1Var.a : i, zgb1Var.b, zgb1Var.c, zgb1Var.d, (i4 & 16) != 0 ? zgb1Var.e : wktVar, (i4 & 32) != 0 ? zgb1Var.f : str, (i4 & 64) != 0 ? zgb1Var.g : str2, (i4 & 128) != 0 ? zgb1Var.h : str3, (i4 & 256) != 0 ? zgb1Var.i : i2, (i4 & 512) != 0 ? zgb1Var.t : llw0Var, (i4 & 1024) != 0 ? zgb1Var.X : arrayList, (i4 & 2048) != 0 ? zgb1Var.Y : i3, (i4 & 4096) != 0 ? zgb1Var.Z : z, (i4 & 8192) != 0 ? zgb1Var.N0 : cuu0Var, zgb1Var.O0);
    }

    public final ez61 a() {
        return this.c;
    }

    public final boolean b() {
        return this.O0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgb1)) {
            return false;
        }
        zgb1 zgb1Var = (zgb1) obj;
        return this.a == zgb1Var.a && u890.j(this.b, zgb1Var.b) && u890.j(this.c, zgb1Var.c) && u890.j(this.d, zgb1Var.d) && u890.j(this.e, zgb1Var.e) && u890.j(this.f, zgb1Var.f) && u890.j(this.g, zgb1Var.g) && u890.j(this.h, zgb1Var.h) && this.i == zgb1Var.i && u890.j(this.t, zgb1Var.t) && u890.j(this.X, zgb1Var.X) && this.Y == zgb1Var.Y && this.Z == zgb1Var.Z && u890.j(this.N0, zgb1Var.N0) && this.O0 == zgb1Var.O0;
    }

    public final z771 g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31;
        wkt wktVar = this.e;
        int iG = xcg1.g(kaa0.f(this.Y, f4i1.b((this.t.hashCode() + kaa0.f(this.i, cy30.d(cy30.d(cy30.d((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31)) * 31, 31, this.X), 31), 31, this.Z);
        cuu0 cuu0Var = this.N0;
        return Boolean.hashCode(this.O0) + ((iG + (cuu0Var != null ? cuu0Var.hashCode() : 0)) * 31);
    }

    public final wa71 j() {
        return this.d;
    }

    public final wkt k() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeParcelable(this.t, i);
        Iterator itM = kk0.m(parcel, this.X);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeParcelable(this.N0, i);
        parcel.writeInt(this.O0 ? 1 : 0);
    }

    public zgb1(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, wkt wktVar, String str, String str2, String str3, int i2, llw0 llw0Var, List list, int i3, boolean z, cuu0 cuu0Var, boolean z2) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = wktVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i2;
        this.t = llw0Var;
        this.X = list;
        this.Y = i3;
        this.Z = z;
        this.N0 = cuu0Var;
        this.O0 = z2;
    }
}
