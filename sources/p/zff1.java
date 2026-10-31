package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zff1 implements Parcelable {
    public static final Parcelable.Creator<zff1> CREATOR = new r8f1((byte) 3);
    public final int X;
    public final List Y;
    public final String a;
    public final String b;
    public final d761 c;
    public final xxh d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final d761 i;
    public final String t;

    public zff1(String str, String str2, d761 d761Var, xxh xxhVar, String str3, int i, String str4, String str5, d761 d761Var2, String str6, int i2, List list) {
        this.a = str;
        this.b = str2;
        this.c = d761Var;
        this.d = xxhVar;
        this.e = str3;
        this.f = i;
        this.g = str4;
        this.h = str5;
        this.i = d761Var2;
        this.t = str6;
        this.X = i2;
        this.Y = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zff1)) {
            return false;
        }
        zff1 zff1Var = (zff1) obj;
        return u890.j(this.a, zff1Var.a) && u890.j(this.b, zff1Var.b) && u890.j(this.c, zff1Var.c) && u890.j(this.d, zff1Var.d) && u890.j(this.e, zff1Var.e) && this.f == zff1Var.f && u890.j(this.g, zff1Var.g) && u890.j(this.h, zff1Var.h) && u890.j(this.i, zff1Var.i) && u890.j(this.t, zff1Var.t) && this.X == zff1Var.X && u890.j(this.Y, zff1Var.Y);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        d761 d761Var = this.c;
        int iD2 = cy30.d(cy30.d(kaa0.f(this.f, cy30.d((this.d.hashCode() + ((iD + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31)) * 31, 31, this.e), 31), 31, this.g), 31, this.h);
        d761 d761Var2 = this.i;
        int iD3 = cy30.d((iD2 + (d761Var2 == null ? 0 : Arrays.hashCode(d761Var2.a))) * 31, 31, this.t);
        int i = this.X;
        return this.Y.hashCode() + ((iD3 + (i != 0 ? l1d.C(i) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.t);
        int i2 = this.X;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(us71.q(i2));
        }
        Iterator itM = kk0.m(parcel, this.Y);
        while (itM.hasNext()) {
            ((vff1) itM.next()).writeToParcel(parcel, i);
        }
    }
}
