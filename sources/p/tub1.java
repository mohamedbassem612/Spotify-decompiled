package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tub1 implements vub1 {
    public static final Parcelable.Creator<tub1> CREATOR;
    public final String a;
    public final List b;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new olb1((byte) 28);
    }

    public /* synthetic */ tub1(String str, List list, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tub1)) {
            return false;
        }
        tub1 tub1Var = (tub1) obj;
        return u890.j(this.a, tub1Var.a) && u890.j(this.b, tub1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        List list = this.b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    public tub1(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
