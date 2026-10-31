package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dsm1 implements esm1 {
    public static final Parcelable.Creator<dsm1> CREATOR = new ynm1((byte) 4);
    public final ArrayList a;
    public final zha1 b;

    public dsm1(ArrayList arrayList, zha1 zha1Var) {
        this.a = arrayList;
        this.b = zha1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsm1)) {
            return false;
        }
        dsm1 dsm1Var = (dsm1) obj;
        return this.a.equals(dsm1Var.a) && this.b == dsm1Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zha1 zha1Var = this.b;
        return iHashCode + (zha1Var == null ? 0 : zha1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            parcel.writeString(((zha1) itO.next()).name());
        }
        zha1 zha1Var = this.b;
        if (zha1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(zha1Var.name());
        }
    }
}
