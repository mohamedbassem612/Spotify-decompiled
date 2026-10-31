package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zv11 implements Parcelable {
    public static final Parcelable.Creator<zv11> CREATOR = new e211((byte) 9);
    public final cxn a;
    public final Set b;

    public zv11(cxn cxnVar, Set set) {
        this.a = cxnVar;
        this.b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv11)) {
            return false;
        }
        zv11 zv11Var = (zv11) obj;
        return u890.j(this.a, zv11Var.a) && u890.j(this.b, zv11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itH = k4s0.h(this.b, parcel);
        while (itH.hasNext()) {
            ((m620) itH.next()).writeToParcel(parcel, i);
        }
    }
}
