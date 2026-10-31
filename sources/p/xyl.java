package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xyl extends kzl {
    public static final Parcelable.Creator<xyl> CREATOR = new pol((byte) 23);
    public final int a;
    public final ArrayList b;

    public xyl(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyl)) {
            return false;
        }
        xyl xylVar = (xyl) obj;
        return this.a == xylVar.a && this.b.equals(xylVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(x0d.v(this.a));
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
    }
}
