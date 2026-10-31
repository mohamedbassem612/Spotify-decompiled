package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bmg1 implements Parcelable {
    public static final Parcelable.Creator<bmg1> CREATOR = new h3g1((byte) 10);
    public final String a;
    public final boolean b;
    public final yig1 c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final jmg1 h;
    public final yq00 i;

    public bmg1(String str, boolean z, yig1 yig1Var, boolean z2, long j, String str2, String str3, jmg1 jmg1Var, yq00 yq00Var) {
        this.a = str;
        this.b = z;
        this.c = yig1Var;
        this.d = z2;
        this.e = j;
        this.f = str2;
        this.g = str3;
        this.h = jmg1Var;
        this.i = yq00Var;
    }

    public static bmg1 a(bmg1 bmg1Var, long j, String str, String str2, jmg1 jmg1Var, int i) {
        String str3 = bmg1Var.a;
        boolean z = bmg1Var.b;
        yig1 yig1Var = bmg1Var.c;
        boolean z2 = bmg1Var.d;
        if ((i & 16) != 0) {
            j = bmg1Var.e;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            str = bmg1Var.f;
        }
        return new bmg1(str3, z, yig1Var, z2, j2, str, (i & 64) != 0 ? bmg1Var.g : str2, (i & 128) != 0 ? bmg1Var.h : jmg1Var, bmg1Var.i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmg1)) {
            return false;
        }
        bmg1 bmg1Var = (bmg1) obj;
        return u890.j(this.a, bmg1Var.a) && this.b == bmg1Var.b && u890.j(this.c, bmg1Var.c) && this.d == bmg1Var.d && this.e == bmg1Var.e && u890.j(this.f, bmg1Var.f) && u890.j(this.g, bmg1Var.g) && u890.j(this.h, bmg1Var.h) && u890.j(this.i, bmg1Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        yig1 yig1Var = this.c;
        int iF = cy30.f(xcg1.g((iG + (yig1Var == null ? 0 : yig1Var.hashCode())) * 31, 31, this.d), this.e, 31);
        String str = this.f;
        int iHashCode = (this.h.hashCode() + cy30.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.g)) * 31;
        yq00 yq00Var = this.i;
        return iHashCode + (yq00Var != null ? yq00Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
    }
}
