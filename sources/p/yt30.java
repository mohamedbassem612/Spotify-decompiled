package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yt30 extends au30 {
    public static final Parcelable.Creator<yt30> CREATOR = new xt30((byte) 0);
    public final cuu0 N0;
    public final int X;
    public final llw0 Y;
    public final List Z;
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final wkt e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String t;

    public yt30(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, wkt wktVar, String str, String str2, String str3, String str4, String str5, int i2, llw0 llw0Var, List list, cuu0 cuu0Var) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = wktVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.t = str5;
        this.X = i2;
        this.Y = llw0Var;
        this.Z = list;
        this.N0 = cuu0Var;
    }

    public static yt30 n(yt30 yt30Var, int i, wkt wktVar, String str, String str2, String str3, int i2, llw0 llw0Var, List list, cuu0 cuu0Var, int i3) {
        return new yt30((i3 & 1) != 0 ? yt30Var.a : i, yt30Var.b, yt30Var.c, yt30Var.d, (i3 & 16) != 0 ? yt30Var.e : wktVar, yt30Var.f, yt30Var.g, (i3 & 128) != 0 ? yt30Var.h : str, (i3 & 256) != 0 ? yt30Var.i : str2, (i3 & 512) != 0 ? yt30Var.t : str3, (i3 & 1024) != 0 ? yt30Var.X : i2, (i3 & 2048) != 0 ? yt30Var.Y : llw0Var, (i3 & 4096) != 0 ? yt30Var.Z : list, (i3 & 8192) != 0 ? yt30Var.N0 : cuu0Var);
    }

    public final ez61 a() {
        return this.c;
    }

    public final String b() {
        return this.g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt30)) {
            return false;
        }
        yt30 yt30Var = (yt30) obj;
        return this.a == yt30Var.a && u890.j(this.b, yt30Var.b) && u890.j(this.c, yt30Var.c) && u890.j(this.d, yt30Var.d) && u890.j(this.e, yt30Var.e) && u890.j(this.f, yt30Var.f) && u890.j(this.g, yt30Var.g) && u890.j(this.h, yt30Var.h) && u890.j(this.i, yt30Var.i) && u890.j(this.t, yt30Var.t) && this.X == yt30Var.X && u890.j(this.Y, yt30Var.Y) && u890.j(this.Z, yt30Var.Z) && u890.j(this.N0, yt30Var.N0);
    }

    public final String g() {
        return this.f;
    }

    public final z771 h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31;
        wkt wktVar = this.e;
        int iD = cy30.d((iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int iB = f4i1.b((this.Y.hashCode() + kaa0.f(this.X, cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.t), 31)) * 31, 31, this.Z);
        cuu0 cuu0Var = this.N0;
        return iB + (cuu0Var != null ? cuu0Var.hashCode() : 0);
    }

    public final int j() {
        return this.a;
    }

    public final wa71 k() {
        return this.d;
    }

    public final wkt l() {
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
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeInt(this.X);
        parcel.writeParcelable(this.Y, i);
        parcel.writeStringList(this.Z);
        parcel.writeParcelable(this.N0, i);
    }
}
