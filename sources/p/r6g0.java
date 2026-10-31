package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6g0 implements Parcelable {
    public static final Parcelable.Creator<r6g0> CREATOR = new isf0((byte) 15);
    public final String X;
    public final String a;
    public final String b;
    public final iyr0 c;
    public final i7g0 d;
    public final boolean e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final Map t;

    public r6g0(String str, String str2, iyr0 iyr0Var, i7g0 i7g0Var, boolean z, List list, List list2, List list3, List list4, Map map, String str3) {
        this.a = str;
        this.b = str2;
        this.c = iyr0Var;
        this.d = i7g0Var;
        this.e = z;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.t = map;
        this.X = str3;
    }

    public static r6g0 a(r6g0 r6g0Var, i7g0 i7g0Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Map map, int i) {
        String str = r6g0Var.a;
        String str2 = r6g0Var.b;
        iyr0 iyr0Var = r6g0Var.c;
        if ((i & 8) != 0) {
            i7g0Var = r6g0Var.d;
        }
        i7g0 i7g0Var2 = i7g0Var;
        boolean z = r6g0Var.e;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = r6g0Var.f;
        }
        List list2 = list;
        List list3 = (i & 64) != 0 ? r6g0Var.g : arrayList2;
        List list4 = (i & 128) != 0 ? r6g0Var.h : arrayList3;
        List list5 = (i & 256) != 0 ? r6g0Var.i : arrayList4;
        Map map2 = (i & 512) != 0 ? r6g0Var.t : map;
        String str3 = r6g0Var.X;
        r6g0Var.getClass();
        return new r6g0(str, str2, iyr0Var, i7g0Var2, z, list2, list3, list4, list5, map2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6g0)) {
            return false;
        }
        r6g0 r6g0Var = (r6g0) obj;
        return u890.j(this.a, r6g0Var.a) && u890.j(this.b, r6g0Var.b) && this.c == r6g0Var.c && this.d == r6g0Var.d && this.e == r6g0Var.e && u890.j(this.f, r6g0Var.f) && u890.j(this.g, r6g0Var.g) && u890.j(this.h, r6g0Var.h) && u890.j(this.i, r6g0Var.i) && u890.j(this.t, r6g0Var.t) && u890.j(this.X, r6g0Var.X);
    }

    public final int hashCode() {
        int iE = cy30.e(f4i1.b(f4i1.b(f4i1.b(f4i1.b(xcg1.g((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t);
        String str = this.X;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((f7g0) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.g);
        while (itM2.hasNext()) {
            ((y4g0) itM2.next()).writeToParcel(parcel, i);
        }
        Iterator itM3 = kk0.m(parcel, this.h);
        while (itM3.hasNext()) {
            ((bzr0) itM3.next()).writeToParcel(parcel, i);
        }
        Iterator itM4 = kk0.m(parcel, this.i);
        while (itM4.hasNext()) {
            ((mxr0) itM4.next()).writeToParcel(parcel, i);
        }
        Iterator itJ = xcg1.j(parcel, this.t);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.X);
    }

    public /* synthetic */ r6g0(String str, String str2, iyr0 iyr0Var, i7g0 i7g0Var, boolean z, List list, List list2, List list3, List list4, String str3) {
        this(str, str2, iyr0Var, i7g0Var, z, list, list2, list3, list4, b7x.a, str3);
    }
}
