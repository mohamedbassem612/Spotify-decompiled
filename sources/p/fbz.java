package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fbz implements Parcelable {
    public static final Parcelable.Creator<fbz> CREATOR = new jhy(27);
    public final List X;
    public final boolean Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k4m e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final int t;

    public fbz(String str, String str2, String str3, String str4, k4m k4mVar, boolean z, String str5, boolean z2, boolean z3, int i, List list, boolean z4, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = k4mVar;
        this.f = z;
        this.g = str5;
        this.h = z2;
        this.i = z3;
        this.t = i;
        this.X = list;
        this.Y = z4;
        this.Z = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbz)) {
            return false;
        }
        fbz fbzVar = (fbz) obj;
        return u890.j(this.a, fbzVar.a) && u890.j(this.b, fbzVar.b) && u890.j(this.c, fbzVar.c) && u890.j(this.d, fbzVar.d) && this.e == fbzVar.e && this.f == fbzVar.f && u890.j(this.g, fbzVar.g) && this.h == fbzVar.h && this.i == fbzVar.i && this.t == fbzVar.t && this.X.equals(fbzVar.X) && this.Y == fbzVar.Y && u890.j(this.Z, fbzVar.Z);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG = xcg1.g(p3d1.g(this.e, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f);
        String str2 = this.g;
        return this.Z.hashCode() + xcg1.g(f4i1.b(ab80.k(this.t, xcg1.g(xcg1.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31), 31, this.X), 31, this.Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(fd21.o(this.t));
        Iterator itM = kk0.m(parcel, this.X);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeString(this.Z);
    }
}
