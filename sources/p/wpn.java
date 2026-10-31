package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wpn implements ypn {
    public static final Parcelable.Creator<wpn> CREATOR = new upn((byte) 2);
    public final g3d0 a;
    public final Set b;

    public wpn(Set set, g3d0 g3d0Var) {
        this.a = g3d0Var;
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
        if (!(obj instanceof wpn)) {
            return false;
        }
        wpn wpnVar = (wpn) obj;
        return u890.j(this.a, wpnVar.a) && u890.j(this.b, wpnVar.b);
    }

    public final int hashCode() {
        g3d0 g3d0Var = this.a;
        return this.b.hashCode() + ((g3d0Var == null ? 0 : g3d0Var.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itH = k4s0.h(this.b, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
    }
}
