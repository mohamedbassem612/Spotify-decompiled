package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fwk1 implements Parcelable {
    public static final Parcelable.Creator<fwk1> CREATOR = new ylk1(6);
    public final String X;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final i260 e;
    public final List f;
    public final lvb g;
    public final xhz h;
    public final boolean i;
    public final String t;

    public fwk1(String str, String str2, String str3, int i, i260 i260Var, List list, lvb lvbVar, xhz xhzVar, boolean z, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i260Var;
        this.f = list;
        this.g = lvbVar;
        this.h = xhzVar;
        this.i = z;
        this.t = str4;
        this.X = str5;
    }

    public static fwk1 b(fwk1 fwk1Var, ArrayList arrayList, xhz xhzVar, boolean z, int i) {
        String str = fwk1Var.a;
        String str2 = fwk1Var.b;
        String str3 = fwk1Var.c;
        int i2 = fwk1Var.d;
        i260 i260Var = fwk1Var.e;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = fwk1Var.f;
        }
        List list2 = list;
        lvb lvbVar = fwk1Var.g;
        if ((i & 128) != 0) {
            xhzVar = fwk1Var.h;
        }
        xhz xhzVar2 = xhzVar;
        boolean z2 = (i & 256) != 0 ? fwk1Var.i : z;
        String str4 = fwk1Var.t;
        String str5 = fwk1Var.X;
        fwk1Var.getClass();
        return new fwk1(str, str2, str3, i2, i260Var, list2, lvbVar, xhzVar2, z2, str4, str5);
    }

    public final fwk1 a(int i, String str) {
        List<wdo0> list = this.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (wdo0 wdo0VarA : list) {
            if (u890.j(wdo0VarA.a, str)) {
                wdo0VarA = wdo0.a(wdo0VarA, wdo0VarA.e + i);
            }
            arrayList.add(wdo0VarA);
        }
        return b(this, arrayList, null, false, 2015);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwk1)) {
            return false;
        }
        fwk1 fwk1Var = (fwk1) obj;
        return u890.j(this.a, fwk1Var.a) && u890.j(this.b, fwk1Var.b) && u890.j(this.c, fwk1Var.c) && this.d == fwk1Var.d && u890.j(this.e, fwk1Var.e) && this.f.equals(fwk1Var.f) && u890.j(this.g, fwk1Var.g) && u890.j(this.h, fwk1Var.h) && this.i == fwk1Var.i && u890.j(this.t, fwk1Var.t) && u890.j(this.X, fwk1Var.X);
    }

    public final int g() {
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((wdo0) it.next()).e;
        }
        return i;
    }

    public final int hashCode() {
        return this.X.hashCode() + cy30.d(xcg1.g((this.h.hashCode() + ((this.g.hashCode() + f4i1.b((this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f)) * 31)) * 31, 31, this.i), 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        this.e.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((wdo0) itM.next()).writeToParcel(parcel, i);
        }
        this.g.writeToParcel(parcel, i);
        this.h.writeToParcel(parcel, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
    }
}
