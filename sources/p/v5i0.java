package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v5i0 implements Parcelable {
    public static final Parcelable.Creator<v5i0> CREATOR = new cyh0((byte) 16);
    public final boolean a;
    public final long b;
    public final List c;
    public final int d;
    public final List e;
    public final String f;
    public final g7i0 g;

    public v5i0(boolean z, long j, List list, int i, List list2, String str, g7i0 g7i0Var) {
        this.a = z;
        this.b = j;
        this.c = list;
        this.d = i;
        this.e = list2;
        this.f = str;
        this.g = g7i0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5i0)) {
            return false;
        }
        v5i0 v5i0Var = (v5i0) obj;
        return this.a == v5i0Var.a && this.b == v5i0Var.b && u890.j(this.c, v5i0Var.c) && this.d == v5i0Var.d && u890.j(this.e, v5i0Var.e) && u890.j(this.f, v5i0Var.f) && u890.j(this.g, v5i0Var.g);
    }

    public final int hashCode() {
        int iB = f4i1.b(kaa0.f(this.d, f4i1.b(cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31), 31, this.e);
        String str = this.f;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        g7i0 g7i0Var = this.g;
        return iHashCode + (g7i0Var != null ? g7i0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeLong(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.d);
        Iterator itM2 = kk0.m(parcel, this.e);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v5i0(long j, int i) {
        z6x z6xVar = z6x.a;
        this(false, j, z6xVar, 0, z6xVar, null, null);
    }
}
