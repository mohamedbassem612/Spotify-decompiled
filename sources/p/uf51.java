package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uf51 implements Parcelable {
    public static final Parcelable.Creator<uf51> CREATOR = new ge51((byte) 2);
    public final String X;
    public final String a;
    public final String b;
    public final t3k1 c;
    public final String d;
    public final pa30 e;
    public final oxc f;
    public final String g;
    public final String h;
    public final boolean i;
    public final int t;

    public uf51(String str, String str2, t3k1 t3k1Var, String str3, pa30 pa30Var, oxc oxcVar, String str4, String str5, boolean z, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = t3k1Var;
        this.d = str3;
        this.e = pa30Var;
        this.f = oxcVar;
        this.g = str4;
        this.h = str5;
        this.i = z;
        this.t = i;
        this.X = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf51)) {
            return false;
        }
        uf51 uf51Var = (uf51) obj;
        return u890.j(this.a, uf51Var.a) && u890.j(this.b, uf51Var.b) && u890.j(this.c, uf51Var.c) && u890.j(this.d, uf51Var.d) && u890.j(this.e, uf51Var.e) && u890.j(this.f, uf51Var.f) && u890.j(this.g, uf51Var.g) && u890.j(this.h, uf51Var.h) && this.i == uf51Var.i && this.t == uf51Var.t && u890.j(this.X, uf51Var.X);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        t3k1 t3k1Var = this.c;
        int iD = cy30.d((iHashCode2 + (t3k1Var == null ? 0 : t3k1Var.hashCode())) * 31, 31, this.d);
        pa30 pa30Var = this.e;
        int iHashCode3 = (iD + (pa30Var == null ? 0 : pa30Var.a.hashCode())) * 31;
        oxc oxcVar = this.f;
        int iHashCode4 = (iHashCode3 + (oxcVar == null ? 0 : oxcVar.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iK = ab80.k(this.t, xcg1.g((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31);
        String str5 = this.X;
        return iK + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object[] objArr;
        String str;
        String str2;
        List listM;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        t3k1 t3k1Var = this.c;
        if (t3k1Var instanceof qf50) {
            objArr = 1;
        } else if (t3k1Var instanceof swd) {
            objArr = 2;
        } else if (t3k1Var instanceof pnc0) {
            objArr = 3;
        } else if (t3k1Var instanceof o660) {
            objArr = 4;
        } else {
            objArr = t3k1Var instanceof hol1 ? (char) 5 : (char) 0;
        }
        if (objArr == 0) {
            str = null;
        } else if (objArr == 1) {
            str = "GRID";
        } else if (objArr == 2) {
            str = "CAROUSEL";
        } else if (objArr == 3) {
            str = "LIST";
        } else if (objArr == 4) {
            str = "HERO";
        } else {
            if (objArr != 5) {
                throw null;
            }
            str = "WIDE";
        }
        parcel.writeString(str);
        if (t3k1Var != null && (listM = o2p1.m(t3k1Var)) != null) {
            parcel.writeInt(((ArrayList) listM).size());
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                parcel.writeStringList((List) it.next());
            }
        }
        parcel.writeString(this.d);
        pa30 pa30Var = this.e;
        if (pa30Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pa30Var.writeToParcel(parcel, i);
        }
        oxc oxcVar = this.f;
        if (oxcVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oxcVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        int i2 = this.t;
        if (i2 == 1) {
            str2 = "UNSPECIFIED";
        } else if (i2 == 2) {
            str2 = "URI";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str2 = "EDITORIAL";
        }
        parcel.writeString(str2);
        parcel.writeString(this.X);
    }
}
