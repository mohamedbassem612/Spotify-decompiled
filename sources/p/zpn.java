package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zpn implements aqn {
    public static final Parcelable.Creator<zpn> CREATOR = new upn((byte) 1);
    public final boolean X;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final ypn i;
    public final boolean t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zpn(boolean z, List list, List list2, List list3, String str, String str2, ypn ypnVar, boolean z2, int i) {
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) != 0 ? false : z;
        int i2 = i & 8;
        z6x z6xVar = z6x.a;
        List list4 = i2 != 0 ? z6xVar : list;
        List list5 = (i & 16) != 0 ? z6xVar : list2;
        this(true, z3, z4, list4, list5, (i & 32) != 0 ? z6xVar : list3, str, str2, (i & 256) != 0 ? new xpn() : ypnVar, false, (i & 1024) != 0 ? list5.isEmpty() : z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpn)) {
            return false;
        }
        zpn zpnVar = (zpn) obj;
        return this.a == zpnVar.a && this.b == zpnVar.b && this.c == zpnVar.c && u890.j(this.d, zpnVar.d) && u890.j(this.e, zpnVar.e) && u890.j(this.f, zpnVar.f) && u890.j(this.g, zpnVar.g) && u890.j(this.h, zpnVar.h) && u890.j(this.i, zpnVar.i) && this.t == zpnVar.t && this.X == zpnVar.X;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X) + xcg1.g((this.i.hashCode() + cy30.d(cy30.d(f4i1.b(f4i1.b(f4i1.b(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.t);
    }

    @Override // p.aqn
    public final boolean k0() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((bqn) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
    }

    public zpn(boolean z, boolean z2, boolean z3, List list, List list2, List list3, String str, String str2, ypn ypnVar, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = str;
        this.h = str2;
        this.i = ypnVar;
        this.t = z4;
        this.X = z5;
    }
}
