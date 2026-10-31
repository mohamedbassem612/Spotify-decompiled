package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bb1 implements Parcelable {
    public static final Parcelable.Creator<bb1> CREATOR = new d41((byte) 11);
    public final String N0;
    public final mlr0 X;
    public final flr0 Y;
    public final u380 Z;
    public final String a;
    public final iyr0 b;
    public final boolean c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String t;

    public bb1(String str, iyr0 iyr0Var, boolean z) {
        mlr0 mlr0Var = new mlr0(3);
        flr0 flr0Var = new flr0(20, 3);
        lqs0 lqs0Var = lqs0.d;
        z6x z6xVar = z6x.a;
        this(str, iyr0Var, z, "", z6xVar, z6xVar, false, false, false, null, mlr0Var, flr0Var, lqs0Var, null);
    }

    public static bb1 a(bb1 bb1Var, String str, List list, List list2, boolean z, boolean z2, boolean z3, String str2, mlr0 mlr0Var, u380 u380Var, String str3, int i) {
        String str4 = bb1Var.a;
        iyr0 iyr0Var = bb1Var.b;
        boolean z4 = bb1Var.c;
        String str5 = (i & 8) != 0 ? bb1Var.d : str;
        List list3 = (i & 16) != 0 ? bb1Var.e : list;
        List list4 = (i & 32) != 0 ? bb1Var.f : list2;
        boolean z5 = (i & 64) != 0 ? bb1Var.g : z;
        boolean z6 = (i & 128) != 0 ? bb1Var.h : z2;
        boolean z7 = (i & 256) != 0 ? bb1Var.i : z3;
        String str6 = (i & 512) != 0 ? bb1Var.t : str2;
        mlr0 mlr0Var2 = (i & 1024) != 0 ? bb1Var.X : mlr0Var;
        flr0 flr0Var = bb1Var.Y;
        u380 u380Var2 = (i & 4096) != 0 ? bb1Var.Z : u380Var;
        String str7 = (i & 8192) != 0 ? bb1Var.N0 : str3;
        bb1Var.getClass();
        return new bb1(str4, iyr0Var, z4, str5, list3, list4, z5, z6, z7, str6, mlr0Var2, flr0Var, u380Var2, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb1)) {
            return false;
        }
        bb1 bb1Var = (bb1) obj;
        return u890.j(this.a, bb1Var.a) && this.b == bb1Var.b && this.c == bb1Var.c && u890.j(this.d, bb1Var.d) && u890.j(this.e, bb1Var.e) && u890.j(this.f, bb1Var.f) && this.g == bb1Var.g && this.h == bb1Var.h && this.i == bb1Var.i && u890.j(this.t, bb1Var.t) && u890.j(this.X, bb1Var.X) && u890.j(this.Y, bb1Var.Y) && u890.j(this.Z, bb1Var.Z) && u890.j(this.N0, bb1Var.N0);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(f4i1.b(f4i1.b(cy30.d(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.t;
        int iHashCode = (this.Z.hashCode() + ((this.Y.hashCode() + ((this.X.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.N0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.f);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.t);
        this.X.writeToParcel(parcel, i);
        this.Y.writeToParcel(parcel, i);
        u380 u380Var = this.Z;
        parcel.writeInt(u380Var.size());
        Iterator it = u380Var.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        parcel.writeString(this.N0);
    }

    public bb1(String str, iyr0 iyr0Var, boolean z, String str2, List list, List list2, boolean z2, boolean z3, boolean z4, String str3, mlr0 mlr0Var, flr0 flr0Var, u380 u380Var, String str4) {
        this.a = str;
        this.b = iyr0Var;
        this.c = z;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.t = str3;
        this.X = mlr0Var;
        this.Y = flr0Var;
        this.Z = u380Var;
        this.N0 = str4;
    }
}
