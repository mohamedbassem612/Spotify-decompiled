package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k8g1 implements Parcelable {
    public static final Parcelable.Creator<k8g1> CREATOR = new h3g1((byte) 1);
    public final qpe1 X;
    public final boolean Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;
    public final boolean t;

    public k8g1(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List list, boolean z, qpe1 qpe1Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.t = z;
        this.X = qpe1Var;
        this.Y = z2;
        this.Z = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8g1)) {
            return false;
        }
        k8g1 k8g1Var = (k8g1) obj;
        return u890.j(this.a, k8g1Var.a) && u890.j(this.b, k8g1Var.b) && u890.j(this.c, k8g1Var.c) && u890.j(this.d, k8g1Var.d) && u890.j(this.e, k8g1Var.e) && this.f == k8g1Var.f && this.g == k8g1Var.g && this.h == k8g1Var.h && u890.j(this.i, k8g1Var.i) && this.t == k8g1Var.t && this.X == k8g1Var.X && this.Y == k8g1Var.Y && this.Z == k8g1Var.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + xcg1.g((this.X.hashCode() + xcg1.g(f4i1.b(kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31, this.i), 31, this.t)) * 31, 31, this.Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        Iterator itM = kk0.m(parcel, this.i);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X.name());
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public /* synthetic */ k8g1() {
        this("", "", "", "", "", 0, -1, -1, z6x.a, false, qpe1.a, false, false);
    }
}
