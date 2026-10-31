package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jjf1 extends ei90 {
    public static final Parcelable.Creator<jjf1> CREATOR = new r8f1(5);
    public final p1g1 N0;
    public final tkf1 O0;
    public final kfv P0;
    public final boolean Q0;
    public final String X;
    public final boolean Y;
    public final kw91 Z;
    public final boolean a;
    public final boolean b;
    public final ol11 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final p2q0 g;
    public final boolean h;
    public final aql i;
    public final String t;

    public jjf1(boolean z, boolean z2, ol11 ol11Var, List list, boolean z3, boolean z4, p2q0 p2q0Var, boolean z5, aql aqlVar, String str, String str2, boolean z6, kw91 kw91Var, p1g1 p1g1Var, tkf1 tkf1Var, kfv kfvVar, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = ol11Var;
        this.d = list;
        this.e = z3;
        this.f = z4;
        this.g = p2q0Var;
        this.h = z5;
        this.i = aqlVar;
        this.t = str;
        this.X = str2;
        this.Y = z6;
        this.Z = kw91Var;
        this.N0 = p1g1Var;
        this.O0 = tkf1Var;
        this.P0 = kfvVar;
        this.Q0 = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjf1)) {
            return false;
        }
        jjf1 jjf1Var = (jjf1) obj;
        return this.a == jjf1Var.a && this.b == jjf1Var.b && u890.j(this.c, jjf1Var.c) && this.d.equals(jjf1Var.d) && this.e == jjf1Var.e && this.f == jjf1Var.f && u890.j(this.g, jjf1Var.g) && this.h == jjf1Var.h && u890.j(this.i, jjf1Var.i) && u890.j(this.t, jjf1Var.t) && u890.j(this.X, jjf1Var.X) && this.Y == jjf1Var.Y && u890.j(this.Z, jjf1Var.Z) && u890.j(this.N0, jjf1Var.N0) && u890.j(this.O0, jjf1Var.O0) && u890.j(this.P0, jjf1Var.P0) && this.Q0 == jjf1Var.Q0;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + xcg1.g((this.g.hashCode() + xcg1.g(xcg1.g(f4i1.b((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h)) * 31;
        String str = this.t;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.X;
        return Boolean.hashCode(this.Q0) + cy30.f((this.O0.hashCode() + ((this.N0.hashCode() + f4i1.b(xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.Y), 31, this.Z.a)) * 31)) * 31, this.P0.a, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((ol11) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
        this.Z.writeToParcel(parcel, i);
        parcel.writeParcelable(this.N0, i);
        parcel.writeParcelable(this.O0, i);
        this.P0.writeToParcel(parcel, i);
        parcel.writeInt(this.Q0 ? 1 : 0);
    }
}
