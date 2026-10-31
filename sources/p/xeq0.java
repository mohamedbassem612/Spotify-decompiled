package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xeq0 implements Parcelable {
    public static final Parcelable.Creator<xeq0> CREATOR = new p7q0((byte) 5);
    public final String a;
    public final ept b;
    public final c380 c;
    public final cqs0 d;
    public final String e;
    public final Boolean f;
    public final boolean g;

    public xeq0(String str, ept eptVar, c9 c9Var, int i) {
        this(str, (i & 2) != 0 ? null : eptVar, (i & 4) != 0 ? fg91.b : c9Var, dqs0.e, null, null, false);
    }

    public static xeq0 a(xeq0 xeq0Var, ept eptVar, c380 c380Var, cqs0 cqs0Var, String str, Boolean bool, boolean z, int i) {
        ept eptVar2 = eptVar;
        String str2 = xeq0Var.a;
        if ((i & 2) != 0) {
            eptVar2 = xeq0Var.b;
        }
        if ((i & 4) != 0) {
            c380Var = xeq0Var.c;
        }
        if ((i & 8) != 0) {
            cqs0Var = xeq0Var.d;
        }
        if ((i & 16) != 0) {
            str = xeq0Var.e;
        }
        if ((i & 32) != 0) {
            bool = xeq0Var.f;
        }
        if ((i & 64) != 0) {
            z = xeq0Var.g;
        }
        boolean z2 = z;
        Boolean bool2 = bool;
        String str3 = str;
        cqs0 cqs0Var2 = cqs0Var;
        return new xeq0(str2, eptVar2, c380Var, cqs0Var2, str3, bool2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeq0)) {
            return false;
        }
        xeq0 xeq0Var = (xeq0) obj;
        return u890.j(this.a, xeq0Var.a) && u890.j(this.b, xeq0Var.b) && u890.j(this.c, xeq0Var.c) && u890.j(this.d, xeq0Var.d) && u890.j(this.e, xeq0Var.e) && u890.j(this.f, xeq0Var.f) && this.g == xeq0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ept eptVar = this.b;
        int iHashCode2 = (this.d.hashCode() + kk0.f(this.c, (iHashCode + (eptVar == null ? 0 : eptVar.hashCode())) * 31, 31)) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            ((fdq0) itL.next()).writeToParcel(parcel, i);
        }
    }

    public xeq0(String str, ept eptVar, c380 c380Var, cqs0 cqs0Var, String str2, Boolean bool, boolean z) {
        this.a = str;
        this.b = eptVar;
        this.c = c380Var;
        this.d = cqs0Var;
        this.e = str2;
        this.f = bool;
        this.g = z;
    }
}
