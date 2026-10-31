package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class adn implements Parcelable {
    public static final Parcelable.Creator<adn> CREATOR = new rtm((byte) 21);
    public final List N0;
    public final boolean O0;
    public final List P0;
    public final int Q0;
    public final int X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final yy30 e;
    public final mu91 f;
    public final zhd g;
    public final int h;
    public final int i;
    public final int t;

    /* JADX WARN: Illegal instructions before constructor call */
    public adn(String str, String str2, List list, int i, yy30 yy30Var, mu91 mu91Var, zhd zhdVar, int i2, int i3, int i4, int i5, String str3, String str4, ArrayList arrayList, boolean z, List list2, int i6, int i7) {
        int i8 = i7 & 4;
        ArrayList arrayList2 = z6x.a;
        this(str, str2, i8 != 0 ? arrayList2 : list, i, (i7 & 16) != 0 ? yy30.a : yy30Var, (i7 & 32) != 0 ? new mu91(Collections.singletonList(new hg50(0, 0)), t5u.d) : mu91Var, (i7 & 64) != 0 ? null : zhdVar, (i7 & 128) != 0 ? 0 : i2, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) != 0 ? -16777216 : i5, (i7 & 2048) != 0 ? null : str3, (i7 & 4096) != 0 ? null : str4, (i7 & 8192) != 0 ? arrayList2 : arrayList, (i7 & 16384) != 0 ? false : z, list2, (i7 & 65536) != 0 ? 0 : i6);
    }

    public static adn a(adn adnVar, List list, int i, yy30 yy30Var, mu91 mu91Var, zhd zhdVar, int i2, int i3, int i4, int i5, String str, String str2, List list2, boolean z, List list3, int i6, int i7) {
        String str3 = adnVar.a;
        String str4 = adnVar.b;
        List list4 = (i7 & 4) != 0 ? adnVar.c : list;
        int i8 = (i7 & 8) != 0 ? adnVar.d : i;
        yy30 yy30Var2 = (i7 & 16) != 0 ? adnVar.e : yy30Var;
        mu91 mu91Var2 = (i7 & 32) != 0 ? adnVar.f : mu91Var;
        zhd zhdVar2 = (i7 & 64) != 0 ? adnVar.g : zhdVar;
        int i9 = (i7 & 128) != 0 ? adnVar.h : i2;
        int i10 = (i7 & 256) != 0 ? adnVar.i : i3;
        int i11 = (i7 & 512) != 0 ? adnVar.t : i4;
        int i12 = (i7 & 1024) != 0 ? adnVar.X : i5;
        String str5 = (i7 & 2048) != 0 ? adnVar.Y : str;
        String str6 = (i7 & 4096) != 0 ? adnVar.Z : str2;
        List list5 = (i7 & 8192) != 0 ? adnVar.N0 : list2;
        boolean z2 = (i7 & 16384) != 0 ? adnVar.O0 : z;
        List list6 = (i7 & 32768) != 0 ? adnVar.P0 : list3;
        int i13 = (i7 & 65536) != 0 ? adnVar.Q0 : i6;
        adnVar.getClass();
        return new adn(str3, str4, list4, i8, yy30Var2, mu91Var2, zhdVar2, i9, i10, i11, i12, str5, str6, list5, z2, list6, i13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adn)) {
            return false;
        }
        adn adnVar = (adn) obj;
        return u890.j(this.a, adnVar.a) && u890.j(this.b, adnVar.b) && u890.j(this.c, adnVar.c) && this.d == adnVar.d && this.e == adnVar.e && u890.j(this.f, adnVar.f) && u890.j(this.g, adnVar.g) && this.h == adnVar.h && this.i == adnVar.i && this.t == adnVar.t && this.X == adnVar.X && u890.j(this.Y, adnVar.Y) && u890.j(this.Z, adnVar.Z) && u890.j(this.N0, adnVar.N0) && this.O0 == adnVar.O0 && u890.j(this.P0, adnVar.P0) && this.Q0 == adnVar.Q0;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + kaa0.f(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31)) * 31;
        zhd zhdVar = this.g;
        int iF = kaa0.f(this.X, kaa0.f(this.t, kaa0.f(this.i, kaa0.f(this.h, (iHashCode + (zhdVar == null ? 0 : zhdVar.hashCode())) * 31, 31), 31), 31), 31);
        String str = this.Y;
        int iHashCode2 = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Z;
        return Integer.hashCode(this.Q0) + f4i1.b(xcg1.g(f4i1.b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.N0), 31, this.O0), 31, this.P0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.d);
        parcel.writeString(this.e.name());
        this.f.writeToParcel(parcel, i);
        zhd zhdVar = this.g;
        if (zhdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zhdVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        Iterator itM = kk0.m(parcel, this.N0);
        while (itM.hasNext()) {
            ((plv) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeStringList(this.P0);
        parcel.writeInt(this.Q0);
    }

    public adn(String str, String str2, List list, int i, yy30 yy30Var, mu91 mu91Var, zhd zhdVar, int i2, int i3, int i4, int i5, String str3, String str4, List list2, boolean z, List list3, int i6) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = yy30Var;
        this.f = mu91Var;
        this.g = zhdVar;
        this.h = i2;
        this.i = i3;
        this.t = i4;
        this.X = i5;
        this.Y = str3;
        this.Z = str4;
        this.N0 = list2;
        this.O0 = z;
        this.P0 = list3;
        this.Q0 = i6;
    }
}
