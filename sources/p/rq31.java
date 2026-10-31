package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rq31 implements Parcelable {
    public static final Parcelable.Creator<rq31> CREATOR = new s231((byte) 25);
    public final vp31 a;
    public final List b;
    public final uq31 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public rq31(vp31 vp31Var, List list, uq31 uq31Var, boolean z, boolean z2, boolean z3) {
        this.a = vp31Var;
        this.b = list;
        this.c = uq31Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static rq31 a(rq31 rq31Var, ArrayList arrayList, uq31 uq31Var, boolean z, int i) {
        vp31 vp31Var = rq31Var.a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = rq31Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            uq31Var = rq31Var.c;
        }
        uq31 uq31Var2 = uq31Var;
        boolean z2 = rq31Var.d;
        if ((i & 16) != 0) {
            z = rq31Var.e;
        }
        return new rq31(vp31Var, list2, uq31Var2, z2, z, (i & 32) != 0 ? rq31Var.f : true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq31)) {
            return false;
        }
        rq31 rq31Var = (rq31) obj;
        return u890.j(this.a, rq31Var.a) && u890.j(this.b, rq31Var.b) && u890.j(this.c, rq31Var.c) && this.d == rq31Var.d && this.e == rq31Var.e && this.f == rq31Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
