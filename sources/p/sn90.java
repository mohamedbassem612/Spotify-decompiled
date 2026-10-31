package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sn90 extends un90 implements c9e0 {
    public static final Parcelable.Creator<sn90> CREATOR = new qg90((byte) 20);
    public final int a;
    public final int b;
    public final tr80 c;
    public final List d;
    public final boolean e;

    public sn90(int i, int i2, tr80 tr80Var, List list, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = tr80Var;
        this.d = list;
        this.e = z;
    }

    public final tr80 a() {
        return this.c;
    }

    public final boolean b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn90)) {
            return false;
        }
        sn90 sn90Var = (sn90) obj;
        return this.a == sn90Var.a && this.b == sn90Var.b && u890.j(this.c, sn90Var.c) && u890.j(this.d, sn90Var.d) && this.e == sn90Var.e;
    }

    public final List g() {
        return z6x.a;
    }

    public final int getCount() {
        return this.b;
    }

    public final List getFilters() {
        return z6x.a;
    }

    public final int getId() {
        return this.a;
    }

    public final List getItems() {
        return this.d;
    }

    public final int h() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f4i1.b(lf51.e(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        return ryo1.A(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        tr80 tr80Var = this.c;
        parcel.writeInt(((rr80) tr80Var).a);
        parcel.writeInt(((rr80) tr80Var).b);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((ttm1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
