package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sju implements Parcelable {
    public static final Parcelable.Creator<sju> CREATOR = new zrt(19);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dg e;
    public final xz7 f;
    public final g08 g;

    public sju(String str, String str2, String str3, String str4, dg dgVar, xz7 xz7Var, g08 g08Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dgVar;
        this.f = xz7Var;
        this.g = g08Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sju)) {
            return false;
        }
        sju sjuVar = (sju) obj;
        return u890.j(this.a, sjuVar.a) && u890.j(this.b, sjuVar.b) && u890.j(this.c, sjuVar.c) && u890.j(this.d, sjuVar.d) && u890.j(this.e, sjuVar.e) && u890.j(this.f, sjuVar.f) && u890.j(this.g, sjuVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dg dgVar = this.e;
        int iHashCode3 = (iHashCode2 + (dgVar == null ? 0 : dgVar.hashCode())) * 31;
        xz7 xz7Var = this.f;
        int iHashCode4 = (iHashCode3 + (xz7Var == null ? 0 : xz7Var.hashCode())) * 31;
        g08 g08Var = this.g;
        return iHashCode4 + (g08Var != null ? g08Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        dg dgVar = this.e;
        if (dgVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dgVar.writeToParcel(parcel, i);
        }
        xz7 xz7Var = this.f;
        if (xz7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xz7Var.writeToParcel(parcel, i);
        }
        g08 g08Var = this.g;
        if (g08Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            g08Var.writeToParcel(parcel, i);
        }
    }
}
