package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tom implements Parcelable {
    public static final Parcelable.Creator<tom> CREATOR = new ezl(15);
    public final boolean X;
    public final xo2 Y;
    public final String a;
    public final String b;
    public final w4i1 c;
    public final long d;
    public final boolean e;
    public final upl f;
    public final rom g;
    public final List h;
    public final List i;
    public final nom t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tom(String str, String str2, w4i1 w4i1Var, long j, boolean z, upl uplVar, rom romVar, ArrayList arrayList, ArrayList arrayList2, nom nomVar, boolean z2, xo2 xo2Var, int i) {
        rom romVar2 = (i & 64) != 0 ? qom.a : romVar;
        int i2 = i & 128;
        ArrayList arrayList3 = z6x.a;
        this(str, str2, w4i1Var, j, z, uplVar, romVar2, i2 != 0 ? arrayList3 : arrayList, (i & 256) != 0 ? arrayList3 : arrayList2, (i & 512) != 0 ? kom.a : nomVar, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : xo2Var);
    }

    public static tom a(tom tomVar, w4i1 w4i1Var, upl uplVar, rom romVar, List list, List list2, nom nomVar, boolean z, int i) {
        String str = tomVar.a;
        String str2 = tomVar.b;
        w4i1 w4i1Var2 = (i & 4) != 0 ? tomVar.c : w4i1Var;
        long j = tomVar.d;
        boolean z2 = tomVar.e;
        upl uplVar2 = (i & 32) != 0 ? tomVar.f : uplVar;
        rom romVar2 = (i & 64) != 0 ? tomVar.g : romVar;
        List list3 = (i & 128) != 0 ? tomVar.h : list;
        List list4 = (i & 256) != 0 ? tomVar.i : list2;
        nom nomVar2 = (i & 512) != 0 ? tomVar.t : nomVar;
        boolean z3 = (i & 1024) != 0 ? tomVar.X : z;
        xo2 xo2Var = tomVar.Y;
        tomVar.getClass();
        return new tom(str, str2, w4i1Var2, j, z2, uplVar2, romVar2, list3, list4, nomVar2, z3, xo2Var);
    }

    public final upl b() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tom)) {
            return false;
        }
        tom tomVar = (tom) obj;
        return u890.j(this.a, tomVar.a) && u890.j(this.b, tomVar.b) && u890.j(this.c, tomVar.c) && this.d == tomVar.d && this.e == tomVar.e && u890.j(this.f, tomVar.f) && u890.j(this.g, tomVar.g) && u890.j(this.h, tomVar.h) && u890.j(this.i, tomVar.i) && u890.j(this.t, tomVar.t) && this.X == tomVar.X && u890.j(this.Y, tomVar.Y);
    }

    public final boolean g() {
        return this.Y != null;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.t.hashCode() + f4i1.b(f4i1.b((this.g.hashCode() + ((this.f.hashCode() + xcg1.g(cy30.f(ydh.d(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), this.d, 31), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31, this.X);
        xo2 xo2Var = this.Y;
        return iG + (xo2Var == null ? 0 : xo2Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        Iterator itM = kk0.m(parcel, this.h);
        while (itM.hasNext()) {
            ((gxz0) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.i);
        while (itM2.hasNext()) {
            ((pj01) itM2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.X ? 1 : 0);
        xo2 xo2Var = this.Y;
        if (xo2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xo2Var.writeToParcel(parcel, i);
        }
    }

    public tom(String str, String str2, w4i1 w4i1Var, long j, boolean z, upl uplVar, rom romVar, List list, List list2, nom nomVar, boolean z2, xo2 xo2Var) {
        this.a = str;
        this.b = str2;
        this.c = w4i1Var;
        this.d = j;
        this.e = z;
        this.f = uplVar;
        this.g = romVar;
        this.h = list;
        this.i = list2;
        this.t = nomVar;
        this.X = z2;
        this.Y = xo2Var;
    }
}
