package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a3e1 implements Parcelable {
    public static final Parcelable.Creator<a3e1> CREATOR = new pwd1((byte) 5);
    public final wkt N0;
    public final String O0;
    public final String X;
    public final String Y;
    public final s171 Z;
    public final u771 a;
    public final int b;
    public final y2e1 c;
    public final String d;
    public final long e;
    public final fee1 f;
    public final int g;
    public final int h;
    public final Uri i;
    public final String t;

    public a3e1(u771 u771Var, int i, y2e1 y2e1Var, String str, long j, fee1 fee1Var, int i2, int i3, Uri uri, String str2, String str3, String str4, s171 s171Var, wkt wktVar, String str5) {
        this.a = u771Var;
        this.b = i;
        this.c = y2e1Var;
        this.d = str;
        this.e = j;
        this.f = fee1Var;
        this.g = i2;
        this.h = i3;
        this.i = uri;
        this.t = str2;
        this.X = str3;
        this.Y = str4;
        this.Z = s171Var;
        this.N0 = wktVar;
        this.O0 = str5;
    }

    public static a3e1 a(a3e1 a3e1Var, y2e1 y2e1Var, long j, eee1 eee1Var, String str, s171 s171Var, wkt wktVar, String str2, int i) {
        u771 u771Var = a3e1Var.a;
        int i2 = a3e1Var.b;
        y2e1 y2e1Var2 = (i & 4) != 0 ? a3e1Var.c : y2e1Var;
        String str3 = a3e1Var.d;
        long j2 = (i & 16) != 0 ? a3e1Var.e : j;
        fee1 fee1Var = (i & 32) != 0 ? a3e1Var.f : eee1Var;
        return new a3e1(u771Var, i2, y2e1Var2, str3, j2, fee1Var, a3e1Var.g, a3e1Var.h, a3e1Var.i, a3e1Var.t, (i & 1024) != 0 ? a3e1Var.X : str, a3e1Var.Y, (i & 4096) != 0 ? a3e1Var.Z : s171Var, (i & 8192) != 0 ? a3e1Var.N0 : wktVar, (i & 16384) != 0 ? a3e1Var.O0 : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3e1)) {
            return false;
        }
        a3e1 a3e1Var = (a3e1) obj;
        return u890.j(this.a, a3e1Var.a) && this.b == a3e1Var.b && u890.j(this.c, a3e1Var.c) && u890.j(this.d, a3e1Var.d) && vve1.a(this.e, a3e1Var.e) && u890.j(this.f, a3e1Var.f) && this.g == a3e1Var.g && this.h == a3e1Var.h && u890.j(this.i, a3e1Var.i) && u890.j(this.t, a3e1Var.t) && u890.j(this.X, a3e1Var.X) && u890.j(this.Y, a3e1Var.Y) && u890.j(this.Z, a3e1Var.Z) && u890.j(this.N0, a3e1Var.N0) && u890.j(this.O0, a3e1Var.O0);
    }

    public final int hashCode() {
        int iHashCode = (this.Z.hashCode() + cy30.d(cy30.d(cy30.d(hrt.h(this.i, kaa0.f(this.h, kaa0.f(this.g, (this.f.hashCode() + cy30.f(cy30.d((this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), this.e, 31)) * 31, 31), 31), 31), 31, this.t), 31, this.X), 31, this.Y)) * 31;
        wkt wktVar = this.N0;
        int iHashCode2 = (iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31;
        String str = this.O0;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(lf51.q(this.b));
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeParcelable(new vve1(this.e), i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeParcelable(this.Z, i);
        parcel.writeString(this.O0);
    }
}
