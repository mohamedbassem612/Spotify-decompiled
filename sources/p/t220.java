package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t220 implements w220 {
    public static final Parcelable.Creator<t220> CREATOR = new no10((byte) 29);
    public final int X;
    public final double Y;
    public final String a;
    public final String b;
    public final c380 c;
    public final les0 d;
    public final sds0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean t;

    public t220(String str, String str2, c380 c380Var, les0 les0Var, sds0 sds0Var, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, double d) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = les0Var;
        this.e = sds0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i;
        this.t = z4;
        this.X = i2;
        this.Y = d;
    }

    public static t220 a(t220 t220Var, int i, double d, int i2) {
        String str = t220Var.a;
        String str2 = t220Var.b;
        c380 c380Var = t220Var.c;
        les0 les0Var = t220Var.d;
        sds0 sds0Var = t220Var.e;
        boolean z = t220Var.f;
        boolean z2 = t220Var.g;
        boolean z3 = t220Var.h;
        int i3 = t220Var.i;
        boolean z4 = t220Var.t;
        int i4 = (i2 & 1024) != 0 ? t220Var.X : i;
        double d2 = (i2 & 2048) != 0 ? t220Var.Y : d;
        t220Var.getClass();
        return new t220(str, str2, c380Var, les0Var, sds0Var, z, z2, z3, i3, z4, i4, d2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t220)) {
            return false;
        }
        t220 t220Var = (t220) obj;
        return u890.j(this.a, t220Var.a) && u890.j(this.b, t220Var.b) && u890.j(this.c, t220Var.c) && u890.j(this.d, t220Var.d) && u890.j(this.e, t220Var.e) && this.f == t220Var.f && this.g == t220Var.g && this.h == t220Var.h && this.i == t220Var.i && this.t == t220Var.t && this.X == t220Var.X && Double.compare(this.Y, t220Var.Y) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.Y) + ab80.k(this.X, xcg1.g(kaa0.f(this.i, xcg1.g(xcg1.g(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31), 31, this.t), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        int i2 = this.X;
        if (i2 == 1) {
            str = "Loading";
        } else if (i2 == 2) {
            str = "Loaded";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Failed";
        }
        parcel.writeString(str);
        parcel.writeDouble(this.Y);
    }
}
