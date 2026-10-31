package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ryb extends azb {
    public static final Parcelable.Creator<ryb> CREATOR = new mra((byte) 23);
    public final int a;
    public final ArrayList b;

    public ryb(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryb)) {
            return false;
        }
        ryb rybVar = (ryb) obj;
        return this.a == rybVar.a && this.b.equals(rybVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeInt(((Number) itO.next()).intValue());
        }
    }
}
