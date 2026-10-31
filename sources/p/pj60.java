package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pj60 extends rj60 {
    public static final Parcelable.Creator<pj60> CREATOR = new ij60((byte) 6);
    public final boolean X;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final List t;

    public pj60(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, List list, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
        this.h = z2;
        this.i = z3;
        this.t = list;
        this.X = z4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj60)) {
            return false;
        }
        pj60 pj60Var = (pj60) obj;
        return u890.j(this.a, pj60Var.a) && u890.j(this.b, pj60Var.b) && u890.j(this.c, pj60Var.c) && u890.j(this.d, pj60Var.d) && u890.j(this.e, pj60Var.e) && this.f == pj60Var.f && u890.j(this.g, pj60Var.g) && this.h == pj60Var.h && this.i == pj60Var.i && u890.j(this.t, pj60Var.t) && this.X == pj60Var.X;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iG = xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        return Boolean.hashCode(this.X) + f4i1.b(xcg1.g(xcg1.g((iG + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.t);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeStringList(this.t);
        parcel.writeInt(this.X ? 1 : 0);
    }
}
