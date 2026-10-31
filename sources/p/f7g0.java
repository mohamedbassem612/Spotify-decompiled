package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f7g0 implements o6g0 {
    public static final Parcelable.Creator<f7g0> CREATOR = new isf0((byte) 17);
    public final boolean X;
    public final boolean Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public f7g0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = z5;
        this.Y = z6;
    }

    public static f7g0 a(f7g0 f7g0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str = f7g0Var.a;
        String str2 = f7g0Var.b;
        String str3 = f7g0Var.c;
        String str4 = f7g0Var.d;
        String str5 = f7g0Var.e;
        String str6 = f7g0Var.f;
        boolean z5 = f7g0Var.g;
        boolean z6 = f7g0Var.h;
        if ((i & 256) != 0) {
            z = f7g0Var.i;
        }
        return new f7g0(str, str2, str3, str4, str5, str6, z5, z6, z, (i & 512) != 0 ? f7g0Var.t : z2, (i & 1024) != 0 ? f7g0Var.X : z3, (i & 2048) != 0 ? f7g0Var.Y : z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7g0)) {
            return false;
        }
        f7g0 f7g0Var = (f7g0) obj;
        return u890.j(this.a, f7g0Var.a) && u890.j(this.b, f7g0Var.b) && u890.j(this.c, f7g0Var.c) && u890.j(this.d, f7g0Var.d) && u890.j(this.e, f7g0Var.e) && u890.j(this.f, f7g0Var.f) && this.g == f7g0Var.g && this.h == f7g0Var.h && this.i == f7g0Var.i && this.t == f7g0Var.t && this.X == f7g0Var.X && this.Y == f7g0Var.Y;
    }

    @Override // p.o6g0
    public final String getUri() {
        return this.b;
    }

    @Override // p.o6g0
    public final String getUuid() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return Boolean.hashCode(this.Y) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
