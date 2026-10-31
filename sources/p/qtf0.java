package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qtf0 implements Parcelable {
    public static final Parcelable.Creator<qtf0> CREATOR = new isf0((byte) 1);
    public final bef0 X;
    public final int Y;
    public final enf0 Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final gmf0 e;
    public final long f;
    public final long g;
    public final long h;
    public final double i;
    public final boolean t;

    public qtf0(String str, String str2, String str3, String str4, gmf0 gmf0Var, long j, long j2, long j3, double d, boolean z, bef0 bef0Var, int i, enf0 enf0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gmf0Var;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = d;
        this.t = z;
        this.X = bef0Var;
        this.Y = i;
        this.Z = enf0Var;
    }

    public static qtf0 a(qtf0 qtf0Var, String str, String str2, String str3, String str4, gmf0 gmf0Var, long j, long j2, long j3, double d, boolean z, bef0 bef0Var, int i, enf0 enf0Var, int i2) {
        String str5 = (i2 & 1) != 0 ? qtf0Var.a : str;
        return new qtf0(str5, (i2 & 2) != 0 ? qtf0Var.b : str2, (i2 & 4) != 0 ? qtf0Var.c : str3, (i2 & 8) != 0 ? qtf0Var.d : str4, (i2 & 16) != 0 ? qtf0Var.e : gmf0Var, (i2 & 32) != 0 ? qtf0Var.f : j, (i2 & 64) != 0 ? qtf0Var.g : j2, (i2 & 128) != 0 ? qtf0Var.h : j3, (i2 & 256) != 0 ? qtf0Var.i : d, (i2 & 512) != 0 ? qtf0Var.t : z, (i2 & 1024) != 0 ? qtf0Var.X : bef0Var, (i2 & 2048) != 0 ? qtf0Var.Y : i, (i2 & 4096) != 0 ? qtf0Var.Z : enf0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtf0)) {
            return false;
        }
        qtf0 qtf0Var = (qtf0) obj;
        return u890.j(this.a, qtf0Var.a) && u890.j(this.b, qtf0Var.b) && u890.j(this.c, qtf0Var.c) && u890.j(this.d, qtf0Var.d) && u890.j(this.e, qtf0Var.e) && this.f == qtf0Var.f && this.g == qtf0Var.g && this.h == qtf0Var.h && Double.compare(this.i, qtf0Var.i) == 0 && this.t == qtf0Var.t && u890.j(this.X, qtf0Var.X) && this.Y == qtf0Var.Y && u890.j(this.Z, qtf0Var.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + ab80.k(this.Y, (this.X.hashCode() + xcg1.g(xcg1.e(this.i, cy30.f(cy30.f(cy30.f((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, this.f, 31), this.g, 31), this.h, 31), 31), 31, this.t)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeDouble(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeParcelable(this.X, i);
        parcel.writeString(pze0.q(this.Y));
        parcel.writeParcelable(this.Z, i);
    }
}
