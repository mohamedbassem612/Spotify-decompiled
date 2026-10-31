package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ti70 extends hj70 {
    public static final Parcelable.Creator<ti70> CREATOR = new ai70((byte) 16);
    public final ArrayList c;
    public final fj70 d;

    public ti70(ArrayList arrayList, fj70 fj70Var) {
        super(16, 1);
        this.c = arrayList;
        this.d = fj70Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti70)) {
            return false;
        }
        ti70 ti70Var = (ti70) obj;
        return this.c.equals(ti70Var.c) && u890.j(this.d, ti70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((nj70) itO.next()).writeToParcel(parcel, i);
        }
        this.d.writeToParcel(parcel, i);
    }
}
