package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qxc0 implements Parcelable {
    public static final Parcelable.Creator<qxc0> CREATOR = new rqc0((byte) 25);
    public final List N0;
    public final Map O0;
    public final int P0;
    public final boolean Q0;
    public final long R0;
    public final int S0;
    public final int T0;
    public final r2q0 U0;
    public final pxc0 V0;
    public final int W0;
    public final Map X;
    public final boolean X0;
    public final ArrayList Y;
    public final boolean Y0;
    public final List Z;
    public final boolean Z0;
    public final String a;
    public final ben b;
    public final pxc0 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final wls0 i;
    public final x7i1 t;

    public qxc0(String str, ben benVar, pxc0 pxc0Var, String str2, String str3, boolean z, String str4, boolean z2, wls0 wls0Var, x7i1 x7i1Var, Map map, ArrayList arrayList, List list, List list2, Map map2, int i, boolean z3, long j, int i2, int i3, r2q0 r2q0Var, pxc0 pxc0Var2, int i4, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = benVar;
        this.c = pxc0Var;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = wls0Var;
        this.t = x7i1Var;
        this.X = map;
        this.Y = arrayList;
        this.Z = list;
        this.N0 = list2;
        this.O0 = map2;
        this.P0 = i;
        this.Q0 = z3;
        this.R0 = j;
        this.S0 = i2;
        this.T0 = i3;
        this.U0 = r2q0Var;
        this.V0 = pxc0Var2;
        this.W0 = i4;
        this.X0 = z4;
        this.Y0 = z5;
        this.Z0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxc0)) {
            return false;
        }
        qxc0 qxc0Var = (qxc0) obj;
        return u890.j(this.a, qxc0Var.a) && u890.j(this.b, qxc0Var.b) && u890.j(this.c, qxc0Var.c) && u890.j(this.d, qxc0Var.d) && u890.j(this.e, qxc0Var.e) && this.f == qxc0Var.f && u890.j(this.g, qxc0Var.g) && this.h == qxc0Var.h && this.i == qxc0Var.i && u890.j(this.t, qxc0Var.t) && u890.j(this.X, qxc0Var.X) && this.Y.equals(qxc0Var.Y) && u890.j(this.Z, qxc0Var.Z) && u890.j(this.N0, qxc0Var.N0) && u890.j(this.O0, qxc0Var.O0) && this.P0 == qxc0Var.P0 && this.Q0 == qxc0Var.Q0 && this.R0 == qxc0Var.R0 && this.S0 == qxc0Var.S0 && this.T0 == qxc0Var.T0 && this.U0 == qxc0Var.U0 && u890.j(this.V0, qxc0Var.V0) && this.W0 == qxc0Var.W0 && this.X0 == qxc0Var.X0 && this.Y0 == qxc0Var.Y0 && this.Z0 == qxc0Var.Z0;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pxc0 pxc0Var = this.c;
        int iD = cy30.d((iHashCode + (pxc0Var == null ? 0 : pxc0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (this.U0.hashCode() + kaa0.f(this.T0, kaa0.f(this.S0, cy30.f(xcg1.g(kaa0.f(this.P0, cy30.e(f4i1.b(f4i1.b(p3d1.f(this.Y, cy30.e((this.t.hashCode() + ((this.i.hashCode() + xcg1.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h)) * 31)) * 31, 31, this.X), 31), 31, this.Z), 31, this.N0), 31, this.O0), 31), 31, this.Q0), this.R0, 31), 31), 31)) * 31;
        pxc0 pxc0Var2 = this.V0;
        return Boolean.hashCode(this.Z0) + xcg1.g(xcg1.g(kaa0.f(this.W0, (iHashCode2 + (pxc0Var2 != null ? pxc0Var2.hashCode() : 0)) * 31, 31), 31, this.X0), 31, this.Y0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        pxc0 pxc0Var = this.c;
        if (pxc0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pxc0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i.name());
        parcel.writeParcelable(this.t, i);
        Iterator itJ = xcg1.j(parcel, this.X);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Iterator itO = xvj1.o(this.Y, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        Iterator itM = kk0.m(parcel, this.Z);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.N0);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        Iterator itJ2 = xcg1.j(parcel, this.O0);
        while (itJ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itJ2.next();
            parcel.writeString(((dlc0) entry2.getKey()).name());
            parcel.writeInt(((Number) entry2.getValue()).intValue());
        }
        parcel.writeInt(this.P0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeLong(this.R0);
        parcel.writeInt(this.S0);
        parcel.writeInt(this.T0);
        parcel.writeString(this.U0.name());
        pxc0 pxc0Var2 = this.V0;
        if (pxc0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pxc0Var2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.W0);
        parcel.writeInt(this.X0 ? 1 : 0);
        parcel.writeInt(this.Y0 ? 1 : 0);
        parcel.writeInt(this.Z0 ? 1 : 0);
    }
}
