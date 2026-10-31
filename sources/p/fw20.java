package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fw20 implements Parcelable {
    public static final Parcelable.Creator<fw20> CREATOR = new qe20((byte) 24);
    public final Map a;
    public final ArrayList b;

    public fw20(Map map, ArrayList arrayList) {
        this.a = map;
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
        if (!(obj instanceof fw20)) {
            return false;
        }
        fw20 fw20Var = (fw20) obj;
        return this.a.equals(fw20Var.a) && this.b.equals(fw20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
    }
}
