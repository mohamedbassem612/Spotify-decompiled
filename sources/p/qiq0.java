package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qiq0 extends siq0 {
    public static final Parcelable.Creator<qiq0> CREATOR = new p7q0((byte) 9);
    public final xo20 a;
    public final List b;
    public final List c;

    public qiq0(xo20 xo20Var, List list, List list2) {
        this.a = xo20Var;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiq0)) {
            return false;
        }
        qiq0 qiq0Var = (qiq0) obj;
        return u890.j(this.a, qiq0Var.a) && this.b.equals(qiq0Var.b) && u890.j(this.c, qiq0Var.c);
    }

    public final int hashCode() {
        xo20 xo20Var = this.a;
        int iB = f4i1.b((xo20Var == null ? 0 : xo20Var.hashCode()) * 31, 31, this.b);
        List list = this.c;
        return iB + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((k851) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.c);
    }
}
