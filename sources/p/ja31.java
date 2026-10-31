package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ja31 implements ka31 {
    public static final Parcelable.Creator<ja31> CREATOR = new s231((byte) 15);
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ff h;
    public final ff i;
    public final ff t;

    public ja31(List list, String str, String str2, String str3, String str4, String str5, boolean z, ff ffVar, ff ffVar2, ff ffVar3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = ffVar;
        this.i = ffVar2;
        this.t = ffVar3;
    }

    public static ja31 a(ja31 ja31Var, boolean z) {
        return new ja31(ja31Var.a, ja31Var.b, ja31Var.c, ja31Var.d, ja31Var.e, ja31Var.f, z, ja31Var.h, ja31Var.i, ja31Var.t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja31)) {
            return false;
        }
        ja31 ja31Var = (ja31) obj;
        return this.a.equals(ja31Var.a) && u890.j(this.b, ja31Var.b) && u890.j(this.c, ja31Var.c) && u890.j(this.d, ja31Var.d) && u890.j(this.e, ja31Var.e) && u890.j(this.f, ja31Var.f) && this.g == ja31Var.g && u890.j(this.h, ja31Var.h) && u890.j(this.i, ja31Var.i) && u890.j(this.t, ja31Var.t);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ff ffVar = this.h;
        int iHashCode = (iG + (ffVar == null ? 0 : ffVar.hashCode())) * 31;
        ff ffVar2 = this.i;
        int iHashCode2 = (iHashCode + (ffVar2 == null ? 0 : ffVar2.hashCode())) * 31;
        ff ffVar3 = this.t;
        return iHashCode2 + (ffVar3 != null ? ffVar3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((z5c1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        ff ffVar = this.h;
        if (ffVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ffVar.writeToParcel(parcel, i);
        }
        ff ffVar2 = this.i;
        if (ffVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ffVar2.writeToParcel(parcel, i);
        }
        ff ffVar3 = this.t;
        if (ffVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ffVar3.writeToParcel(parcel, i);
        }
    }
}
