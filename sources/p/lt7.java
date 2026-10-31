package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lt7 implements Parcelable {
    public static final Parcelable.Creator<lt7> CREATOR = new f67((byte) 28);
    public final wkt N0;
    public final vve1 X;
    public final vve1 Y;
    public final String Z;
    public final u771 a;
    public final int b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final s171 h;
    public final String i;
    public final String t;

    public lt7(u771 u771Var, int i, jlw0 jlw0Var, int i2, int i3, String str, String str2, s171 s171Var, String str3, String str4, vve1 vve1Var, vve1 vve1Var2, String str5, wkt wktVar) {
        this.a = u771Var;
        this.b = i;
        this.c = jlw0Var;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = s171Var;
        this.i = str3;
        this.t = str4;
        this.X = vve1Var;
        this.Y = vve1Var2;
        this.Z = str5;
        this.N0 = wktVar;
    }

    public static lt7 a(lt7 lt7Var, String str, s171 s171Var, vve1 vve1Var, vve1 vve1Var2, String str2, wkt wktVar, int i) {
        u771 u771Var = lt7Var.a;
        int i2 = lt7Var.b;
        jlw0 jlw0Var = lt7Var.c;
        int i3 = lt7Var.d;
        int i4 = lt7Var.e;
        String str3 = (i & 32) != 0 ? lt7Var.f : str;
        String str4 = lt7Var.g;
        s171 s171Var2 = (i & 128) != 0 ? lt7Var.h : s171Var;
        return new lt7(u771Var, i2, jlw0Var, i3, i4, str3, str4, s171Var2, lt7Var.i, lt7Var.t, (i & 1024) != 0 ? lt7Var.X : vve1Var, (i & 2048) != 0 ? lt7Var.Y : vve1Var2, (i & 4096) != 0 ? lt7Var.Z : str2, (i & 8192) != 0 ? lt7Var.N0 : wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt7)) {
            return false;
        }
        lt7 lt7Var = (lt7) obj;
        return u890.j(this.a, lt7Var.a) && this.b == lt7Var.b && u890.j(this.c, lt7Var.c) && this.d == lt7Var.d && this.e == lt7Var.e && u890.j(this.f, lt7Var.f) && u890.j(this.g, lt7Var.g) && u890.j(this.h, lt7Var.h) && u890.j(this.i, lt7Var.i) && u890.j(this.t, lt7Var.t) && u890.j(this.X, lt7Var.X) && u890.j(this.Y, lt7Var.Y) && u890.j(this.Z, lt7Var.Z) && u890.j(this.N0, lt7Var.N0);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + cy30.d(cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        vve1 vve1Var = this.X;
        int iHashCode4 = (iHashCode3 + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a))) * 31;
        vve1 vve1Var2 = this.Y;
        int iHashCode5 = (iHashCode4 + (vve1Var2 == null ? 0 : Long.hashCode(vve1Var2.a))) * 31;
        String str3 = this.Z;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        wkt wktVar = this.N0;
        return iHashCode6 + (wktVar != null ? wktVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(lf51.q(this.b));
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeString(this.Z);
    }
}
