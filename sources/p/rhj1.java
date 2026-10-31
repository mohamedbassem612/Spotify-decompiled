package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rhj1 implements Parcelable {
    public static final Parcelable.Creator<rhj1> CREATOR = new nhj1(1);
    public final phj1 X;
    public final wkt Y;
    public final String a;
    public final String b;
    public final jlw0 c;
    public final jlw0 d;
    public final int e;
    public final int f;
    public final String g;
    public final u771 h;
    public final long i;
    public final boolean t;

    public /* synthetic */ rhj1(String str, String str2, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str3, u771 u771Var, long j, boolean z, phj1 phj1Var, int i3) {
        this(str, str2, jlw0Var, jlw0Var2, i, i2, str3, u771Var, j, z, (i3 & 1024) != 0 ? ohj1.a : phj1Var, (wkt) null);
    }

    public static rhj1 a(rhj1 rhj1Var, String str, jlw0 jlw0Var, u771 u771Var, phj1 phj1Var, wkt wktVar, int i) {
        return new rhj1(rhj1Var.a, (i & 2) != 0 ? rhj1Var.b : str, (i & 4) != 0 ? rhj1Var.c : jlw0Var, rhj1Var.d, rhj1Var.e, rhj1Var.f, rhj1Var.g, (i & 128) != 0 ? rhj1Var.h : u771Var, rhj1Var.i, rhj1Var.t, (i & 1024) != 0 ? rhj1Var.X : phj1Var, (i & 2048) != 0 ? rhj1Var.Y : wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhj1)) {
            return false;
        }
        rhj1 rhj1Var = (rhj1) obj;
        return u890.j(this.a, rhj1Var.a) && u890.j(this.b, rhj1Var.b) && u890.j(this.c, rhj1Var.c) && u890.j(this.d, rhj1Var.d) && this.e == rhj1Var.e && this.f == rhj1Var.f && u890.j(this.g, rhj1Var.g) && u890.j(this.h, rhj1Var.h) && vve1.a(this.i, rhj1Var.i) && this.t == rhj1Var.t && u890.j(this.X, rhj1Var.X) && u890.j(this.Y, rhj1Var.Y);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jlw0 jlw0Var = this.c;
        int iHashCode = (this.X.hashCode() + xcg1.g(cy30.f(cfm0.g(this.h, cy30.d(kaa0.f(this.f, kaa0.f(this.e, (this.d.hashCode() + ((iD + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.g), 31), this.i, 31), 31, this.t)) * 31;
        wkt wktVar = this.Y;
        return iHashCode + (wktVar != null ? wktVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(new vve1(this.i), i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeParcelable(this.X, i);
    }

    public rhj1(String str, String str2, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str3, u771 u771Var, long j, boolean z, phj1 phj1Var, wkt wktVar) {
        this.a = str;
        this.b = str2;
        this.c = jlw0Var;
        this.d = jlw0Var2;
        this.e = i;
        this.f = i2;
        this.g = str3;
        this.h = u771Var;
        this.i = j;
        this.t = z;
        this.X = phj1Var;
        this.Y = wktVar;
    }
}
