package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i971 implements Parcelable {
    public static final Parcelable.Creator<i971> CREATOR;
    public final List a;
    public final boolean b;
    public final int c;
    public final w4i1 d;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new v871((byte) 2);
        Parcelable.Creator creator2 = w4i1.CREATOR;
        Parcelable.Creator creator3 = w4i1.CREATOR;
    }

    public i971(List list, boolean z, int i, w4i1 w4i1Var) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = w4i1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i971)) {
            return false;
        }
        i971 i971Var = (i971) obj;
        return u890.j(this.a, i971Var.a) && this.b == i971Var.b && this.c == i971Var.c && u890.j(this.d, i971Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public /* synthetic */ i971(List list, boolean z, w4i1 w4i1Var) {
        this(list, z, 10, w4i1Var);
    }
}
