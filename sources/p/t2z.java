package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t2z implements Parcelable {
    public static final Parcelable.Creator<t2z> CREATOR = new jhy(24);
    public final boolean N0;
    public final boolean O0;
    public final String P0;
    public final boolean X;
    public final boolean Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final k4m g;
    public final boolean h;
    public final String i;
    public final ArrayList t;

    public t2z(String str, String str2, String str3, String str4, String str5, String str6, k4m k4mVar, boolean z, String str7, ArrayList arrayList, boolean z2, boolean z3, String str8, boolean z4, boolean z5, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = k4mVar;
        this.h = z;
        this.i = str7;
        this.t = arrayList;
        this.X = z2;
        this.Y = z3;
        this.Z = str8;
        this.N0 = z4;
        this.O0 = z5;
        this.P0 = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2z)) {
            return false;
        }
        t2z t2zVar = (t2z) obj;
        return u890.j(this.a, t2zVar.a) && u890.j(this.b, t2zVar.b) && u890.j(this.c, t2zVar.c) && u890.j(this.d, t2zVar.d) && u890.j(this.e, t2zVar.e) && u890.j(this.f, t2zVar.f) && this.g == t2zVar.g && this.h == t2zVar.h && u890.j(this.i, t2zVar.i) && this.t.equals(t2zVar.t) && this.X == t2zVar.X && this.Y == t2zVar.Y && u890.j(this.Z, t2zVar.Z) && this.N0 == t2zVar.N0 && this.O0 == t2zVar.O0 && u890.j(this.P0, t2zVar.P0);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG = xcg1.g(xcg1.g(p3d1.f(this.t, cy30.d(xcg1.g(p3d1.g(this.g, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.h), 31, this.i), 31), 31, this.X), 31, this.Y);
        String str2 = this.Z;
        return this.P0.hashCode() + xcg1.g(xcg1.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.N0), 31, this.O0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g.name());
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        Iterator itO = xvj1.o(this.t, parcel);
        while (itO.hasNext()) {
            ((gp51) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeString(this.Z);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeString(this.P0);
    }
}
