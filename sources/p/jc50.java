package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jc50 implements Parcelable {
    public static final Parcelable.Creator<jc50> CREATOR = new n750((byte) 16);
    public final boolean X;
    public final String Y;
    public final String a;
    public final String b;
    public final String c;
    public final hct0 d;
    public final int e;
    public final int f;
    public final v850 g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public jc50(String str, String str2, String str3, hct0 hct0Var, int i, int i2, v850 v850Var, boolean z, boolean z2, boolean z3, boolean z4, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hct0Var;
        this.e = i;
        this.f = i2;
        this.g = v850Var;
        this.h = z;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Y = str4;
    }

    public static jc50 a(jc50 jc50Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str = jc50Var.a;
        String str2 = jc50Var.b;
        String str3 = jc50Var.c;
        hct0 hct0Var = jc50Var.d;
        int i2 = jc50Var.e;
        int i3 = jc50Var.f;
        v850 v850Var = jc50Var.g;
        if ((i & 128) != 0) {
            z = jc50Var.h;
        }
        return new jc50(str, str2, str3, hct0Var, i2, i3, v850Var, z, (i & 256) != 0 ? jc50Var.i : z2, (i & 512) != 0 ? jc50Var.t : z3, (i & 1024) != 0 ? jc50Var.X : z4, jc50Var.Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc50)) {
            return false;
        }
        jc50 jc50Var = (jc50) obj;
        return u890.j(this.a, jc50Var.a) && u890.j(this.b, jc50Var.b) && u890.j(this.c, jc50Var.c) && u890.j(this.d, jc50Var.d) && this.e == jc50Var.e && this.f == jc50Var.f && this.g == jc50Var.g && this.h == jc50Var.h && this.i == jc50Var.i && this.t == jc50Var.t && this.X == jc50Var.X && u890.j(this.Y, jc50Var.Y);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.Y.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.g.hashCode() + kaa0.f(this.f, kaa0.f(this.e, (this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31)) * 31, 31, this.h), 31, this.i), 31, this.t), 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g.name());
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
    }
}
