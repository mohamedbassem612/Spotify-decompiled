package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h3f1 implements Parcelable {
    public static final Parcelable.Creator<h3f1> CREATOR = new lse1((byte) 26);
    public final tcx0 a;
    public final ArrayList b;

    public h3f1(tcx0 tcx0Var, ArrayList arrayList) {
        this.a = tcx0Var;
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
        if (!(obj instanceof h3f1)) {
            return false;
        }
        h3f1 h3f1Var = (h3f1) obj;
        return u890.j(this.a, h3f1Var.a) && this.b.equals(h3f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((o620) itO.next()).writeToParcel(parcel, i);
        }
    }
}
