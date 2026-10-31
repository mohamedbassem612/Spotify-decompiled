package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gsh0 implements Parcelable {
    public static final Parcelable.Creator<gsh0> CREATOR = new hug0((byte) 26);
    public final p8i0 X;
    public final int a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public gsh0(int i, List list, boolean z, boolean z2, List list2, int i2, int i3, boolean z3, boolean z4, boolean z5, p8i0 p8i0Var) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = list2;
        this.f = i2;
        this.g = i3;
        this.h = z3;
        this.i = z4;
        this.t = z5;
        this.X = p8i0Var;
    }

    public static gsh0 a(gsh0 gsh0Var, int i, List list, boolean z, boolean z2, List list2, boolean z3, boolean z4, p8i0 p8i0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = gsh0Var.a;
        }
        int i3 = i;
        List list3 = (i2 & 2) != 0 ? gsh0Var.b : list;
        boolean z5 = (i2 & 4) != 0 ? gsh0Var.c : z;
        boolean z6 = (i2 & 8) != 0 ? gsh0Var.d : z2;
        List list4 = (i2 & 16) != 0 ? gsh0Var.e : list2;
        int i4 = gsh0Var.f;
        int i5 = gsh0Var.g;
        boolean z7 = gsh0Var.h;
        boolean z8 = (i2 & 256) != 0 ? gsh0Var.i : z3;
        boolean z9 = (i2 & 512) != 0 ? gsh0Var.t : z4;
        p8i0 p8i0Var2 = (i2 & 1024) != 0 ? gsh0Var.X : p8i0Var;
        gsh0Var.getClass();
        return new gsh0(i3, list3, z5, z6, list4, i4, i5, z7, z8, z9, p8i0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsh0)) {
            return false;
        }
        gsh0 gsh0Var = (gsh0) obj;
        return this.a == gsh0Var.a && u890.j(this.b, gsh0Var.b) && this.c == gsh0Var.c && this.d == gsh0Var.d && u890.j(this.e, gsh0Var.e) && this.f == gsh0Var.f && this.g == gsh0Var.g && this.h == gsh0Var.h && this.i == gsh0Var.i && this.t == gsh0Var.t && this.X == gsh0Var.X;
    }

    public final int hashCode() {
        return this.X.hashCode() + xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.g, kaa0.f(this.f, f4i1.b(xcg1.g(xcg1.g(f4i1.b(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "GRANTED";
        } else if (i2 == 2) {
            str = "PARTIAL";
        } else if (i2 == 3) {
            str = "NOT_DETERMINED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "DENIED";
        }
        parcel.writeString(str);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((xoh0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itM2 = kk0.m(parcel, this.e);
        while (itM2.hasNext()) {
            ((xoh0) itM2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X.name());
    }
}
