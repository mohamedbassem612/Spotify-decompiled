package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ihs0 implements tqw0 {
    public static final Parcelable.Creator<ihs0> CREATOR = new ybs0((byte) 23);
    public final String a;
    public final String b;
    public final c380 c;
    public final ghs0 d;
    public final ehs0 e;
    public final fhs0 f;
    public final String g;
    public final boolean h;

    public ihs0(String str, String str2, c380 c380Var, ghs0 ghs0Var, ehs0 ehs0Var, fhs0 fhs0Var, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = ghs0Var;
        this.e = ehs0Var;
        this.f = fhs0Var;
        this.g = str3;
        this.h = z;
    }

    public static ihs0 a(ihs0 ihs0Var, fhs0 fhs0Var, int i) {
        String str = ihs0Var.a;
        String str2 = ihs0Var.b;
        c380 c380Var = ihs0Var.c;
        ghs0 ghs0Var = ihs0Var.d;
        ehs0 ehs0Var = ihs0Var.e;
        if ((i & 32) != 0) {
            fhs0Var = ihs0Var.f;
        }
        fhs0 fhs0Var2 = fhs0Var;
        String str3 = ihs0Var.g;
        boolean z = (i & 128) != 0 ? ihs0Var.h : true;
        ihs0Var.getClass();
        return new ihs0(str, str2, c380Var, ghs0Var, ehs0Var, fhs0Var2, str3, z);
    }

    @Override // p.tqw0
    public final boolean b0() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihs0)) {
            return false;
        }
        ihs0 ihs0Var = (ihs0) obj;
        return u890.j(this.a, ihs0Var.a) && u890.j(this.b, ihs0Var.b) && u890.j(this.c, ihs0Var.c) && u890.j(this.d, ihs0Var.d) && u890.j(this.e, ihs0Var.e) && u890.j(this.f, ihs0Var.f) && u890.j(this.g, ihs0Var.g) && this.h == ihs0Var.h;
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        ghs0 ghs0Var = this.d;
        int iHashCode = (iF + (ghs0Var == null ? 0 : ghs0Var.hashCode())) * 31;
        ehs0 ehs0Var = this.e;
        int iHashCode2 = (iHashCode + (ehs0Var == null ? 0 : ehs0Var.hashCode())) * 31;
        fhs0 fhs0Var = this.f;
        int iHashCode3 = (iHashCode2 + (fhs0Var == null ? 0 : fhs0Var.hashCode())) * 31;
        String str = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            ((hhs0) itL.next()).writeToParcel(parcel, i);
        }
        ghs0 ghs0Var = this.d;
        if (ghs0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ghs0Var.writeToParcel(parcel, i);
        }
        ehs0 ehs0Var = this.e;
        if (ehs0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ehs0Var.writeToParcel(parcel, i);
        }
        fhs0 fhs0Var = this.f;
        if (fhs0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fhs0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
