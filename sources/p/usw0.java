package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class usw0 extends vsw0 {
    public static final Parcelable.Creator<usw0> CREATOR = new w7w0((byte) 26);
    public final List c;
    public final String d;
    public final nf21 e;

    public usw0(List list, String str, nf21 nf21Var) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((qnc1) it.next()).a);
        }
        super(2, arrayList);
        this.c = list;
        this.d = str;
        this.e = nf21Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usw0)) {
            return false;
        }
        usw0 usw0Var = (usw0) obj;
        return u890.j(this.c, usw0Var.c) && u890.j(this.d, usw0Var.d) && this.e == usw0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        nf21 nf21Var = this.e;
        return iHashCode2 + (nf21Var != null ? nf21Var.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((qnc1) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        nf21 nf21Var = this.e;
        if (nf21Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(nf21Var.name());
        }
    }
}
