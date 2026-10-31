package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fiz0 implements Parcelable {
    public static final Parcelable.Creator<fiz0> CREATOR = new j1z0((byte) 17);
    public final boolean N0;
    public final j340 X;
    public final ybe0 Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final pbf0 f;
    public final List g;
    public final List h;
    public final int i;
    public final int t;

    public fiz0(String str, String str2, String str3, String str4, List list, pbf0 pbf0Var, List list2, List list3, int i, int i2, j340 j340Var, ybe0 ybe0Var, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = pbf0Var;
        this.g = list2;
        this.h = list3;
        this.i = i;
        this.t = i2;
        this.X = j340Var;
        this.Y = ybe0Var;
        this.Z = str5;
        this.N0 = z;
    }

    public static fiz0 a(fiz0 fiz0Var, String str, ArrayList arrayList, pbf0 pbf0Var, List list, List list2, ybe0 ybe0Var, String str2, boolean z, int i) {
        String str3 = fiz0Var.a;
        String str4 = (i & 2) != 0 ? fiz0Var.b : str;
        String str5 = fiz0Var.c;
        String str6 = str4;
        String str7 = fiz0Var.d;
        List list3 = (i & 16) != 0 ? fiz0Var.e : arrayList;
        pbf0 pbf0Var2 = (i & 32) != 0 ? fiz0Var.f : pbf0Var;
        List list4 = (i & 64) != 0 ? fiz0Var.g : list;
        List list5 = (i & 128) != 0 ? fiz0Var.h : list2;
        return new fiz0(str3, str6, str5, str7, list3, pbf0Var2, list4, list5, fiz0Var.i, fiz0Var.t, (i & 1024) != 0 ? fiz0Var.X : j340.b, (i & 2048) != 0 ? fiz0Var.Y : ybe0Var, (i & 4096) != 0 ? fiz0Var.Z : str2, (i & 8192) != 0 ? fiz0Var.N0 : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiz0)) {
            return false;
        }
        fiz0 fiz0Var = (fiz0) obj;
        return u890.j(this.a, fiz0Var.a) && u890.j(this.b, fiz0Var.b) && u890.j(this.c, fiz0Var.c) && u890.j(this.d, fiz0Var.d) && u890.j(this.e, fiz0Var.e) && u890.j(this.f, fiz0Var.f) && u890.j(this.g, fiz0Var.g) && u890.j(this.h, fiz0Var.h) && this.i == fiz0Var.i && this.t == fiz0Var.t && this.X == fiz0Var.X && u890.j(this.Y, fiz0Var.Y) && u890.j(this.Z, fiz0Var.Z) && this.N0 == fiz0Var.N0;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB = f4i1.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        pbf0 pbf0Var = this.f;
        int iHashCode2 = (this.Y.hashCode() + ((this.X.hashCode() + kaa0.f(this.t, kaa0.f(this.i, f4i1.b(f4i1.b((iB + (pbf0Var == null ? 0 : pbf0Var.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31)) * 31)) * 31;
        String str3 = this.Z;
        return Boolean.hashCode(this.N0) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.f, i);
        Iterator itM2 = kk0.m(parcel, this.g);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        Iterator itM3 = kk0.m(parcel, this.h);
        while (itM3.hasNext()) {
            parcel.writeParcelable((Parcelable) itM3.next(), i);
        }
        parcel.writeInt(this.i);
        parcel.writeInt(this.t);
        this.X.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeString(this.Z);
        parcel.writeInt(this.N0 ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fiz0(String str, String str2, String str3) {
        nbe0 nbe0Var = nbe0.a;
        z6x z6xVar = z6x.a;
        this(str, "", str2, str3, z6xVar, null, z6xVar, z6xVar, 0, 0, j340.a, nbe0Var, null, false);
    }
}
