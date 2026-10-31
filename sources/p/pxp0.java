package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pxp0 implements Parcelable {
    public static final Parcelable.Creator<pxp0> CREATOR = new ump0((byte) 28);
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final sxp0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public pxp0(String str, String str2, String str3, ArrayList arrayList, sxp0 sxp0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = sxp0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((uxp0) it.next()).a);
        }
        this.i = xa4.o(arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxp0)) {
            return false;
        }
        pxp0 pxp0Var = (pxp0) obj;
        return u890.j(this.a, pxp0Var.a) && u890.j(this.b, pxp0Var.b) && u890.j(this.c, pxp0Var.c) && this.d.equals(pxp0Var.d) && u890.j(this.e, pxp0Var.e) && this.f == pxp0Var.f && this.g == pxp0Var.g && this.h == pxp0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        sxp0 sxp0Var = this.e;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((iF + (sxp0Var != null ? sxp0Var.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            ((uxp0) itO.next()).writeToParcel(parcel, i);
        }
        sxp0 sxp0Var = this.e;
        if (sxp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sxp0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
