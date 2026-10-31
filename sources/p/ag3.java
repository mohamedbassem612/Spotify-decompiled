package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ag3 implements Parcelable {
    public static final Parcelable.Creator<ag3> CREATOR = new i93((byte) 3);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final k4m g;
    public final boolean h;
    public final List i;
    public final String t;

    public ag3(String str, String str2, String str3, boolean z, String str4, boolean z2, k4m k4mVar, boolean z3, List list, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
        this.g = k4mVar;
        this.h = z3;
        this.i = list;
        this.t = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag3)) {
            return false;
        }
        ag3 ag3Var = (ag3) obj;
        return u890.j(this.a, ag3Var.a) && u890.j(this.b, ag3Var.b) && u890.j(this.c, ag3Var.c) && this.d == ag3Var.d && u890.j(this.e, ag3Var.e) && this.f == ag3Var.f && this.g == ag3Var.g && this.h == ag3Var.h && this.i.equals(ag3Var.i) && u890.j(this.t, ag3Var.t);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return this.t.hashCode() + f4i1.b(xcg1.g(p3d1.g(this.g, xcg1.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31), 31, this.h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g.name());
        parcel.writeInt(this.h ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.i);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.t);
    }
}
