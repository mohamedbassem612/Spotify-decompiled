package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sd7 implements Parcelable {
    public static final Parcelable.Creator<sd7> CREATOR = new f67((byte) 6);
    public final boolean X;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final r620 e;
    public final List f;
    public final int g;
    public final yd7 h;
    public final List i;
    public final List t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ sd7(String str, r620 r620Var, yd7 yd7Var, List list, List list2, int i) {
        String str2 = (i & 1) != 0 ? "" : str;
        r620 r620Var2 = (i & 16) != 0 ? r620.TOP : r620Var;
        yd7 yd7Var2 = (i & 128) != 0 ? null : yd7Var;
        int i2 = i & 256;
        List list3 = z6x.a;
        this(str2, null, "", false, r620Var2, list3, 1, yd7Var2, i2 != 0 ? list3 : list, (i & 512) != 0 ? f46.Q0(gzy.values()) : list2, false);
    }

    public static sd7 a(sd7 sd7Var, String str, String str2, String str3, boolean z, r620 r620Var, List list, int i, yd7 yd7Var, List list2, List list3, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = sd7Var.a;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            str2 = sd7Var.b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = sd7Var.c;
        }
        String str6 = str3;
        boolean z3 = (i2 & 8) != 0 ? sd7Var.d : z;
        r620 r620Var2 = (i2 & 16) != 0 ? sd7Var.e : r620Var;
        List list4 = (i2 & 32) != 0 ? sd7Var.f : list;
        int i3 = (i2 & 64) != 0 ? sd7Var.g : i;
        yd7 yd7Var2 = (i2 & 128) != 0 ? sd7Var.h : yd7Var;
        List list5 = (i2 & 256) != 0 ? sd7Var.i : list2;
        List list6 = (i2 & 512) != 0 ? sd7Var.t : list3;
        boolean z4 = (i2 & 1024) != 0 ? sd7Var.X : z2;
        sd7Var.getClass();
        return new sd7(str4, str5, str6, z3, r620Var2, list4, i3, yd7Var2, list5, list6, z4);
    }

    public final List b() {
        List list = this.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof yh90) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((yh90) obj2).g) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((yh90) it.next()).a);
        }
        return o7h.j0(arrayList3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd7)) {
            return false;
        }
        sd7 sd7Var = (sd7) obj;
        return u890.j(this.a, sd7Var.a) && u890.j(this.b, sd7Var.b) && u890.j(this.c, sd7Var.c) && this.d == sd7Var.d && this.e == sd7Var.e && u890.j(this.f, sd7Var.f) && this.g == sd7Var.g && u890.j(this.h, sd7Var.h) && u890.j(this.i, sd7Var.i) && u890.j(this.t, sd7Var.t) && this.X == sd7Var.X;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iK = ab80.k(this.g, f4i1.b((this.e.hashCode() + xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31);
        yd7 yd7Var = this.h;
        return Boolean.hashCode(this.X) + f4i1.b(f4i1.b((iK + (yd7Var != null ? yd7Var.hashCode() : 0)) * 31, 31, this.i), 31, this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e.name());
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        int i2 = this.g;
        if (i2 == 1) {
            str = "NOT_LOADED";
        } else if (i2 == 2) {
            str = "LOADED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "FAILED";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.h, i);
        Iterator itM2 = kk0.m(parcel, this.i);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        Iterator itM3 = kk0.m(parcel, this.t);
        while (itM3.hasNext()) {
            parcel.writeParcelable((Parcelable) itM3.next(), i);
        }
        parcel.writeInt(this.X ? 1 : 0);
    }

    public sd7(String str, String str2, String str3, boolean z, r620 r620Var, List list, int i, yd7 yd7Var, List list2, List list3, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = r620Var;
        this.f = list;
        this.g = i;
        this.h = yd7Var;
        this.i = list2;
        this.t = list3;
        this.X = z2;
    }
}
