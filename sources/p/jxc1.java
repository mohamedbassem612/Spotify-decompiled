package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jxc1 implements Parcelable {
    public static final Parcelable.Creator<jxc1> CREATOR = new y7c1(28);
    public final boolean X;
    public final jq70 Y;
    public final v660 a;
    public final jq70 b;
    public final zud c;
    public final zud d;
    public final zud e;
    public final zud f;
    public final String g;
    public final int h;
    public final String i;
    public final String t;

    public jxc1(v660 v660Var, jq70 jq70Var, zud zudVar, zud zudVar2, zud zudVar3, zud zudVar4, String str, int i, String str2, String str3, boolean z, jq70 jq70Var2) {
        this.a = v660Var;
        this.b = jq70Var;
        this.c = zudVar;
        this.d = zudVar2;
        this.e = zudVar3;
        this.f = zudVar4;
        this.g = str;
        this.h = i;
        this.i = str2;
        this.t = str3;
        this.X = z;
        this.Y = jq70Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxc1)) {
            return false;
        }
        jxc1 jxc1Var = (jxc1) obj;
        return u890.j(this.a, jxc1Var.a) && u890.j(this.b, jxc1Var.b) && u890.j(this.c, jxc1Var.c) && u890.j(this.d, jxc1Var.d) && u890.j(this.e, jxc1Var.e) && u890.j(this.f, jxc1Var.f) && u890.j(this.g, jxc1Var.g) && this.h == jxc1Var.h && u890.j(this.i, jxc1Var.i) && u890.j(this.t, jxc1Var.t) && this.X == jxc1Var.X && u890.j(this.Y, jxc1Var.Y);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zud zudVar = this.c;
        int iHashCode2 = (iHashCode + (zudVar == null ? 0 : zudVar.hashCode())) * 31;
        zud zudVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (zudVar2 == null ? 0 : zudVar2.hashCode())) * 31;
        zud zudVar3 = this.e;
        int iHashCode4 = (iHashCode3 + (zudVar3 == null ? 0 : zudVar3.hashCode())) * 31;
        zud zudVar4 = this.f;
        int iG = xcg1.g(cy30.d(cy30.d(kaa0.f(this.h, cy30.d((iHashCode4 + (zudVar4 == null ? 0 : zudVar4.hashCode())) * 31, 31, this.g), 31), 31, this.i), 31, this.t), 31, this.X);
        jq70 jq70Var = this.Y;
        return iG + (jq70Var != null ? jq70Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        zud zudVar = this.c;
        if (zudVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zudVar.writeToParcel(parcel, i);
        }
        zud zudVar2 = this.d;
        if (zudVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zudVar2.writeToParcel(parcel, i);
        }
        zud zudVar3 = this.e;
        if (zudVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zudVar3.writeToParcel(parcel, i);
        }
        zud zudVar4 = this.f;
        if (zudVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zudVar4.writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeParcelable(this.Y, i);
    }
}
