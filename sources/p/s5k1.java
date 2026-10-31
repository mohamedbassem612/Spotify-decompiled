package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s5k1 implements Parcelable {
    public static final Parcelable.Creator<s5k1> CREATOR = new nhj1(12);
    public final q5k1 N0;
    public final wkt O0;
    public final String P0;
    public final String Q0;
    public final Uri X;
    public final boolean Y;
    public final vve1 Z;
    public final String a;
    public final jlw0 b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final s171 h;
    public final u771 i;
    public final long t;

    public /* synthetic */ s5k1(String str, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str2, String str3, s171 s171Var, u771 u771Var, long j, Uri uri, boolean z, vve1 vve1Var, q5k1 q5k1Var, String str4, String str5, int i3) {
        this(str, jlw0Var, jlw0Var2, i, i2, str2, str3, s171Var, u771Var, j, uri, z, vve1Var, (i3 & 8192) != 0 ? p5k1.a : q5k1Var, (wkt) null, str4, str5);
    }

    public static s5k1 a(s5k1 s5k1Var, String str, s171 s171Var, long j, vve1 vve1Var, q5k1 q5k1Var, wkt wktVar, String str2, int i) {
        String str3 = s5k1Var.a;
        jlw0 jlw0Var = s5k1Var.b;
        jlw0 jlw0Var2 = s5k1Var.c;
        int i2 = s5k1Var.d;
        int i3 = s5k1Var.e;
        String str4 = (i & 32) != 0 ? s5k1Var.f : str;
        String str5 = s5k1Var.g;
        s171 s171Var2 = (i & 128) != 0 ? s5k1Var.h : s171Var;
        u771 u771Var = s5k1Var.i;
        long j2 = (i & 512) != 0 ? s5k1Var.t : j;
        return new s5k1(str3, jlw0Var, jlw0Var2, i2, i3, str4, str5, s171Var2, u771Var, j2, s5k1Var.X, s5k1Var.Y, (i & 4096) != 0 ? s5k1Var.Z : vve1Var, (i & 8192) != 0 ? s5k1Var.N0 : q5k1Var, (i & 16384) != 0 ? s5k1Var.O0 : wktVar, (i & 32768) != 0 ? s5k1Var.P0 : str2, s5k1Var.Q0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5k1)) {
            return false;
        }
        s5k1 s5k1Var = (s5k1) obj;
        return u890.j(this.a, s5k1Var.a) && u890.j(this.b, s5k1Var.b) && u890.j(this.c, s5k1Var.c) && this.d == s5k1Var.d && this.e == s5k1Var.e && u890.j(this.f, s5k1Var.f) && u890.j(this.g, s5k1Var.g) && u890.j(this.h, s5k1Var.h) && u890.j(this.i, s5k1Var.i) && vve1.a(this.t, s5k1Var.t) && u890.j(this.X, s5k1Var.X) && this.Y == s5k1Var.Y && u890.j(this.Z, s5k1Var.Z) && u890.j(this.N0, s5k1Var.N0) && u890.j(this.O0, s5k1Var.O0) && u890.j(this.P0, s5k1Var.P0) && u890.j(this.Q0, s5k1Var.Q0);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jlw0 jlw0Var = this.b;
        int iG = xcg1.g(hrt.h(this.X, cy30.f(cfm0.g(this.i, (this.h.hashCode() + cy30.d(cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((iHashCode + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.f), 31, this.g)) * 31, 31), this.t, 31), 31), 31, this.Y);
        vve1 vve1Var = this.Z;
        int iHashCode2 = (this.N0.hashCode() + ((iG + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a))) * 31)) * 31;
        wkt wktVar = this.O0;
        int iHashCode3 = (iHashCode2 + (wktVar == null ? 0 : wktVar.hashCode())) * 31;
        String str = this.P0;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Q0;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(new vve1(this.t), i);
        parcel.writeParcelable(this.X, i);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeParcelable(this.Z, i);
        parcel.writeParcelable(this.N0, i);
        parcel.writeString(this.P0);
        parcel.writeString(this.Q0);
    }

    public s5k1(String str, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str2, String str3, s171 s171Var, u771 u771Var, long j, Uri uri, boolean z, vve1 vve1Var, q5k1 q5k1Var, wkt wktVar, String str4, String str5) {
        this.a = str;
        this.b = jlw0Var;
        this.c = jlw0Var2;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = s171Var;
        this.i = u771Var;
        this.t = j;
        this.X = uri;
        this.Y = z;
        this.Z = vve1Var;
        this.N0 = q5k1Var;
        this.O0 = wktVar;
        this.P0 = str4;
        this.Q0 = str5;
    }
}
