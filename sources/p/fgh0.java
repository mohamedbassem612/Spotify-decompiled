package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fgh0 implements Parcelable {
    public static final Parcelable.Creator<fgh0> CREATOR = new hug0((byte) 16);
    public final List a;
    public final List b;
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fgh0(int i, List list, List list2) {
        int i2 = i & 1;
        List list3 = z6x.a;
        this(i2 != 0 ? list3 : list, (i & 2) != 0 ? list3 : list2, list3);
    }

    public final List a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgh0)) {
            return false;
        }
        fgh0 fgh0Var = (fgh0) obj;
        return u890.j(this.a, fgh0Var.a) && u890.j(this.b, fgh0Var.b) && u890.j(this.c, fgh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((gq70) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.b);
        while (itM2.hasNext()) {
            ((a7j1) itM2.next()).writeToParcel(parcel, i);
        }
        Iterator itM3 = kk0.m(parcel, this.c);
        while (itM3.hasNext()) {
            ((zy60) itM3.next()).writeToParcel(parcel, i);
        }
    }

    public fgh0(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }
}
