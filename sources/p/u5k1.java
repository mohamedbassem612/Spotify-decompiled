package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u5k1 extends c871 {
    public static final Parcelable.Creator<u5k1> CREATOR = new nhj1((byte) 13);
    public final String N0;
    public final boolean X;
    public final String Y;
    public final String Z;
    public final jlw0 a;
    public final jlw0 b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final s171 g;
    public final long h;
    public final vve1 i;
    public final Uri t;

    public u5k1(jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, String str2, s171 s171Var, long j, vve1 vve1Var, Uri uri, boolean z, String str3, String str4, String str5) {
        this.a = jlw0Var;
        this.b = jlw0Var2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = s171Var;
        this.h = j;
        this.i = vve1Var;
        this.t = uri;
        this.X = z;
        this.Y = str3;
        this.Z = str4;
        this.N0 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5k1)) {
            return false;
        }
        u5k1 u5k1Var = (u5k1) obj;
        return u890.j(this.a, u5k1Var.a) && u890.j(this.b, u5k1Var.b) && this.c == u5k1Var.c && this.d == u5k1Var.d && u890.j(this.e, u5k1Var.e) && u890.j(this.f, u5k1Var.f) && u890.j(this.g, u5k1Var.g) && vve1.a(this.h, u5k1Var.h) && u890.j(this.i, u5k1Var.i) && u890.j(this.t, u5k1Var.t) && this.X == u5k1Var.X && u890.j(this.Y, u5k1Var.Y) && u890.j(this.Z, u5k1Var.Z) && u890.j(this.N0, u5k1Var.N0);
    }

    public final int hashCode() {
        jlw0 jlw0Var = this.a;
        int iF = cy30.f((this.g.hashCode() + cy30.d(cy30.d(kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + ((jlw0Var == null ? 0 : jlw0Var.hashCode()) * 31)) * 31, 31), 31), 31, this.e), 31, this.f)) * 31, this.h, 31);
        vve1 vve1Var = this.i;
        int iG = xcg1.g(hrt.h(this.t, (iF + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a))) * 31, 31), 31, this.X);
        String str = this.Y;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Z;
        return this.N0.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(new vve1(this.h), i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.N0);
    }
}
