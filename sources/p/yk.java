package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yk implements Parcelable {
    public static final Parcelable.Creator<yk> CREATOR = new ad(7);
    public static final yk N0 = new yk(null, null, null, new dxr0(), null, null, tpw0.c, new vxa0(null), z6x.a, wq00.a, false, 18, vur0.ParentalControls);
    public final boolean X;
    public final int Y;
    public final vur0 Z;
    public final String a;
    public final String b;
    public final String c;
    public final dxr0 d;
    public final String e;
    public final String f;
    public final tpw0 g;
    public final xxa0 h;
    public final List i;
    public final yq00 t;

    public yk(String str, String str2, String str3, dxr0 dxr0Var, String str4, String str5, tpw0 tpw0Var, xxa0 xxa0Var, List list, yq00 yq00Var, boolean z, int i, vur0 vur0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dxr0Var;
        this.e = str4;
        this.f = str5;
        this.g = tpw0Var;
        this.h = xxa0Var;
        this.i = list;
        this.t = yq00Var;
        this.X = z;
        this.Y = i;
        this.Z = vur0Var;
    }

    public static yk a(yk ykVar, String str, String str2, String str3, dxr0 dxr0Var, String str4, String str5, tpw0 tpw0Var, xxa0 xxa0Var, ArrayList arrayList, yq00 yq00Var, boolean z, int i, vur0 vur0Var, int i2) {
        if ((i2 & 1) != 0) {
            str = ykVar.a;
        }
        String str6 = str;
        String str7 = (i2 & 2) != 0 ? ykVar.b : str2;
        String str8 = (i2 & 4) != 0 ? ykVar.c : str3;
        dxr0 dxr0Var2 = (i2 & 8) != 0 ? ykVar.d : dxr0Var;
        String str9 = (i2 & 16) != 0 ? ykVar.e : str4;
        String str10 = (i2 & 32) != 0 ? ykVar.f : str5;
        tpw0 tpw0Var2 = (i2 & 64) != 0 ? ykVar.g : tpw0Var;
        xxa0 xxa0Var2 = (i2 & 128) != 0 ? ykVar.h : xxa0Var;
        List list = (i2 & 256) != 0 ? ykVar.i : arrayList;
        yq00 yq00Var2 = (i2 & 512) != 0 ? ykVar.t : yq00Var;
        boolean z2 = (i2 & 1024) != 0 ? ykVar.X : z;
        int i3 = (i2 & 2048) != 0 ? ykVar.Y : i;
        vur0 vur0Var2 = (i2 & 4096) != 0 ? ykVar.Z : vur0Var;
        ykVar.getClass();
        return new yk(str6, str7, str8, dxr0Var2, str9, str10, tpw0Var2, xxa0Var2, list, yq00Var2, z2, i3, vur0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return u890.j(this.a, ykVar.a) && u890.j(this.b, ykVar.b) && u890.j(this.c, ykVar.c) && u890.j(this.d, ykVar.d) && u890.j(this.e, ykVar.e) && u890.j(this.f, ykVar.f) && this.g == ykVar.g && u890.j(this.h, ykVar.h) && u890.j(this.i, ykVar.i) && u890.j(this.t, ykVar.t) && this.X == ykVar.X && this.Y == ykVar.Y && this.Z == ykVar.Z;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return this.Z.hashCode() + kaa0.f(this.Y, xcg1.g((this.t.hashCode() + f4i1.b((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.i)) * 31, 31, this.X), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        Iterator itM = kk0.m(parcel, this.i);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z.name());
    }
}
