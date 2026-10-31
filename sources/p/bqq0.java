package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bqq0 implements Parcelable {
    public static final Parcelable.Creator<bqq0> CREATOR = new p7q0((byte) 15);
    public final fab0 a;
    public final as3 b;
    public final dia1 c;
    public final List d;
    public final mml e;
    public final boolean f;
    public final a3t0 g;
    public final boolean h;
    public final boolean i;

    public bqq0(fab0 fab0Var, as3 as3Var, dia1 dia1Var, List list, mml mmlVar, boolean z, a3t0 a3t0Var, boolean z2, boolean z3) {
        this.a = fab0Var;
        this.b = as3Var;
        this.c = dia1Var;
        this.d = list;
        this.e = mmlVar;
        this.f = z;
        this.g = a3t0Var;
        this.h = z2;
        this.i = z3;
    }

    public static bqq0 a(bqq0 bqq0Var, as3 as3Var, dia1 dia1Var, mml mmlVar, int i) {
        fab0 fab0Var = bqq0Var.a;
        if ((i & 2) != 0) {
            as3Var = bqq0Var.b;
        }
        as3 as3Var2 = as3Var;
        if ((i & 4) != 0) {
            dia1Var = bqq0Var.c;
        }
        dia1 dia1Var2 = dia1Var;
        List list = bqq0Var.d;
        if ((i & 16) != 0) {
            mmlVar = bqq0Var.e;
        }
        boolean z = bqq0Var.f;
        a3t0 a3t0Var = bqq0Var.g;
        boolean z2 = bqq0Var.h;
        boolean z3 = bqq0Var.i;
        bqq0Var.getClass();
        return new bqq0(fab0Var, as3Var2, dia1Var2, list, mmlVar, z, a3t0Var, z2, z3);
    }

    public final lml b() {
        mml mmlVar = this.e;
        if (mmlVar instanceof lml) {
            return (lml) mmlVar;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqq0)) {
            return false;
        }
        bqq0 bqq0Var = (bqq0) obj;
        return u890.j(this.a, bqq0Var.a) && this.b == bqq0Var.b && this.c == bqq0Var.c && this.d.equals(bqq0Var.d) && u890.j(this.e, bqq0Var.e) && this.f == bqq0Var.f && this.g == bqq0Var.g && this.h == bqq0Var.h && this.i == bqq0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + xcg1.g((this.e.hashCode() + f4i1.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f)) * 31, 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g.name());
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
