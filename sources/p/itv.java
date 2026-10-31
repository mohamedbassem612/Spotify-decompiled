package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class itv implements Parcelable {
    public static final Parcelable.Creator<itv> CREATOR = new s5v((byte) 15);
    public final int a;
    public final Set b;
    public final List c;

    public itv(int i, List list, Set set) {
        this.a = i;
        this.b = set;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itv)) {
            return false;
        }
        itv itvVar = (itv) obj;
        return this.a == itvVar.a && u890.j(this.b, itvVar.b) && u890.j(this.c, itvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Iterator itH = k4s0.h(this.b, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
