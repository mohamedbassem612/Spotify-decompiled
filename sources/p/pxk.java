package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pxk implements Parcelable {
    public static final Parcelable.Creator<pxk> CREATOR = new v6h((byte) 26);
    public final int N0;
    public final String X;
    public final r591 Y;
    public final String Z;
    public final String a;
    public final qxk b;
    public final List c;
    public final yxk d;
    public final sxk e;
    public final String f;
    public final String g;
    public final boolean h;
    public final List i;
    public final List t;

    public /* synthetic */ pxk(String str, qxk qxkVar, ArrayList arrayList, yxk yxkVar, sxk sxkVar, String str2, String str3, boolean z, ArrayList arrayList2, String str4, r591 r591Var, String str5, int i) {
        this(str, qxkVar, arrayList, yxkVar, sxkVar, (i & 32) != 0 ? null : str2, str3, z, arrayList2, null, str4, r591Var, str5, 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxk)) {
            return false;
        }
        pxk pxkVar = (pxk) obj;
        return u890.j(this.a, pxkVar.a) && u890.j(this.b, pxkVar.b) && u890.j(this.c, pxkVar.c) && u890.j(this.d, pxkVar.d) && u890.j(this.e, pxkVar.e) && u890.j(this.f, pxkVar.f) && u890.j(this.g, pxkVar.g) && this.h == pxkVar.h && u890.j(this.i, pxkVar.i) && u890.j(this.t, pxkVar.t) && u890.j(this.X, pxkVar.X) && this.Y == pxkVar.Y && u890.j(this.Z, pxkVar.Z) && this.N0 == pxkVar.N0;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31;
        String str = this.f;
        int iB = f4i1.b(xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        List list = this.t;
        int iD = cy30.d((iB + (list == null ? 0 : list.hashCode())) * 31, 31, this.X);
        r591 r591Var = this.Y;
        int iHashCode2 = (iD + (r591Var == null ? 0 : r591Var.hashCode())) * 31;
        String str2 = this.Z;
        return l1d.C(this.N0) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((uxk) itM.next()).writeToParcel(parcel, i);
        }
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        Iterator itM2 = kk0.m(parcel, this.i);
        while (itM2.hasNext()) {
            ((rxk) itM2.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.t);
        parcel.writeString(this.X);
        r591 r591Var = this.Y;
        if (r591Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r591Var.name());
        }
        parcel.writeString(this.Z);
        int i2 = this.N0;
        if (i2 == 1) {
            str = "BACK_ARROW";
        } else if (i2 == 2) {
            str = "BACK";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "CANCEL";
        }
        parcel.writeString(str);
    }

    public pxk(String str, qxk qxkVar, List list, yxk yxkVar, sxk sxkVar, String str2, String str3, boolean z, List list2, List list3, String str4, r591 r591Var, String str5, int i) {
        this.a = str;
        this.b = qxkVar;
        this.c = list;
        this.d = yxkVar;
        this.e = sxkVar;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = list2;
        this.t = list3;
        this.X = str4;
        this.Y = r591Var;
        this.Z = str5;
        this.N0 = i;
    }
}
