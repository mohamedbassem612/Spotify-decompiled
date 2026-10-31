package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sxc0 implements Parcelable {
    public static final Parcelable.Creator<sxc0> CREATOR = new rqc0((byte) 27);
    public final bqq0 a;
    public final oqz0 b;
    public final un90 c;
    public final int d;
    public final int e;
    public final mn01 f;
    public final List g;
    public final List h;

    public sxc0(bqq0 bqq0Var, oqz0 oqz0Var, un90 un90Var, int i, int i2, mn01 mn01Var, List list, List list2) {
        this.a = bqq0Var;
        this.b = oqz0Var;
        this.c = un90Var;
        this.d = i;
        this.e = i2;
        this.f = mn01Var;
        this.g = list;
        this.h = list2;
    }

    public static sxc0 a(sxc0 sxc0Var, bqq0 bqq0Var, oqz0 oqz0Var, un90 un90Var, ln01 ln01Var, List list, List list2, int i) {
        if ((i & 1) != 0) {
            bqq0Var = sxc0Var.a;
        }
        bqq0 bqq0Var2 = bqq0Var;
        if ((i & 2) != 0) {
            oqz0Var = sxc0Var.b;
        }
        oqz0 oqz0Var2 = oqz0Var;
        if ((i & 4) != 0) {
            un90Var = sxc0Var.c;
        }
        un90 un90Var2 = un90Var;
        int i2 = sxc0Var.d;
        int i3 = sxc0Var.e;
        mn01 mn01Var = ln01Var;
        if ((i & 32) != 0) {
            mn01Var = sxc0Var.f;
        }
        mn01 mn01Var2 = mn01Var;
        List list3 = (i & 64) != 0 ? sxc0Var.g : list;
        List list4 = (i & 128) != 0 ? sxc0Var.h : list2;
        sxc0Var.getClass();
        return new sxc0(bqq0Var2, oqz0Var2, un90Var2, i2, i3, mn01Var2, list3, list4);
    }

    public final boolean b() {
        mml mmlVar = this.a.e;
        return (mmlVar instanceof iml ? (iml) mmlVar : null) != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxc0)) {
            return false;
        }
        sxc0 sxc0Var = (sxc0) obj;
        return u890.j(this.a, sxc0Var.a) && u890.j(this.b, sxc0Var.b) && u890.j(this.c, sxc0Var.c) && this.d == sxc0Var.d && this.e == sxc0Var.e && u890.j(this.f, sxc0Var.f) && u890.j(this.g, sxc0Var.g) && u890.j(this.h, sxc0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + f4i1.b((this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31, 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
        Iterator itM = kk0.m(parcel, this.g);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeStringList(this.h);
    }
}
