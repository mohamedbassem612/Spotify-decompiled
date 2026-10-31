package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qq81 implements Parcelable {
    public static final Parcelable.Creator<qq81> CREATOR = new ro71(23);
    public final String N0;
    public final epv0 X;
    public final boolean Y;
    public final String Z;
    public final pq81 a;
    public final nxw b;
    public final v6s0 c;
    public final th2 d;
    public final id40 e;
    public final wjn0 f;
    public final boolean g;
    public final String h;
    public final bk8 i;
    public final int t;

    public qq81(boolean z, String str) {
        nq81 nq81Var = new nq81(new fo81(false, false, false, false, false, false, 0, false, null, null, null, false, false, null, 65535));
        dyw dywVar = null;
        int i = 15;
        nxw nxwVar = new nxw(dywVar, i);
        v6s0 v6s0Var = new v6s0(l6s0.b, false, false);
        Calendar calendar = Calendar.getInstance();
        th2 th2Var = new th2(calendar.get(5), calendar.get(2), calendar.get(1) - 10, vj2.a, false, false);
        fo81 fo81Var = fo81.Q0;
        this(nq81Var, nxwVar, v6s0Var, th2Var, new id40(dd40.a, fo81Var.b, fo81Var.c, fo81Var.d, false), new wjn0(dywVar, i), true, null, bk8.a, 0, null, z, str, null);
    }

    public static qq81 a(qq81 qq81Var, oq81 oq81Var, nxw nxwVar, v6s0 v6s0Var, th2 th2Var, id40 id40Var, wjn0 wjn0Var, boolean z, String str, bk8 bk8Var, int i, String str2, int i2) {
        pq81 pq81Var = (i2 & 1) != 0 ? qq81Var.a : oq81Var;
        nxw nxwVar2 = (i2 & 2) != 0 ? qq81Var.b : nxwVar;
        v6s0 v6s0Var2 = (i2 & 4) != 0 ? qq81Var.c : v6s0Var;
        th2 th2Var2 = (i2 & 8) != 0 ? qq81Var.d : th2Var;
        id40 id40Var2 = (i2 & 16) != 0 ? qq81Var.e : id40Var;
        wjn0 wjn0Var2 = (i2 & 32) != 0 ? qq81Var.f : wjn0Var;
        boolean z2 = (i2 & 64) != 0 ? qq81Var.g : z;
        String str3 = (i2 & 128) != 0 ? qq81Var.h : str;
        bk8 bk8Var2 = (i2 & 256) != 0 ? qq81Var.i : bk8Var;
        int i3 = (i2 & 512) != 0 ? qq81Var.t : i;
        epv0 epv0Var = qq81Var.X;
        boolean z3 = qq81Var.Y;
        String str4 = qq81Var.Z;
        String str5 = (i2 & 8192) != 0 ? qq81Var.N0 : str2;
        qq81Var.getClass();
        return new qq81(pq81Var, nxwVar2, v6s0Var2, th2Var2, id40Var2, wjn0Var2, z2, str3, bk8Var2, i3, epv0Var, z3, str4, str5);
    }

    public final id40 b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq81)) {
            return false;
        }
        qq81 qq81Var = (qq81) obj;
        return u890.j(this.a, qq81Var.a) && u890.j(this.b, qq81Var.b) && u890.j(this.c, qq81Var.c) && u890.j(this.d, qq81Var.d) && u890.j(this.e, qq81Var.e) && u890.j(this.f, qq81Var.f) && this.g == qq81Var.g && u890.j(this.h, qq81Var.h) && this.i == qq81Var.i && this.t == qq81Var.t && u890.j(this.X, qq81Var.X) && this.Y == qq81Var.Y && u890.j(this.Z, qq81Var.Z) && u890.j(this.N0, qq81Var.N0);
    }

    public final String g() {
        return this.Z;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g);
        String str = this.h;
        int iF = kaa0.f(this.t, (this.i.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        epv0 epv0Var = this.X;
        int iG2 = xcg1.g((iF + (epv0Var == null ? 0 : epv0Var.hashCode())) * 31, 31, this.Y);
        String str2 = this.Z;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.N0;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i.name());
        parcel.writeInt(this.t);
        parcel.writeParcelable(this.X, i);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeString(this.Z);
        parcel.writeString(this.N0);
    }

    public qq81(pq81 pq81Var, nxw nxwVar, v6s0 v6s0Var, th2 th2Var, id40 id40Var, wjn0 wjn0Var, boolean z, String str, bk8 bk8Var, int i, epv0 epv0Var, boolean z2, String str2, String str3) {
        this.a = pq81Var;
        this.b = nxwVar;
        this.c = v6s0Var;
        this.d = th2Var;
        this.e = id40Var;
        this.f = wjn0Var;
        this.g = z;
        this.h = str;
        this.i = bk8Var;
        this.t = i;
        this.X = epv0Var;
        this.Y = z2;
        this.Z = str2;
        this.N0 = str3;
    }
}
