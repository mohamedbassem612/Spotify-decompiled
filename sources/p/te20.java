package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class te20 extends ue20 {
    public static final Parcelable.Creator<te20> CREATOR = new qe20((byte) 2);
    public final List a;
    public final String b;

    public te20(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public static te20 a(te20 te20Var, ArrayList arrayList, String str, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = te20Var.a;
        }
        if ((i & 2) != 0) {
            str = te20Var.b;
        }
        te20Var.getClass();
        return new te20(list, str);
    }

    public final ArrayList b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((db20) obj).c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((db20) it.next()).a);
        }
        return arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te20)) {
            return false;
        }
        te20 te20Var = (te20) obj;
        return this.a.equals(te20Var.a) && u890.j(this.b, te20Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.b);
    }
}
