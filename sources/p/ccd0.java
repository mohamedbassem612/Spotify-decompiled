package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ccd0 implements Parcelable {
    public static final Parcelable.Creator<ccd0> CREATOR = new lad0((byte) 19);
    public final List a;
    public final acd0 b;
    public final long c;
    public final boolean d;
    public final Set e;
    public final boolean f;
    public final boolean g;

    public ccd0(List list, acd0 acd0Var, long j, boolean z, Set set, boolean z2, boolean z3) {
        this.a = list;
        this.b = acd0Var;
        this.c = j;
        this.d = z;
        this.e = set;
        this.f = z2;
        this.g = z3;
    }

    public static ccd0 a(ccd0 ccd0Var, List list, acd0 acd0Var, long j, boolean z, Set set, int i) {
        if ((i & 1) != 0) {
            list = ccd0Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            acd0Var = ccd0Var.b;
        }
        acd0 acd0Var2 = acd0Var;
        if ((i & 4) != 0) {
            j = ccd0Var.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = ccd0Var.d;
        }
        return new ccd0(list2, acd0Var2, j2, z, (i & 16) != 0 ? ccd0Var.e : set, ccd0Var.f, ccd0Var.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccd0)) {
            return false;
        }
        ccd0 ccd0Var = (ccd0) obj;
        return u890.j(this.a, ccd0Var.a) && u890.j(this.b, ccd0Var.b) && this.c == ccd0Var.c && this.d == ccd0Var.d && this.e.equals(ccd0Var.e) && this.f == ccd0Var.f && this.g == ccd0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(gvg.c(xcg1.g(cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itH = k4s0.h(this.e, parcel);
        while (itH.hasNext()) {
            parcel.writeString(((ubd0) itH.next()).name());
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
