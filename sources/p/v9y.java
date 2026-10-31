package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v9y implements Parcelable {
    public static final Parcelable.Creator<v9y> CREATOR = new utx(14);
    public final boolean N0;
    public final List O0;
    public final List X;
    public final chf0 Y;
    public final int Z;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public final List f;
    public final msd g;
    public final l1f1 h;
    public final vef0 i;
    public final kw9 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v9y(String str, long j, String str2, boolean z, Integer num, msd msdVar, l1f1 l1f1Var, vef0 vef0Var, kw9 kw9Var, chf0 chf0Var, int i, boolean z2, List list, int i2) {
        boolean z3 = (i2 & 8) != 0 ? true : z;
        Integer num2 = (i2 & 16) != 0 ? null : num;
        l1f1 l1f1Var2 = (i2 & 128) != 0 ? null : l1f1Var;
        vef0 vef0Var2 = (i2 & 256) != 0 ? null : vef0Var;
        kw9 kw9Var2 = (i2 & 512) != 0 ? null : kw9Var;
        z6x z6xVar = z6x.a;
        this(str, j, str2, z3, num2, z6xVar, msdVar, l1f1Var2, vef0Var2, kw9Var2, z6xVar, chf0Var, i, z2, list);
    }

    public static v9y a(v9y v9yVar, String str, long j, String str2, boolean z, Integer num, List list, msd msdVar, l1f1 l1f1Var, vef0 vef0Var, kw9 kw9Var, smc0 smc0Var, chf0 chf0Var, int i, boolean z2, ArrayList arrayList, int i2) {
        String str3 = (i2 & 1) != 0 ? v9yVar.a : str;
        long j2 = (i2 & 2) != 0 ? v9yVar.b : j;
        String str4 = (i2 & 4) != 0 ? v9yVar.c : str2;
        boolean z3 = (i2 & 8) != 0 ? v9yVar.d : z;
        Integer num2 = (i2 & 16) != 0 ? v9yVar.e : num;
        List list2 = (i2 & 32) != 0 ? v9yVar.f : list;
        msd msdVar2 = (i2 & 64) != 0 ? v9yVar.g : msdVar;
        l1f1 l1f1Var2 = (i2 & 128) != 0 ? v9yVar.h : l1f1Var;
        vef0 vef0Var2 = (i2 & 256) != 0 ? v9yVar.i : vef0Var;
        kw9 kw9Var2 = (i2 & 512) != 0 ? v9yVar.t : kw9Var;
        smc0 smc0Var2 = (i2 & 1024) != 0 ? v9yVar.X : smc0Var;
        chf0 chf0Var2 = (i2 & 2048) != 0 ? v9yVar.Y : chf0Var;
        int i3 = (i2 & 4096) != 0 ? v9yVar.Z : i;
        String str5 = str3;
        boolean z4 = (i2 & 8192) != 0 ? v9yVar.N0 : z2;
        List list3 = (i2 & 16384) != 0 ? v9yVar.O0 : arrayList;
        v9yVar.getClass();
        return new v9y(str5, j2, str4, z3, num2, list2, msdVar2, l1f1Var2, vef0Var2, kw9Var2, smc0Var2, chf0Var2, i3, z4, list3);
    }

    public final ax70 b() {
        msd msdVar = this.g;
        ksd ksdVar = msdVar instanceof ksd ? (ksd) msdVar : null;
        if (ksdVar != null) {
            return ksdVar.a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9y)) {
            return false;
        }
        v9y v9yVar = (v9y) obj;
        return u890.j(this.a, v9yVar.a) && this.b == v9yVar.b && u890.j(this.c, v9yVar.c) && this.d == v9yVar.d && u890.j(this.e, v9yVar.e) && u890.j(this.f, v9yVar.f) && u890.j(this.g, v9yVar.g) && this.h == v9yVar.h && u890.j(this.i, v9yVar.i) && u890.j(this.t, v9yVar.t) && u890.j(this.X, v9yVar.X) && this.Y == v9yVar.Y && this.Z == v9yVar.Z && this.N0 == v9yVar.N0 && u890.j(this.O0, v9yVar.O0);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d);
        Integer num = this.e;
        int iB = f4i1.b((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
        msd msdVar = this.g;
        int iHashCode = (iB + (msdVar == null ? 0 : msdVar.hashCode())) * 31;
        l1f1 l1f1Var = this.h;
        int iHashCode2 = (iHashCode + (l1f1Var == null ? 0 : l1f1Var.hashCode())) * 31;
        vef0 vef0Var = this.i;
        int iHashCode3 = (iHashCode2 + (vef0Var == null ? 0 : vef0Var.hashCode())) * 31;
        kw9 kw9Var = this.t;
        return this.O0.hashCode() + xcg1.g(ab80.k(this.Z, (this.Y.hashCode() + f4i1.b((iHashCode3 + (kw9Var != null ? kw9Var.hashCode() : 0)) * 31, 31, this.X)) * 31, 31), 31, this.N0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeParcelable(this.g, i);
        l1f1 l1f1Var = this.h;
        if (l1f1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(l1f1Var.name());
        }
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeString(this.Y.name());
        parcel.writeString(pze0.r(this.Z));
        parcel.writeInt(this.N0 ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.O0);
        while (itM.hasNext()) {
            ((t5t0) itM.next()).writeToParcel(parcel, i);
        }
    }

    public v9y(String str, long j, String str2, boolean z, Integer num, List list, msd msdVar, l1f1 l1f1Var, vef0 vef0Var, kw9 kw9Var, List list2, chf0 chf0Var, int i, boolean z2, List list3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
        this.e = num;
        this.f = list;
        this.g = msdVar;
        this.h = l1f1Var;
        this.i = vef0Var;
        this.t = kw9Var;
        this.X = list2;
        this.Y = chf0Var;
        this.Z = i;
        this.N0 = z2;
        this.O0 = list3;
    }
}
