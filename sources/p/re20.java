package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class re20 extends ue20 {
    public static final Parcelable.Creator<re20> CREATOR = new qe20((byte) 0);
    public final xo20 a;
    public final List b;
    public final boolean c;

    public re20(xo20 xo20Var, List list, boolean z) {
        this.a = xo20Var;
        this.b = list;
        this.c = z;
    }

    public static re20 a(re20 re20Var, xo20 xo20Var, boolean z, int i) {
        if ((i & 1) != 0) {
            xo20Var = re20Var.a;
        }
        List list = re20Var.b;
        if ((i & 4) != 0) {
            z = re20Var.c;
        }
        re20Var.getClass();
        return new re20(xo20Var, list, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re20)) {
            return false;
        }
        re20 re20Var = (re20) obj;
        return u890.j(this.a, re20Var.a) && this.b.equals(re20Var.b) && this.c == re20Var.c;
    }

    public final int hashCode() {
        xo20 xo20Var = this.a;
        return Boolean.hashCode(this.c) + f4i1.b((xo20Var == null ? 0 : xo20Var.hashCode()) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
