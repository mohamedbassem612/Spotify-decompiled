package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x5k implements Parcelable {
    public static final Parcelable.Creator<x5k> CREATOR = new v6h((byte) 13);
    public final String a;
    public final ArrayList b;

    public x5k(String str, ArrayList arrayList) {
        this.a = str;
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
        if (!(obj instanceof x5k)) {
            return false;
        }
        x5k x5kVar = (x5k) obj;
        return u890.j(this.a, x5kVar.a) && this.b.equals(x5kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((p5k) itO.next()).writeToParcel(parcel, i);
        }
    }
}
