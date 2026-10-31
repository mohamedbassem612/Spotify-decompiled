package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kdm0 implements pdm0 {
    public static final Parcelable.Creator<kdm0> CREATOR = new w9k0((byte) 7);
    public final int a;
    public final ArrayList b;

    public kdm0(int i, ArrayList arrayList) {
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
        if (!(obj instanceof kdm0)) {
            return false;
        }
        kdm0 kdm0Var = (kdm0) obj;
        return this.a == kdm0Var.a && this.b.equals(kdm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeInt(((Number) itO.next()).intValue());
        }
    }
}
