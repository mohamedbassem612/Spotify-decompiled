package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mn90 extends un90 implements c9e0 {
    public static final Parcelable.Creator<mn90> CREATOR = new qg90((byte) 14);
    public final int a;
    public final int b;
    public final tr80 c;
    public final List d;
    public final List e;
    public final List f;
    public final boolean g;
    public final int h;

    public mn90(int i, int i2, tr80 tr80Var, List list, List list2, List list3, boolean z, int i3) {
        this.a = i;
        this.b = i2;
        this.c = tr80Var;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = z;
        this.h = i3;
    }

    public final tr80 a() {
        return this.c;
    }

    public final boolean b() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn90)) {
            return false;
        }
        mn90 mn90Var = (mn90) obj;
        return this.a == mn90Var.a && this.b == mn90Var.b && u890.j(this.c, mn90Var.c) && u890.j(this.d, mn90Var.d) && u890.j(this.e, mn90Var.e) && u890.j(this.f, mn90Var.f) && this.g == mn90Var.g && this.h == mn90Var.h;
    }

    public final List g() {
        return this.e;
    }

    public final int getCount() {
        return this.b;
    }

    public final List getFilters() {
        return this.f;
    }

    public final int getId() {
        return this.a;
    }

    public final List getItems() {
        return this.d;
    }

    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + xcg1.g(f4i1.b(f4i1.b(f4i1.b(lf51.e(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        Iterator itM2 = kk0.m(parcel, this.e);
        while (itM2.hasNext()) {
            ((ttm1) itM2.next()).writeToParcel(parcel, i);
        }
        Iterator itM3 = kk0.m(parcel, this.f);
        while (itM3.hasNext()) {
            parcel.writeParcelable((Parcelable) itM3.next(), i);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
    }
}
