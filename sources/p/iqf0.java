package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iqf0 implements Parcelable {
    public static final Parcelable.Creator<iqf0> CREATOR = new ipf0((byte) 9);
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public iqf0(boolean z, List list, List list2, boolean z2, boolean z3) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = z3;
    }

    public static iqf0 a(iqf0 iqf0Var, boolean z, List list, ArrayList arrayList, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = iqf0Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            list = iqf0Var.b;
        }
        List list2 = list;
        List list3 = arrayList;
        if ((i & 4) != 0) {
            list3 = iqf0Var.c;
        }
        List list4 = list3;
        if ((i & 8) != 0) {
            z2 = iqf0Var.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = iqf0Var.e;
        }
        iqf0Var.getClass();
        return new iqf0(z4, list2, list4, z5, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqf0)) {
            return false;
        }
        iqf0 iqf0Var = (iqf0) obj;
        return this.a == iqf0Var.a && u890.j(this.b, iqf0Var.b) && u890.j(this.c, iqf0Var.c) && this.d == iqf0Var.d && this.e == iqf0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(f4i1.b(f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeStringList(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((zpf0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iqf0() {
        z6x z6xVar = z6x.a;
        this(false, z6xVar, z6xVar, false, false);
    }
}
