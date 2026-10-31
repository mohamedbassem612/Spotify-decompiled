package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vhi1 extends whi1 {
    public static final Parcelable.Creator<vhi1> CREATOR = new xbi1((byte) 8);
    public final List a;
    public final p2f1 b;

    public vhi1(List list, p2f1 p2f1Var) {
        this.a = list;
        this.b = p2f1Var;
    }

    public final p2f1 a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhi1)) {
            return false;
        }
        vhi1 vhi1Var = (vhi1) obj;
        return u890.j(this.a, vhi1Var.a) && u890.j(this.b, vhi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.b, i);
    }
}
