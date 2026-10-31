package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yh90 implements hi90, Parcelable {
    public static final Parcelable.Creator<yh90> CREATOR = new qg90((byte) 12);
    public final List X;
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

    public yh90(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5) {
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
        this.X = list;
        this.Y = z5;
    }

    public static yh90 a(yh90 yh90Var, boolean z, int i) {
        String str = yh90Var.a;
        String str2 = yh90Var.b;
        String str3 = (i & 4) != 0 ? yh90Var.c : "";
        String str4 = yh90Var.d;
        String str5 = yh90Var.e;
        String str6 = yh90Var.f;
        boolean z2 = yh90Var.g;
        boolean z3 = yh90Var.h;
        boolean z4 = yh90Var.i;
        boolean z5 = (i & 512) != 0 ? yh90Var.t : true;
        List list = yh90Var.X;
        if ((i & 2048) != 0) {
            z = yh90Var.Y;
        }
        return new yh90(str, str2, str3, str4, str5, str6, z2, z3, z4, z5, list, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh90)) {
            return false;
        }
        yh90 yh90Var = (yh90) obj;
        return u890.j(this.a, yh90Var.a) && u890.j(this.b, yh90Var.b) && u890.j(this.c, yh90Var.c) && u890.j(this.d, yh90Var.d) && u890.j(this.e, yh90Var.e) && u890.j(this.f, yh90Var.f) && this.g == yh90Var.g && this.h == yh90Var.h && this.i == yh90Var.i && this.t == yh90Var.t && u890.j(this.X, yh90Var.X) && this.Y == yh90Var.Y;
    }

    @Override // p.hi90
    public final String getImageUri() {
        return this.c;
    }

    @Override // p.hi90
    public final String getName() {
        return this.b;
    }

    @Override // p.hi90
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Y) + f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X);
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
        Iterator itM = kk0.m(parcel, this.X);
        while (itM.hasNext()) {
            ((xh90) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
