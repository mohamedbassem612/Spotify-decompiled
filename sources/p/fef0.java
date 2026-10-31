package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fef0 implements Parcelable {
    public static final Parcelable.Creator<fef0> CREATOR = new j7f0(5);
    public final List a;
    public final int b;
    public final List c;
    public final String d;
    public final boolean e;
    public final bef0 f;
    public final eef0 g;
    public final int h;
    public final List i;

    public fef0(List list, int i, List list2, String str, boolean z, bef0 bef0Var, eef0 eef0Var, int i2, List list3) {
        this.a = list;
        this.b = i;
        this.c = list2;
        this.d = str;
        this.e = z;
        this.f = bef0Var;
        this.g = eef0Var;
        this.h = i2;
        this.i = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fef0)) {
            return false;
        }
        fef0 fef0Var = (fef0) obj;
        return u890.j(this.a, fef0Var.a) && this.b == fef0Var.b && u890.j(this.c, fef0Var.c) && u890.j(this.d, fef0Var.d) && this.e == fef0Var.e && u890.j(this.f, fef0Var.f) && u890.j(this.g, fef0Var.g) && this.h == fef0Var.h && u890.j(this.i, fef0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ab80.k(this.h, xcg1.g((this.f.hashCode() + xcg1.g(cy30.d(f4i1.b(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g.a), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((aef0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(pze0.q(this.b));
        Iterator itM2 = kk0.m(parcel, this.c);
        while (itM2.hasNext()) {
            ((def0) itM2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        this.f.writeToParcel(parcel, i);
        this.g.writeToParcel(parcel, i);
        int i2 = this.h;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "UNCAPPED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "CAPPED";
        }
        parcel.writeString(str);
        parcel.writeStringList(this.i);
    }
}
